/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.Obj;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

/**
 *
 * @author DELL
 */
public class CheckDate {
    
    // kiem tra 1 ngay co hop le hay khong
    public static boolean checkValidDate(int d, int m, int y) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, m - 1);
        calendar.set(Calendar.YEAR, y);
        int numDays = calendar.getActualMaximum(Calendar.DATE);
        return (d <= numDays);
    }
    
    /*
    kiem tra do tuoi cua hoc sinh co nam trong gioi han cho phep hay khong,
    tra ve 3 gia tri: tuoi toi thieu, tuoi toi da, tuoi hop le hay khong
    */
    public static String checkBirthdayLimit(int y, Statement statement) throws SQLException {
        ResultSet rs = statement.executeQuery(
                "SELECT TuoiHocSinhToiThieu, TuoiHocSinhToiDa FROM THAMSO");
        rs.first();
        int minAge = rs.getInt(1);
        int maxAge = rs.getInt(2);
        rs.close();
        
        // kiem tra tuoi hoc sinh, tra ve gioi han tuoi, tuoi hoc sinh co hop le khong
        String result = minAge + "," + maxAge + ",";
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - y;
        if(age >= minAge && age <= maxAge)
            result += "true";
        else
            result += "false";
        
        return result;
    }
}
