/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlks.dao;
import com.qlks.entity.Phong;
import com.qlks.entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Administrator
 */
public class UserDao extends ketnoisql{
    public User dangnhap(String username, String password){
        User us = null;
        try{
            String sql="select * from USERS where username=? and password=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if(rs.next()){
               us = new User();
               us.setUsername(rs.getString(1));
               us.setPassword(rs.getString(2));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return us;
    } 
    public int ThemUser(User themp) {
        try {
            String sql = "insert into USERS values(?,?)";
            PreparedStatement preStatement = con.prepareStatement(sql);
            preStatement.setString(1, themp.getUsername());
            preStatement.setString(2, themp.getPassword());
            return preStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}
