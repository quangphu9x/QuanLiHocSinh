/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.Obj;

/**
 *
 * @author DELL
 */
// bang diem
public final class Transcript {
    
    private final String id;
    private final String name;
    private String diemMieng;
    private String diem15Phut;
    private String diem1Tiet;
    private String diemCuoiKi;
    private float diemTrungBinhMon;
    
    public Transcript(String id, String name, String diemMieng, String diem15Phut,
            String diem1Tiet, String diemCuoiKi, float diemTrungBinhMon) {
        this.id = id;
        this.name = name;
        setDiemMieng(diemMieng);
        setDiem15Phut(diem15Phut);
        setDiem1Tiet(diem1Tiet);
        setDiemCuoiKi(diemCuoiKi);
        setDiemTrungBinhMon(diemTrungBinhMon);
    }
    
    // kiem tra xem diem mieng, cuoi ki co hop le
    public boolean checkDiemMieng_CK(String diem) {
        if(diem.equals(""))
            return true;
        
        if(!diem.matches("[0-9]{1,2}(\\.[0-9]+)?")) // sai dinh dang diem
            return false;
        
        float value = Float.parseFloat(diem);
        return value >= 0 && value <= 10;
    }
    
    public boolean checkDiem15Phut_1Tiet(String diem) {
        if(diem.equals(""))
            return true;
        
        String[] split = diem.split(" ");
        for(String s: split) {
            if(!s.matches("[0-9]{1,2}(\\.[0-9]+)?")) // sai dinh dang diem
                return false;
            float value = Float.parseFloat(s);
            if(!(value >= 0 && value <= 10)) // diem so khong hop le
                return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDiemMieng() {
        return diemMieng;
    }

    public void setDiemMieng(String diemMieng) {
        if(diemMieng == null)
            diemMieng = "";
        this.diemMieng = diemMieng;
    }

    public String getDiem15Phut() {
        return diem15Phut;
    }

    public void setDiem15Phut(String diem15Phut) {
        if(diem15Phut == null)
            diem15Phut = "";
        this.diem15Phut = diem15Phut;
    }

    public String getDiem1Tiet() {
        return diem1Tiet;
    }

    public void setDiem1Tiet(String diem1Tiet) {
        if(diem1Tiet == null)
            diem1Tiet = "";
        this.diem1Tiet = diem1Tiet;
    }

    public String getDiemCuoiKi() {
        return diemCuoiKi;
    }

    public void setDiemCuoiKi(String diemCuoiKi) {
        if(diemCuoiKi == null)
            diemCuoiKi = "";
        this.diemCuoiKi = diemCuoiKi;
    }

    public float getDiemTrungBinhMon() {
        return diemTrungBinhMon;
    }

    public void setDiemTrungBinhMon(float diemTrungBinhMon) {
        this.diemTrungBinhMon = diemTrungBinhMon;
    }
    
    
    public void tinhDiemTrungBinhMon() {
        // cong thuc tinh diem trung binh = (mieng + tong 15p + 2 * tong 45p + 3 * cuoi ki)/ so cot
        float total = 0; // tong diem
        int cols = 0; // so cot diem
        
        // xu li diem mieng
        if(!diemMieng.equals("")) {
            total = Float.parseFloat(diemMieng);
            cols++;
        }
        
        // xu li diem 15p
        if(!diem15Phut.equals("")) {
            String[] split = diem15Phut.split(" ");
            for (String s : split) {
                total += Float.parseFloat(s);
                cols++;
            }
        }
        
        // xu li diem 1 tiet
        if(!diem1Tiet.equals("")) {
            String[] split = diem1Tiet.split(" ");
            for (String s : split) {
                total = total + 2 * Float.parseFloat(s);
                cols += 2;
            }
        }
        
        // xu li diem cuoi ki
        if(!diemCuoiKi.equals("")) {
            float value = Float.parseFloat(diemCuoiKi);
            total = total + 3 * value;
            cols += 3;
        }
        
        float avg;
        if(cols == 0)
            avg = 0;
        else
            avg = total / cols;
        
        // lam tron den 1 chu so thap phan
        diemTrungBinhMon = Math.round(avg * 10) / (float)10.0;
        
    }
    
    // lay gia tri cho cot diem mieng, cuoi ki khi them vao sql
    public static String getSQLValue(String str) {
        if(str == null || str.equals(""))
            return "NULL";
        return str;
    }
    
}
