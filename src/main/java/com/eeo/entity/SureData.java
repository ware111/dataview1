package com.eeo.entity;

public class SureData {

    private ErrorInfo error_info;
    private ClassInData data;

    public ClassInData getData() {
        return data;
    }

    public void setData(ClassInData data) {
        this.data = data;
    }

    public ErrorInfo getError_info() {
        return error_info;
    }

    public void setError_info(ErrorInfo error_info) {
        this.error_info = error_info;
    }
}
