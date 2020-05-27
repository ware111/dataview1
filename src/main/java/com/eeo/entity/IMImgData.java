package com.eeo.entity;

//IM图片数据
public class IMImgData {
    private int Type;
    private String Content;
    private int EmoteType;

    public int getEmoteType() {
        return EmoteType;
    }

    public void setEmoteType(int emoteType) {
        EmoteType = emoteType;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
