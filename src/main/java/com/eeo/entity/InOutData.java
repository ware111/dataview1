package com.eeo.entity;

//计算实时在线的教师/学生/教室数
public class InOutData {
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    private String dateTime;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    private int Cmd;
    private int Identity;

    public int getCmd() {
        return Cmd;
    }

    public void setCmd(int cmd) {
        Cmd = cmd;
    }

    public int getIdentity() {
        return Identity;
    }

    public void setIdentity(int identity) {
        Identity = identity;
    }

    @Override
    public String toString() {
        return Cmd+"\t"+Identity+"\t"+dateTime+"\t"+flag+"\t"+"blank"+"\n";
    }
}
