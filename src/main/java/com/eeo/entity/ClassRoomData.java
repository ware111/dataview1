package com.eeo.entity;

import com.sun.javafx.beans.IDProperty;

import javax.enterprise.inject.Default;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassRoomData {

    private int flag;
    private String dateTime;
    private long UID;
    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUID() {
        return UID;
    }

    public void setUID(long UID) {
        this.UID = UID;
    }

    public String getDateTime() {
        return dateTime;
    }


    public void setDateTime(String dataTime) {
        this.dateTime = dataTime;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    private long ClassID;
    public long getClassID() {
        return ClassID;
    }

    public void setClassID(long classID) {
        ClassID = classID;
    }

    @Override
    public String toString() {
        return ClassID+"\t"+UID+"\t"+dateTime+"\t"+flag;
    }
}
