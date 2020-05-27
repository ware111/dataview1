package com.eeo.entity;

public class Participants {
    private String ShowName;
    private int Uid;
    private int Identity;
    private int RecvQuestionTime;
    private int LastCommitTime;

    public String getShowName() {
        return ShowName;
    }

    public void setShowName(String showName) {
        ShowName = showName;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public int getIdentity() {
        return Identity;
    }

    public void setIdentity(int identity) {
        Identity = identity;
    }

    public int getRecvQuestionTime() {
        return RecvQuestionTime;
    }

    public void setRecvQuestionTime(int recvQuestionTime) {
        RecvQuestionTime = recvQuestionTime;
    }

    public int getLastCommitTime() {
        return LastCommitTime;
    }

    public void setLastCommitTime(int lastCommitTime) {
        LastCommitTime = lastCommitTime;
    }
}
