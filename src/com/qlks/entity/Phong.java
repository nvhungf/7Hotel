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
public class Phong {
    String maPhong;
    double donGia;
    double donGiaTheoGio;
    String maLoai;
    String ghiChu;

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGiaTheoGio() {
        return donGiaTheoGio;
    }

    public void setDonGiaTheoGio(double donGiaTheoGio) {
        this.donGiaTheoGio = donGiaTheoGio;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Phong(String maPhong, double donGia, double donGiaTheoGio, String maLoai, String ghiChu) {
        this.maPhong = maPhong;
        this.donGia = donGia;
        this.donGiaTheoGio = donGiaTheoGio;
        this.maLoai = maLoai;
        this.ghiChu = ghiChu;
    }

    public Phong() {
    }
}
