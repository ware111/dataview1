package com.eeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DayStudents {

    @Id
    private int id;
    private long classID;
    private int UID;
    private long timeStamp;

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
