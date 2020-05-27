package com.eeo.entity;

//教室内设备数据
public class DeviceData {
    private String OperatingSystem;
    private String CPU;
    private String NetworkDelay;
    private String FrameLoss;
    private String MicrophoneArbitrary;
    private String HeadphoneArbitrary;
    private String CameraArbitrary;
    private String EEO_VIDEO_DEVICE_NAME;
    private String EEO_AUDIO_DEVICE_NAME;
    private String EEO_AUDIO_OUTPUT_NAME;
    private EEODeviceList EEO_DEVICE_LIST;
    private int MicrophoneImpersonal;
    private int CameraImpersonal;
    private int HeadphoneImpersonal;
    private int MicrophoneAttachment;
    private String HeadphoneAttachment;
    private String CameraAttachment;
    private String ClassInVersion;
    private String Mac;
    private String addTime;
    private int InfoSource;
    private int DeviceType;
    private String ClientIP;

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getNetworkDelay() {
        return NetworkDelay;
    }

    public void setNetworkDelay(String networkDelay) {
        NetworkDelay = networkDelay;
    }

    public String getFrameLoss() {
        return FrameLoss;
    }

    public void setFrameLoss(String frameLoss) {
        FrameLoss = frameLoss;
    }

    public String getMicrophoneArbitrary() {
        return MicrophoneArbitrary;
    }

    public void setMicrophoneArbitrary(String microphoneArbitrary) {
        MicrophoneArbitrary = microphoneArbitrary;
    }

    public String getHeadphoneArbitrary() {
        return HeadphoneArbitrary;
    }

    public void setHeadphoneArbitrary(String headphoneArbitrary) {
        HeadphoneArbitrary = headphoneArbitrary;
    }

    public String getCameraArbitrary() {
        return CameraArbitrary;
    }

    public void setCameraArbitrary(String cameraArbitrary) {
        CameraArbitrary = cameraArbitrary;
    }

    public String getEEO_VIDEO_DEVICE_NAME() {
        return EEO_VIDEO_DEVICE_NAME;
    }

    public void setEEO_VIDEO_DEVICE_NAME(String EEO_VIDEO_DEVICE_NAME) {
        this.EEO_VIDEO_DEVICE_NAME = EEO_VIDEO_DEVICE_NAME;
    }

    public String getEEO_AUDIO_DEVICE_NAME() {
        return EEO_AUDIO_DEVICE_NAME;
    }

    public void setEEO_AUDIO_DEVICE_NAME(String EEO_AUDIO_DEVICE_NAME) {
        this.EEO_AUDIO_DEVICE_NAME = EEO_AUDIO_DEVICE_NAME;
    }

    public String getEEO_AUDIO_OUTPUT_NAME() {
        return EEO_AUDIO_OUTPUT_NAME;
    }

    public void setEEO_AUDIO_OUTPUT_NAME(String EEO_AUDIO_OUTPUT_NAME) {
        this.EEO_AUDIO_OUTPUT_NAME = EEO_AUDIO_OUTPUT_NAME;
    }

    public EEODeviceList getEEO_DEVICE_LIST() {
        return EEO_DEVICE_LIST;
    }

    public void setEEO_DEVICE_LIST(EEODeviceList EEO_DEVICE_LIST) {
        this.EEO_DEVICE_LIST = EEO_DEVICE_LIST;
    }

    public int getMicrophoneImpersonal() {
        return MicrophoneImpersonal;
    }

    public void setMicrophoneImpersonal(int microphoneImpersonal) {
        MicrophoneImpersonal = microphoneImpersonal;
    }

    public int getCameraImpersonal() {
        return CameraImpersonal;
    }

    public void setCameraImpersonal(int cameraImpersonal) {
        CameraImpersonal = cameraImpersonal;
    }

    public int getHeadphoneImpersonal() {
        return HeadphoneImpersonal;
    }

    public void setHeadphoneImpersonal(int headphoneImpersonal) {
        HeadphoneImpersonal = headphoneImpersonal;
    }

    public int getMicrophoneAttachment() {
        return MicrophoneAttachment;
    }

    public void setMicrophoneAttachment(int microphoneAttachment) {
        MicrophoneAttachment = microphoneAttachment;
    }

    public String getHeadphoneAttachment() {
        return HeadphoneAttachment;
    }

    public void setHeadphoneAttachment(String headphoneAttachment) {
        HeadphoneAttachment = headphoneAttachment;
    }

    public String getCameraAttachment() {
        return CameraAttachment;
    }

    public void setCameraAttachment(String cameraAttachment) {
        CameraAttachment = cameraAttachment;
    }

    public String getClassInVersion() {
        return ClassInVersion;
    }

    public void setClassInVersion(String classInVersion) {
        ClassInVersion = classInVersion;
    }

    public String getMac() {
        return Mac;
    }

    public void setMac(String mac) {
        Mac = mac;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public int getInfoSource() {
        return InfoSource;
    }

    public void setInfoSource(int infoSource) {
        InfoSource = infoSource;
    }

    public int getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(int deviceType) {
        DeviceType = deviceType;
    }

    public String getClientIP() {
        return ClientIP;
    }

    public void setClientIP(String clientIP) {
        ClientIP = clientIP;
    }
}
