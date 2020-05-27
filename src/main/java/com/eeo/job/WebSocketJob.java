package com.eeo.job;

import com.eeo.socket.*;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.websocket.Session;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArraySet;


@EnableScheduling
@Component
public class WebSocketJob {

    @PersistenceContext
    EntityManager entityManager;

    @Async(value = "taskPoolExecutor")
    @Scheduled(cron = "*/5 * * * * ?")
    public void dayTeacherJob() throws InterruptedException, IOException, ParseException {
//        KafkaConsumer<String, String> consumer;
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "node01:9092,node02:9092,node03:9092");
//        props.put("group.id", "test");
//        props.put("enable.auto.commit", "true");
//        props.put("auto.commit.interval.ms", "1000");
//        props.put("session.timeout.ms", "30000");
//        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        consumer = new KafkaConsumer<String, String>(props);
//        ArrayList<String> topics = new ArrayList<>();
//        topics.add("24ClassRoomCount");
//        topics.add("nowStudent");
//        topics.add("nowClassRoom");
//        topics.add("nowTeacher");
//        topics.add("dayStudent");
//        topics.add("dayTeacher");
//        topics.add("dayClassRoom");
//        consumer.subscribe(topics);

        //实时在线教室数
        CopyOnWriteArraySet<Session> webSessionSet1 = NowClassRoomSocketServer.getWebSessionSet();
        webSessionSet1.forEach(x -> {
            Query nativeQuery = entityManager.createNativeQuery("select count(*) from (select sum(flag) s from in_out_class_data group by classid) t where t.s > 0");
            Object o = nativeQuery.getResultList().get(0);
            synchronized (x) {
                try {
                    x.getBasicRemote().sendText(o + "");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        //当天在线教室数
        //Iterable<ConsumerRecord<String, String>> dayClassRoomRecords = records.records("dayClassRoom");
//                for (ConsumerRecord<String, String> record : dayClassRoomRecords) {
        //         System.out.println(record.value());
//                    String[] split = record.value().split("\t");
//                    System.out.println(record.value());
        CopyOnWriteArraySet<Session> webSessionSet11 = DayClassRoomSocketServer.getWebSessionSet();
        SimpleDateFormat dateTime11 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat date11 = new SimpleDateFormat("yyyy-MM-dd");
        String format11 = date11.format(new Date());
        Date startTime = dateTime11.parse(format11 + " 00:00:00");
        long times = startTime.getTime();
        int size = entityManager.createNativeQuery("select count(classid) from in_out_class_data where time_stamp >" + times/1000 + " and flag=1 group by classid").getResultList().size();
      //  System.out.println(size+"*****************");
        webSessionSet11.forEach(x -> {
            try {
                synchronized (x) {
                    x.getBasicRemote().sendText(""+size);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        //}


//            while (true) {
//
//
//
//
////                ConsumerRecords<String, String> records =consumer.poll(200);   // 本例使用200ms作为获取超时时间
////            //    System.out.println(records.count());
////                Iterable<ConsumerRecord<String, String>> hour24ClassRoomRecords = records.records("24ClassRoomCount");
////                for (ConsumerRecord<String, String> record : hour24ClassRoomRecords) {
////                    String[] split = record.value().split("\t");
//////                    // System.out.println(record.value()+"24ClassRoom");
////                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
////                    Date date = new Date(Long.valueOf(split[0]));
////                    String format = simpleDateFormat.format(date);
////                    CopyOnWriteArraySet<Session> webSessionSet = Hour10ClassRoomSocketServer.getWebSessionSet();
////                    webSessionSet.forEach(x -> {
////                        try {
////                            synchronized (x) {
////                                x.getBasicRemote().sendText(format + "\t" + split[1]);
//////                            x.sendMsg(format+"\t"+split[1]);
////                            }
////                        } catch (IOException e) {
////                            e.printStackTrace();
////                        }
////                    });
////                }
////                Iterable<ConsumerRecord<String, String>> dayClassRoomRecords = records.records("dayClassRoom");
////                for (ConsumerRecord<String, String> record : dayClassRoomRecords) {
////           //         System.out.println(record.value());
////                    String[] split = record.value().split("\t");
////                    System.out.println(record.value());
////                    CopyOnWriteArraySet<Session> webSessionSet = DayClassRoomSocketServer.getWebSessionSet();
////                    webSessionSet.forEach(x -> {
////                        try {
////                            synchronized (x) {
////                                x.getBasicRemote().sendText(split[1]);
////                            }
////                        } catch (IOException e) {
////                            e.printStackTrace();
////                        }
////                    });
////                }
////
////                Iterable<ConsumerRecord<String, String>> dayStudentRecords = records.records("dayStudent");
////
////                for (ConsumerRecord<String, String> record : dayStudentRecords) {
////                    String[] split = record.value().split("\t");
////                    //    System.out.println(record.value());
////                    CopyOnWriteArraySet<Session> webSessionSet = DayStudentSocketServer.getWebSessionSet();
////                    webSessionSet.forEach(x -> {
////                        try {
////                                synchronized (x) {
////                                    x.getBasicRemote().sendText(split[2]);
////                                }
////
////                        } catch (IOException e) {
////                            e.printStackTrace();
////                        }
////                    });
////                }
////
////                Iterable<ConsumerRecord<String, String>> dayTeacherRecords = records.records("dayTeacher");
////                for (ConsumerRecord<String, String> record : dayTeacherRecords) {
////                    String[] split = record.value().split("\t");
////                    CopyOnWriteArraySet<Session> webSessionSet = DayTeacherSocketServer.getWebSessionSet();
////                    webSessionSet.forEach(x -> {
////                        try {
////                                synchronized (x) {
////                                    x.getBasicRemote().sendText(split[2]);
////                                }
////                        } catch (IOException e) {
////                            e.printStackTrace();
////                        }
////                    });
////                }
////
////
////                Iterable<ConsumerRecord<String, String>> nowClassRoom = records.records("nowClassRoom");
////                CopyOnWriteArraySet<Session> webSessionSet2 = NowClassRoomSocketServer.getWebSessionSet();
////                for (ConsumerRecord<String, String> record : nowClassRoom) {
////                    String[] split = record.value().split("\t");
////                    CopyOnWriteArraySet<Session> webSessiontSet = NowStudentSocketServer.getWebSessionSet();
////                    webSessionSet2.forEach(x -> {
//////                Query nativeQuery = entityManager.createNativeQuery("select count(*) from (select sum(flag) s from in_out_class_data group by classid) t where t.s > 0");
//////                System.out.println(nativeQuery+"*********************************************************************"+nativeQuery.getResultList().get(0));
////
////                        synchronized (x) {
////                            try {
////                                x.getBasicRemote().sendText(split[1]+"");
////                            } catch (IOException e) {
////                                e.printStackTrace();
////                            }
////                        }
////                    });
////                }
////
////
////                Iterable<ConsumerRecord<String, String>> nowStudentRecords = records.records("nowStudent");
////
////                for (ConsumerRecord<String, String> record : nowStudentRecords) {
////                    String[] split = record.value().split("\t");
////                    CopyOnWriteArraySet<Session> webSessiontSet = NowStudentSocketServer.getWebSessionSet();
////                    webSessiontSet.forEach(x -> {
////                        try {
////                                synchronized (x) {
////                                    x.getBasicRemote().sendText(split[1]);
////                                }
////
////                        } catch (IOException e) {
////                            e.printStackTrace();
////                        }
////                    });
////                }
////
////                Iterable<ConsumerRecord<String, String>> nowTeacherRecords = records.records("nowTeacher");
////
////                for (ConsumerRecord<String, String> record : nowTeacherRecords) {
////                String[] split = record.value().split("\t");
////                CopyOnWriteArraySet<Session> webSessionSet = NowTeacherSocketServer.getWebSessionSet();
////                    webSessionSet.forEach(x -> {
////                    try {
////                            synchronized (x) {
////                                x.getBasicRemote().sendText(split[1]);
////                            }
////
////                    } catch (IOException e) {
////                        e.printStackTrace();
////                    }
////                });
////            }
//
//            }
    }
}
