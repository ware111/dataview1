package com.eeo.entity;

//师生求助内容
public class HelpContent {
    private int UID;
    private String Message;
    private int[] UserList;

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int[] getUserList() {
        return UserList;
    }

    public void setUserList(int[] userList) {
        UserList = userList;
    }
}
