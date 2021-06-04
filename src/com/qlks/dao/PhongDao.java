/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlks.dao;

import com.qlks.entity.Phong;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PhongDao extends ketnoisql {

    public ArrayList<Phong> docPhong() {
        ArrayList<Phong> dsphong = new ArrayList<Phong>();
        try {
            String sql = "select * from Phong";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Phong ph = new Phong();
                ph.setMaPhong(rs.getString(1));
                ph.setDonGia(rs.getDouble(2));
                ph.setDonGiaTheoGio(rs.getDouble(3));
                ph.setMaLoai(rs.getString(4));
                ph.setGhiChu(rs.getString(5));
                dsphong.add(ph);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dsphong;
    }

    public ArrayList<Phong> timphong(Phong ph) {
        ArrayList<Phong> tp = new ArrayList<>();
        try {
            String sql = "select * from PHONG where MaPhong like N'%" + ph.getMaPhong() + "%' or MaLoai like N'%" + ph.getMaLoai() + "%' "
                    + "or GhiChu like N'%" + ph.getGhiChu() + "%' ";
            System.out.println(sql);
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Phong phong = new Phong();
                phong.setMaPhong(rs.getString(1));
                phong.setDonGia(rs.getDouble(2));
                phong.setDonGiaTheoGio(rs.getDouble(3));
                phong.setMaLoai(rs.getString(4));
                phong.setGhiChu(rs.getString(5));
                tp.add(phong);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tp;
    }

    public int capNhatTinhTrangPhong(String maPhong) {
        try {
            String sql = "Update Phong set GhiChu = N'Đã thuê' where MaPhong = '" + maPhong + "'";
            PreparedStatement preStatement = con.prepareStatement(sql);
            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int capNhatTinhTrangPhongChuaThue(String maPhong) {
        try {
            String sql = "Update Phong set GhiChu = N'Chưa thuê' where MaPhong = '" + maPhong + "'";
            PreparedStatement preStatement = con.prepareStatement(sql);
            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int ThemPhong(Phong themp) {
        try {
            String sql = "insert into PHONG values(?,?,?,?,?)";
            PreparedStatement preStatement = con.prepareStatement(sql);
            preStatement.setString(1, themp.getMaPhong());
            preStatement.setString(4, themp.getMaLoai());
            preStatement.setDouble(2, themp.getDonGia());
            preStatement.setDouble(3, themp.getDonGiaTheoGio());
            preStatement.setString(5, themp.getGhiChu());
            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    public int xoaPhong(String maPhong){
        try{
            String sql="delete from Phong where MaPhong= '"+maPhong+"'";
            PreparedStatement  pstm = con.prepareStatement(sql);
            return pstm.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return -1;
    }
    public int capNhatPhong(Phong phong){
        try{
            String donGia = String.valueOf(phong.getDonGia());
            String donGiaTheoGio = String.valueOf(phong.getDonGiaTheoGio());
            String maLoai = phong.getMaLoai();
            String ghiChu = phong.getGhiChu();
            String maPhong = phong.getMaPhong();
            String sql="update Phong set DonGia="+donGia+", DonGiaTheoGio="+donGiaTheoGio+", MaLoai='"+maLoai+"', GhiChu=N'"+ghiChu+"' where MaPhong='"+maPhong+"'";
            PreparedStatement preStatement = con.prepareStatement(sql);
            return preStatement.executeUpdate();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }
}
