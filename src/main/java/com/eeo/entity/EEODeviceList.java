package com.eeo.entity;

public class EEODeviceList {
    String[] camera;
    String[] micphone;
    String[] speaker;

    public String[] getCamera() {
        return camera;
    }

    public void setCamera(String[] camera) {
        this.camera = camera;
    }

    public String[] getMicphone() {
        return micphone;
    }

    public void setMicphone(String[] micphone) {
        this.micphone = micphone;
    }

    public String[] getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String[] speaker) {
        this.speaker = speaker;
    }
}
