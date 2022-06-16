package com.example.datvexekhach.models;

public class ResponseChuyenXe {
    private String maCX;
    private String noiDi;
    private String noiDen;
    private String ngayDi;
    private int khoangcach;
    private int maXe;
    private String maLT;
    private float gia;

    public ResponseChuyenXe(String maCX, String noiDi, String noiDen, String ngayDi, int khoangcach, int maXe, String maLT, float gia) {
        this.maCX = maCX;
        this.noiDi = noiDi;
        this.noiDen = noiDen;
        this.ngayDi = ngayDi;
        this.khoangcach = khoangcach;
        this.maXe = maXe;
        this.maLT = maLT;
        this.gia = gia;
    }

    public String getMaCX() {
        return maCX;
    }

    public void setMaCX(String maCX) {
        this.maCX = maCX;
    }

    public String getNoiDi() {
        return noiDi;
    }

    public void setNoiDi(String noiDi) {
        this.noiDi = noiDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public String getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    public int getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(int khoangcach) {
        this.khoangcach = khoangcach;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public String getMaLT() {
        return maLT;
    }

    public void setMaLT(String maLT) {
        this.maLT = maLT;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
}
