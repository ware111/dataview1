package com.eeo.entity;

public class Test {

    String SID;
    String Cmd;
    String Msg;
    String SafeKey;
    long TimeStamp;

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getCmd() {
        return Cmd;
    }

    public void setCmd(String cmd) {
        Cmd = cmd;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getSafeKey() {
        return SafeKey;
    }

    public void setSafeKey(String safeKey) {
        SafeKey = safeKey;
    }

    public long getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        TimeStamp = timeStamp;
    }
}
