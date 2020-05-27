package com.eeo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Thur panhm
 * 时间戳工具
 * */
public class HourUnixUtils {

    /**
     *
     * @return 返回当前整点时间的时间戳，秒级
     *
     * */
    public static long getHourUnixStamp(){
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH"));
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH").parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long timestamp = date.getTime()/1000;
        return timestamp;
    }
}
