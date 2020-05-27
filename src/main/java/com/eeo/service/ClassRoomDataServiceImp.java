package com.eeo.service;

import com.eeo.entity.ClassRoomData;
import com.eeo.entity.RealTimeClassRoom;
import com.eeo.repository.RealClassRoomRepository;
import com.eeo.util.HourUnixUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Service
public class ClassRoomDataServiceImp implements ClassRoomService {

    @Autowired
    RealClassRoomRepository repository;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public int[] find24ClassRoom() {
        long native24ClassRoom = System.currentTimeMillis() / 1000 - 24 * 60 * 60;
        long currentUnixStamp = HourUnixUtils.getHourUnixStamp();
        long[] unixStamps = new long[24];
        int[] size = new int[24];
        for (int i = 0; i < 24; i++){
            unixStamps[i] = currentUnixStamp-3600*i;
            String SQL ="select * from real_time_class_room where time_stamp ="+unixStamps[i];
            size[i] = entityManager.createNativeQuery(SQL, RealTimeClassRoom.class).getResultList().size();
        }
        return size;
    }

    @Override
    public int[] find30ClassRoom() {
        long native24ClassRoom = System.currentTimeMillis() / 1000 - 30*24 * 60 * 60;
        long currentUnixStamp = HourUnixUtils.getHourUnixStamp();
        long[] unixStamps = new long[24];
        int[] size = new int[24];
        for (int i = 0; i < 24; i++){
            unixStamps[i] = currentUnixStamp-3600*i;
            String SQL ="select * from class_room_data where start_time ="+unixStamps;
            size[i] = entityManager.createNativeQuery(SQL, ClassRoomData.class).getResultList().size();
        }
        return size;
    }
}
