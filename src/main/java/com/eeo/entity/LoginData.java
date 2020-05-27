package com.eeo.entity;

public class LoginData {
    private String Telephone;
    private int LoginTime;
    private String Nickname;

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public int getLoginTime() {
        return LoginTime;
    }

    public void setLoginTime(int loginTime) {
        LoginTime = loginTime;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }
}
