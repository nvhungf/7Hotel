/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlks.dao;

import com.qlks.entity.HoaDon;
import com.qlks.entity.Phong;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class HoaDonDao extends ketnoisql {
    public int luuHoaDon(HoaDon hd){
        try{
            String sql = "insert into HOADON values(?,?,?,?,?)";
            PreparedStatement preStatement = con.prepareStatement(sql);
            preStatement.setString(1, hd.getMaPhong());
            preStatement.setString(2, hd.getNgayThue());
            preStatement.setString(3, hd.getNgayTra());
            preStatement.setString(4, hd.getTenKH());
            preStatement.setDouble(5, hd.getTongTien());
            return preStatement.executeUpdate();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> DoanhThuNam(String nam) {
        String sql = " EXEC sp_DoanhThuNam  " + nam + "";
        String[] cols = {"nam", "DoanhThu"};
        return this.getListOfArray(sql, cols, nam);
    }
    public List<Object[]> DoanhThuThang(String thang) {
        String sql = " EXEC sp_DoanhThuThang "+ thang +"";
        String[] cols = {"Thang", "DoanhThu"};
        return this.getListOfArray(sql, cols, thang);
    }
         
     public List<Object[]> DoanhThuNgay(String ngay) {
        String sql = " EXEC sp_DoanhThuNgay  '"+ ngay +"'";
        String[] cols = {"Ngay", "DoanhThu"};
        return this.getListOfArray(sql, cols, ngay);
    }

    /* public List<HoaDon> timphong( int nam, int thang) throws Exception{
        
       
            String sql = "select * from HOADON where YEAR(NgayTra) =? and MONTH(NgayTra) = ? ";
           // JOptionPane.showMessageDialog(null, sql);          
            try (
                PreparedStatement pstm = con.prepareStatement(sql);){
                pstm.setInt(1, nam);
                pstm.setInt(2, thang);
                try(ResultSet rs = pstm.executeQuery();){
                    List<HoaDon> list = new ArrayList<>();
                    while(rs.next()){
                HoaDon hoadon = new HoaDon();
                hoadon.setMaHD(rs.getString("mahd"));
                hoadon.setMaPhong(rs.getString("MaPhong"));
                hoadon.setNgayThue(rs.getString("NgayThue"));
                hoadon.setNgayTra(rs.getString("NgayTra"));
                hoadon.setTenKH(rs.getString("tenKH"));
                hoadon.setTongTien(rs.getDouble("tongtien"));
                list.add(hoadon);
                
                    }
                    return list;
                }
            
            }
         
       
        
    }*/
}
