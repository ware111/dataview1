package com.eeo.entity;

public class StageEnd {

    class UID {
        private int DownCount;
        private int DownTotal;
        private int UpCount;
        private int UpTotal;

        public int getDownCount() {
            return DownCount;
        }

        public void setDownCount(int downCount) {
            DownCount = downCount;
        }

        public int getDownTotal() {
            return DownTotal;
        }

        public void setDownTotal(int downTotal) {
            DownTotal = downTotal;
        }

        public int getUpCount() {
            return UpCount;
        }

        public void setUpCount(int upCount) {
            UpCount = upCount;
        }

        public int getUpTotal() {
            return UpTotal;
        }

        public void setUpTotal(int upTotal) {
            UpTotal = upTotal;
        }
    }

}
