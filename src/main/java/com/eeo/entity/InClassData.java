package com.eeo.entity;

//进入教室
public class InClassData {

    private String dateTime;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    private String NickName;
    private int AllowEnterTime;
    private int UID;
    private String LoginMobile;
    private int Identity;
    private int Device;
    private long SID;
    private long CouseId;
    private long ClassID;
    private int Cmd;
    private long CloseTime;
    private long StartTime;
    private String _id;
    private long TimeStamp;
    private String SafeKey;
    private HandUpsData handUpsData;
    private AwardData awardData;
    private SureData sureData;

    public void setCmd(int cmd) {
        Cmd = cmd;
    }

    public int getCmd() {
        return Cmd;
    }

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
        return ClassID+"\t"+UID+"\t"+dateTime+"\t"+Cmd+"\t"+NickName+"\t"+AllowEnterTime+"\t"+LoginMobile+"\t"+Identity+"\t"+Device+"\n";
    }
}
