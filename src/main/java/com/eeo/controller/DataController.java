package com.eeo.controller;

import com.eeo.repository.RealClassRoomRepository;
import com.eeo.service.ClassRoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DataController {

    @Autowired
    BufferedWriter[] inWriter;

    public static Logger logger = LoggerFactory.getLogger(DataController.class);

    @Autowired
    ClassRoomService roomService;

    @Autowired
    RealClassRoomRepository userRepository;

    @GetMapping("/classRoomData")
    public String getClassRoom() throws IOException {
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        int[] classRoomByDateTime = roomService.find24ClassRoom();
        for (int i : classRoomByDateTime) {
            logger.info(i+"");
            inWriter[3].append(i + "***************");
        }
        inWriter[3].flush();
        return "index";
    }
}
