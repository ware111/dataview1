package com.eeo.entity;

//包含教室内各类消息汇总
public class ClassDataCollectData {

    private StageEnd stageEnd;

    class HandsupEnd {
        class UID{
            private long CTime;
            private int Total;

            public long getCTime() {
                return CTime;
            }

            public void setCTime(long CTime) {
                this.CTime = CTime;
            }

            public int getTotal() {
                return Total;
            }

            public void setTotal(int total) {
                Total = total;
            }
        }
    }

    class InoutEnd{
        class UID{
            private long Total;
            private Detail[] Details;
            private int Identity;

            public long getTotal() {
                return Total;
            }

            public void setTotal(long total) {
                Total = total;
            }

            public Detail[] getDetails() {
                return Details;
            }

            public void setDetails(Detail[] details) {
                Details = details;
            }

            public int getIdentity() {
                return Identity;
            }

            public void setIdentity(int identity) {
                Identity = identity;
            }

            class Detail{
                private String Type;
                private long Time;

                public String getType() {
                    return Type;
                }

                public void setType(String type) {
                    Type = type;
                }

                public long getTime() {
                    return Time;
                }

                public void setTime(long time) {
                    Time = time;
                }
            }
        }
    }
}
