/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlks.dao;
import com.qlks.entity.PhongDaThue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class PhongDaThueDao extends ketnoisql{
    public int luuPhongDaThue(PhongDaThue pdt){
        try{
            String sql = "insert into PHONGDATHUE values(?,?,?,?,?,?,?,?)";
            PreparedStatement preStatement = con.prepareStatement(sql);
            preStatement.setString(1, pdt.getMaPhong());
            preStatement.setDouble(2, pdt.getGiaPhong());
            preStatement.setString(3, pdt.getLoaiPhong());
            preStatement.setString(4, pdt.getTenKH());
            preStatement.setString(5, pdt.getCmnd());
            preStatement.setString(6, pdt.getLoaiThue());
            preStatement.setString(7, pdt.getSoLuong());
            preStatement.setString(8, pdt.getNgayThue());
            return preStatement.executeUpdate();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }
    public PhongDaThue findByID(String maPhong)
            throws Exception {

        String sql = "select * from PhongDaThue where maPhong = ?";

         try (
             PreparedStatement pttm = con.prepareStatement(sql);
                 ){
             pttm.setString(1, maPhong);     
            try(ResultSet rs = pttm.executeQuery();){
                if(rs.next()){
                    PhongDaThue pt = new PhongDaThue();
                    pt.setGiaPhong(rs.getDouble("giaPhong"));
                    pt.setMaPhong(rs.getString("maPhong"));
                    pt.setTenKH(rs.getString("tenKH"));
                    pt.setNgayThue(rs.getString("ngayThue"));
                    pt.setSoLuong(rs.getString("soluong"));
                    pt.setLoaiThue(rs.getString("loaithue"));
                    return pt;
                }
            }
             return null;
        }
        
    }
     public int xoaDuLieu(String maPhong){
         try {
             String sql = "delete from PhongDaThue where MaPhong= '"+maPhong+"'";
             PreparedStatement pstm =con.prepareStatement(sql);
             return pstm.executeUpdate();
         } catch (Exception e) {
         }
         return -1;
     }
}
