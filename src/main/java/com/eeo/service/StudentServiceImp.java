package com.eeo.service;

import com.eeo.repository.DayStudenttRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class StudentServiceImp implements StudentService {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    DayStudenttRepository dayStudenttRepository;

    @Override
    public int findNowStudent() {
        Object studentCount = entityManager.createNativeQuery("select sum(flag) from students").getResultList().get(0);
        return Integer.valueOf(studentCount+"");
    }

    @Override
    public int findDayStudent() throws ParseException {
        SimpleDateFormat dateTime11 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat date11 = new SimpleDateFormat("yyyy-MM-dd");
        String format11 = date11.format(new Date());
        Date startTime = dateTime11.parse(format11 + " 00:00:00");
        long times = startTime.getTime();
        long dayStudentCount = dayStudenttRepository.count();
        return 0;
    }
}
