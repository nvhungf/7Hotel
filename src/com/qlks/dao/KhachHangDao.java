/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlks.dao;

import com.qlks.entity.KhachHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class KhachHangDao extends ketnoisql{
    public int luuKhachHang(KhachHang kh){
        try{
            String sql = "insert into KHACHHANG values(?,?)";
            PreparedStatement preStatement = con.prepareStatement(sql);
            preStatement.setString(1, kh.getCmnd());
            preStatement.setString(2, kh.getTenKH());
            return preStatement.executeUpdate();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }
    public ArrayList<KhachHang> docKhachHang(){
        ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
        try{
            String sql="select * from KHACHHANG";
            Statement statement=con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                KhachHang kh = new KhachHang();
                kh.setCmnd(rs.getString(1));
                kh.setTenKH(rs.getString(2));
                dskh.add(kh);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return dskh;
    }
    public ArrayList<KhachHang> timKhachHang(KhachHang ph){
        ArrayList<KhachHang> tp = new ArrayList<>();
        try{
            String sql="select * from KhachHang where CMND like N'%" + ph.getCmnd()+ "%' or TenKH like N'%" + ph.getTenKH()+ "%'";
            Statement statement=con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                KhachHang kh = new KhachHang();
                kh.setCmnd(rs.getString(1));
                kh.setTenKH(rs.getString(2));
                tp.add(kh);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }return tp;
    }
}
