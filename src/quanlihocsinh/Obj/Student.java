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
public class Student {

    private boolean selected; // hoc sinh duoc chon
    private final String id;
    private String name;
    private int sex; //0: nam, 1: nu
    private String birthday;
    private String address;
    private String email;
    private int grade;
    private String className;
    private float avgT1; // diem trung binh hk1
    private float avgT2; // diem trung binh hk2

    public Student(String id, String name, int sex, String birthday, String address, 
            String email, int grade, String className, float avgT1, float avgT2) {
        selected = false;
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
        this.grade = grade;
        this.className = className;
        this.avgT1 = avgT1;
        this.avgT2 = avgT2;
    }
    
    public void setSelected(boolean selected) { this.selected = selected; }
    public void setName(String name) { this.name = name;}
    public void setSex(int sex) { this.sex = sex; }
    public void setBirthday(String birthday) { this.birthday = birthday; }
    public void setAddress(String address) { this.address = address; }
    public void setEmail(String email) { this.email = email; }
    public void setGrade(int grade) { this.grade = grade; }
    public void setClassName(String className) { this.className = className; }
    public void setAVGT1(float avgT1) { this.avgT1 = avgT1; }
    public void setAVGT2(float avgT2) { this.avgT2 = avgT2; }
    
    public boolean isSelected() { return selected; }
    public String getID() { return id; }
    public String getName() { return name; }
    public int getSex() { return sex; }
    public String getBirthday() { return birthday; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public int getGrade() { return grade; }
    public String getClassName() { return className; }
    public float getAVGT1() { return avgT1; }
    public float getAVGT2() { return avgT2; }
    public int getYearOfBirthday() {
        return Integer.parseInt(birthday.split("-")[0]);
    }
    
    public void select() {
        selected = !selected;
    }

}
