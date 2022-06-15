package com.example.datvexekhach;

public class GheXe {
    private String maGhe;
    private boolean trangThaiGhe;

    public GheXe(String maGhe, boolean trangThaiGhe) {
        this.maGhe = maGhe;
        this.trangThaiGhe = trangThaiGhe;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public boolean isTrangThaiGhe() {
        return trangThaiGhe;
    }

    public void setTrangThaiGhe(boolean trangThaiGhe) {
        this.trangThaiGhe = trangThaiGhe;
    }
}
