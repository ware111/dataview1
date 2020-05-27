package com.eeo.service;

import java.text.ParseException;

//实时在线学生人数
public interface StudentService {
    int findNowStudent();

    int findDayStudent() throws ParseException;
}
