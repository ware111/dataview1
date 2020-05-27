package com.eeo.entity;

public class ClassData {

    private String dateTime;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    private int UID;
    private int Reason;
    private long SID;
    private String NickName;
    private int AllowEnterTime;
    private String LoginMobile;
    private int Identity;
    private int Device;
    private long CouseId;

    public int getReason() {
        return Reason;
    }

    public void setReason(int reason) {
        Reason = reason;
    }

    private long ClassID;
    private int Cmd;
    private long CloseTime;
    private long StartTime;
    private String _id;
    private long TimeStamp;
    private String SafeKey;

    public void setCmd(int cmd) {
        Cmd = cmd;
    }

    public int getCmd() {
        return Cmd;
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
    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public int getAllowEnterTime() {
        return AllowEnterTime;
    }

    public void setAllowEnterTime(int allowEnterTime) {
        AllowEnterTime = allowEnterTime;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getLoginMobile() {
        return LoginMobile;
    }

    public void setLoginMobile(String loginMobile) {
        LoginMobile = loginMobile;
    }

    public int getIdentity() {
        return Identity;
    }

    public void setIdentity(int identity) {
        Identity = identity;
    }

    public int getDevice() {
        return Device;
    }

    public void setDevice(int device) {
        Device = device;
    }

    @Override
    public String toString() {
        return ClassID+"\t"+UID+"\t"+dateTime+"\t"+Cmd+"\t"+Identity+"\t"+Reason+"\t"+NickName+"\t"+AllowEnterTime+"\t"+
                LoginMobile+"\t"+Identity+"\t"+Device+"\t"+StartTime+"\t"+CloseTime+"\n";
    }
}
