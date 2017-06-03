/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.Obj.lapdanhsach;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import quanlihocsinh.Obj.Student;

/**
 *
 * @author DELL
 */
public class StudentTableModel extends AbstractTableModel {
    
    private ArrayList<Student> students;
    private String[] headers;
    
    public StudentTableModel(ArrayList<Student> students) {
        this.students = students;
        headers = new String[] {
            "Chọn", "STT", "Mã học sinh", "Họ tên", "Giới tính", "Năm sinh", "Địa chỉ"};
    }

    @Override
    public int getRowCount() {
        if(students != null)
            return students.size();
        return 0;
    }

    @Override
    public int getColumnCount() {
        if(headers != null)
            return headers.length;
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student temp = students.get(rowIndex);
        switch(columnIndex) {
            case 0: return temp.isSelected();
            case 1: return rowIndex + 1;
            case 2: return temp.getID();
            case 3: return temp.getName();
            case 4: return (temp.getSex() == 0 ? "Nam" : "Nữ");
            case 5: return temp.getYearOfBirthday();
            case 6: return temp.getAddress();
            default: return "";
        }
    }
    
    @Override
    public Class<?> getColumnClass(int column) {
        switch(column) {
            case 0: return Boolean.class;
            case 1: return Integer.class;
            case 2: return String.class;
            case 3: return String.class;
            case 4: return String.class;
            case 5: return Integer.class;
            case 6: return String.class;
            default: return String.class;
        }
    }
    
    public void toogleSelection(int row) {
        if(row < 0 || row >= getRowCount())
            return;
        students.get(row).select();
    }
    
    @Override
    public String getColumnName(int column) {
        if(column < getColumnCount())
            return headers[column];
        return "";
    }
    
}
