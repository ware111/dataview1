package com.eeo.entity;

public class ClassInData {
    private long SID;
    private long CouseId;
    private long ClassID;
    private String Cmd;
    private long CloseTime;
    private long StartTime;
    private String _id;
    private long TimeStamp;
    private String SafeKey;
    private HandUpsData handUpsData;
    private AwardData awardData;
    private SureData sureData;

    public SureData getSureData() {
        return sureData;
    }

    public void setSureData(SureData sureData) {
        this.sureData = sureData;
    }

    public HandUpsData getHandUpsData() {
        return handUpsData;
    }

    public void setHandUpsData(HandUpsData handUpsData) {
        this.handUpsData = handUpsData;
    }

    public AwardData getAwardData() {
        return awardData;
    }

    public void setAwardData(AwardData awardData) {
        this.awardData = awardData;
    }

    public long getSID() {
        return SID;
    }

    public void setSID(long SID) {
        this.SID = SID;
    }

    public long getCouseId() {
        return CouseId;
    }

    public void setCouseId(long couseId) {
        CouseId = couseId;
    }

    public long getClassID() {
        return ClassID;
    }

    public void setClassID(long classID) {
        ClassID = classID;
    }

    public String getCmd() {
        return Cmd;
    }

    public void setCmd(String cmd) {
        Cmd = cmd;
    }

    public long getCloseTime() {
        return CloseTime;
    }

    public void setCloseTime(long closeTime) {
        CloseTime = closeTime;
    }

    public long getStartTime() {
        return StartTime;
    }

    public void setStartTime(long startTime) {
        StartTime = startTime;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public long getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        TimeStamp = timeStamp;
    }

    public String getSafeKey() {
        return SafeKey;
    }

    public void setSafeKey(String safeKey) {
        SafeKey = safeKey;
    }
}
