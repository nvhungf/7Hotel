/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlks.entity;

/**
 *
 * @author Administrator
 */
public class HoaDon {

    int maHD;
    String MaPhong;
    String NgayThue;
    String ngayTra;
    String TenKH;
    double TongTien;

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getNgayThue() {
        return NgayThue;
    }

    public void setNgayThue(String NgayThue) {
        this.NgayThue = NgayThue;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public HoaDon(int maHD, String MaPhong, String NgayThue, String ngayTra, String TenKH, double TongTien) {
        this.maHD = maHD;
        this.MaPhong = MaPhong;
        this.NgayThue = NgayThue;
        this.ngayTra = ngayTra;
        this.TenKH = TenKH;
        this.TongTien = TongTien;
    }

    public HoaDon() {
    }

}
