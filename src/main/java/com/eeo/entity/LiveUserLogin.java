package com.eeo.entity;

//直播页面用户登录
public class LiveUserLogin {

    private int ClassID;
    private LoginData Data;

    public int getClassID() {
        return ClassID;
    }

    public void setClassID(int classID) {
        ClassID = classID;
    }

    public LoginData getData() {
        return Data;
    }

    public void setData(LoginData data) {
        Data = data;
    }
}
