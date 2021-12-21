package com.example.intro;

public class SituationList {
    int imgid;
    String text;

    public SituationList(int imgid, String text) {
        this.imgid = imgid;
        this.text = text;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
