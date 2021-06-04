/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlks.entity;



/**
 *
 * @author hp
 */
public class Auth {
    //thư viện dùng để quản lý thông tin đăng nhập
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static User user = null;
     /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear(){
        Auth.user=null;
    }
    /**
     * Kiểm tra xem đăng nhập hay chưa
     */
    public static boolean  isLogin(){
        return Auth.user !=null;
    }
     /**
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
}
