package com.eeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InOutClassData {

    @Id
    private int id;
    private long ClassID;
    private long timeStamp;
    private int flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
