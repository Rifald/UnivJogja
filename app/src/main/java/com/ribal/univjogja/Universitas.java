package com.ribal.univjogja;

public class Universitas {
    String nama,alamat,desc,screenshot;
    int picture;

    public Universitas(String nama, String alamat, String desc,String screenshot, int picture) {
        this.nama = nama;
        this.alamat = alamat;
        this.desc = desc;
        this.screenshot = screenshot;
        this.picture = picture;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
