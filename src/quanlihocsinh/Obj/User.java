/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.Obj;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlihocsinh.UI.Main;

/**
 *
 * @author DELL
 */
public class User {
    
    private boolean loginSuccessfully = false;
    private String id; // ma nhan vien
    
    public User() {
        
    }
    
    public boolean login(String username, String password) {
        try {
            Connection connection = Main.sqlConnection.getConnection();
            ResultSet rs = connection.createStatement().executeQuery(
                    "SELECT MaNhanVien, MatKhau FROM NHANVIEN WHERE TenDangNhap='" + username + "'");
            rs.last();
            
            // khong ton tai tai khoan
            if(rs.getRow() < 1) {
                connection.close();
                return false;
            }
            rs.first();
            
            // kiem tra mat khau
            String truePassword = rs.getString(2);
            password = getMD5(password);
            if(password.equals(truePassword)) {
                loginSuccessfully = true;
                id = rs.getString(1);
            }
            rs.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            Main.sqlConnection.closeAllConnection();
        }
        return loginSuccessfully;
    }
    
    public boolean hasLoggedIn() {
        return loginSuccessfully;
    } 
    
    public void reset() {
        loginSuccessfully = false;
        id = null;
    }
    
    public String getID() {
        return id;
    }
    
    public String getStaffType() {
        String result = "";
        try {
            Connection connection = Main.sqlConnection.getConnection();
            ResultSet rs = connection.createStatement().executeQuery(
                    "SELECT MaChucVu FROM NHANVIEN WHERE MaNhanVien='" + id + "'");
            rs.first();
            result = rs.getString(1);
            
            rs.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            Main.sqlConnection.closeAllConnection();
        }
        return result;
        
    }
    
    public static String getMD5(String str) {
        String result = "";
        try {
            // ma hoa password sang md5
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] s = md.digest();
            for(int i = 0; i < s.length; i++)
                result += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00).substring(6);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
