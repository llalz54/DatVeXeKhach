package com.example.datvexekhach.models;

public class GheXe {
    private String maGhe;
    private int trangThaiGhe;

    public GheXe(String maGhe, int trangThaiGhe) {
        this.maGhe = maGhe;
        this.trangThaiGhe = trangThaiGhe;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public int isTrangThaiGhe() {
        return trangThaiGhe;
    }

    public void setTrangThaiGhe(int trangThaiGhe) {
        this.trangThaiGhe = trangThaiGhe;
    }
}
