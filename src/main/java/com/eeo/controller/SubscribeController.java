package com.eeo.controller;





import com.alibaba.fastjson.JSONObject;
import com.eeo.entity.*;
import com.eeo.repository.ClassRoomDataRepository;
import com.eeo.repository.InOutClassDataRepository;
import com.eeo.repository.RealClassRoomRepository;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Properties;


@Controller
public class SubscribeController {


    Logger logger = LoggerFactory.getLogger(SubscribeController.class);

    @Autowired
    BufferedWriter[] inWriter;

    @Autowired
    RealClassRoomRepository repository;

    @Autowired
    ClassRoomDataRepository roomDataRepository;

    @Autowired
    InOutClassDataRepository inOutClassDataRepository;

    @PersistenceContext
    EntityManager entityManager;


    @ResponseBody
    @PostMapping(value = "/sendData")
    public SureData getDatas(@RequestBody String datas) throws IOException {
        logger.info(datas);
        inWriter[3].append(datas);
        inWriter[3].flush();
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        SureData sureData = new SureData();
        Properties properties = new Properties();
        properties.put("bootstrap.servers","node01:9092,node02:9092,node03:9092");
        properties.put("acks","all");
        properties.put("retries",0);
        properties.put("batch.size",16384);
        properties.put("buffer.memory",33554432);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        if (!datas.contains("Test")) {
            ClassData classData = JSONObject.parseObject(datas, ClassData.class);
            InOutData inOutData = new InOutData();
            ClassRoomData classRoomData = new ClassRoomData();
            if (datas.contains("67371107") || datas.contains("67371111")) {
//            logger.info("活跃教室");
                InOutClassData inOutClassData = new InOutClassData();
                RealTimeClassRoom realTimeClassRoom = new RealTimeClassRoom();
                classRoomData.setClassID(classData.getClassID());
                classRoomData.setUID(classData.getUID());
                classRoomData.setDateTime(dateTime);
                inOutClassData.setTimeStamp(classData.getTimeStamp());
                inOutClassData.setClassID(classData.getClassID());
                if (datas.contains("67371107")) {
                    inOutClassData.setFlag(1);
                    classRoomData.setFlag(1);
                    inOutClassDataRepository.save(inOutClassData);
                } else if(datas.contains("67371111")){
                    classRoomData.setFlag(-1);
                    inOutClassData.setFlag(-1);
                    inOutClassDataRepository.save(inOutClassData);
                }
                realTimeClassRoom.setClassID(classData.getClassID());
                realTimeClassRoom.setTimeStamp(classData.getTimeStamp());

                boolean b = repository.existsById(classData.getClassID());
                if (b == false) {
                    repository.save(realTimeClassRoom);
                    SimpleDateFormat time = new SimpleDateFormat("HHmmss");
                    String format = time.format(new Date(Long.valueOf(realTimeClassRoom.getTimeStamp())));
                    KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
                    ProducerRecord<String, String> record = new ProducerRecord<>("24ClassRoom", realTimeClassRoom.toString());
                    producer.send(record);
                }
//                KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
//                ProducerRecord<String, String> classRoomRecord = new ProducerRecord<>("classRoom", classRoomData.toString());
//                producer.send(classRoomRecord);
               // System.out.println(classRoomData.toString());
            }


            if (datas.contains("67371107")) {
//            logger.info("进入教室"+classData.getCmd());
                InClassData inClassData = JSONObject.parseObject(datas, InClassData.class);
                inClassData.setDateTime(dateTime);
                inWriter[0].append(inClassData.toString());
                inWriter[0].flush();
                inOutData.setCmd(inClassData.getCmd());
                inOutData.setIdentity(inClassData.getIdentity());
                inOutData.setDateTime(dateTime);
                inOutData.setFlag(1);
                Producer<String, String> producer = new KafkaProducer<String, String>(properties);
                ProducerRecord<String, String> record = new ProducerRecord<String, String>("inClassData", inClassData.toString());
                ProducerRecord<String, String> inOutRecord = new ProducerRecord<String, String>("inOutData", inOutData.toString());
                producer.send(record);
                producer.send(inOutRecord);
            } else {
//            logger.info("退出教室"+datas);
                OutClassData outClassData = JSONObject.parseObject(datas, OutClassData.class);
                outClassData.setDateTime(dateTime);
                inWriter[1].append(outClassData.toString());
                inWriter[1].flush();
                inOutData.setCmd(outClassData.getCmd());
                inOutData.setIdentity(outClassData.getIdentity());
                inOutData.setDateTime(dateTime);
                inOutData.setFlag(-1);
                Producer<String, String> producer = new KafkaProducer<String, String>(properties);
                ProducerRecord<String, String> record = new ProducerRecord<String, String>("outClassData", outClassData.toString());
                ProducerRecord<String, String> inOutRecord = new ProducerRecord<String, String>("inOutData", inOutData.toString());
                producer.send(record);
                producer.send(inOutRecord);
            }

            inWriter[2].append(inOutData.toString());
            inWriter[2].flush();
        }


//        logger.info(datas);
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setError("程序正常运行");
        errorInfo.setErrno(1);
        sureData.setError_info(errorInfo);
        return sureData;
    }

    @GetMapping(value = "test")
    public String test(){
//        ModelAndView md = new ModelAndView();
//        md.setViewName("test");
//        md.addObject("abc","templates/test :: html");

       // KafkaUtil.consumer();

        return "test";
    }

    @GetMapping(value = "view")
    public String view(){
//        ModelAndView md = new ModelAndView();
//        md.setViewName("view");
//        md.addObject("abc","templates/test :: html");
//
//        KafkaUtil.consumer();

        return "view";
    }



}
