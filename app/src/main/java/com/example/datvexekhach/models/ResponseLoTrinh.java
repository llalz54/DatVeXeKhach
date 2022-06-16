package com.example.datvexekhach.models;

public class ResponseLoTrinh {
    private String ma;
    private String ten;
    private String noiDi;
    private String noiDen;
    private int khoangCach;

    public ResponseLoTrinh(String ma, String ten, String noiDi, String noiDen, int khoangCach) {
        this.ma = ma;
        this.ten = ten;
        this.noiDi = noiDi;
        this.noiDen = noiDen;
        this.khoangCach = khoangCach;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public int getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(int khoangCach) {
        this.khoangCach = khoangCach;
    }

    public String noiDiNoiDen() {
        return noiDi + " - " + noiDen;
    }
}
