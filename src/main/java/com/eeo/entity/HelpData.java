package com.eeo.entity;

//老师和学生求助数据
public class HelpData {
    private int ClassID;
    private HelpContent Data;

    public int getClassID() {
        return ClassID;
    }

    public void setClassID(int classID) {
        ClassID = classID;
    }

    public HelpContent getData() {
        return Data;
    }

    public void setData(HelpContent data) {
        Data = data;
    }
}
