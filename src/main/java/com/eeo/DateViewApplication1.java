package com.eeo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


@SpringBootApplication
public class DateViewApplication1{

    @Bean
	public BufferedWriter[] inWriter() throws FileNotFoundException {
        BufferedWriter[] bufferedWriters = new BufferedWriter[4];
        bufferedWriters[0] = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File("D:\\inClass.log")))));
        bufferedWriters[1] = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File("D:\\outClass.log")))));
        bufferedWriters[2] = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File("D:\\AllClassData.csv")))));
        bufferedWriters[3] = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File("D:\\AllData.log")))));
        return bufferedWriters;
	}

	public static void main(String[] args) {
		SpringApplication.run(DateViewApplication1.class, args);
	}

}
