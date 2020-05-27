package com.eeo.entity;

//延长课节时长
public class DelayCourseTime {

    private int StartTime;
    private int PrelectTimeLength;
    private int CloseClassDelay;

    public int getStartTime() {
        return StartTime;
    }

    public void setStartTime(int startTime) {
        StartTime = startTime;
    }

    public int getPrelectTimeLength() {
        return PrelectTimeLength;
    }

    public void setPrelectTimeLength(int prelectTimeLength) {
        PrelectTimeLength = prelectTimeLength;
    }

    public int getCloseClassDelay() {
        return CloseClassDelay;
    }

    public void setCloseClassDelay(int closeClassDelay) {
        CloseClassDelay = closeClassDelay;
    }
}
