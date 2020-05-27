package com.eeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RealTimeClassRoom {

    @Id
    private long ClassID;
    private long timeStamp;


    public long getClassID() {
        return ClassID;
    }

    public void setClassID(long classID) {
        ClassID = classID;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return ClassID+"\t"+timeStamp+"\t"+"1";
    }
}
