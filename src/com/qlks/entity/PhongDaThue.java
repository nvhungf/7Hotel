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
public class PhongDaThue {
    String maPhong;
    double giaPhong;
    String loaiPhong;
    String tenKH;
    String cmnd;
    String loaiThue;
    String soLuong;
    String ngayThue;

    public PhongDaThue() {
    }

    public PhongDaThue(String maPhong, double giaPhong, String loaiPhong, String tenKH, String cmnd, String loaiThue, String soLuong, String ngayThue) {
        this.maPhong = maPhong;
        this.giaPhong = giaPhong;
        this.loaiPhong = loaiPhong;
        this.tenKH = tenKH;
        this.cmnd = cmnd;
        this.loaiThue = loaiThue;
        this.soLuong = soLuong;
        this.ngayThue = ngayThue;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getLoaiThue() {
        return loaiThue;
    }

    public void setLoaiThue(String loaiThue) {
        this.loaiThue = loaiThue;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(String ngayThue) {
        this.ngayThue = ngayThue;
    }

    
}
