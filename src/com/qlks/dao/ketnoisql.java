/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlks.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class ketnoisql {

    protected Connection con = null;

    public ketnoisql() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionurl = "jdbc:sqlserver://localhost:1433;DatabaseName=QuanLyKhachSan;";
            con = DriverManager.getConnection(connectionurl, "sa", "8");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
