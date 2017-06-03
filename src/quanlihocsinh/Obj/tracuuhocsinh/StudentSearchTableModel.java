/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.Obj.tracuuhocsinh;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import quanlihocsinh.Obj.Student;

/**
 *
 * @author DELL
 */
public class StudentSearchTableModel extends AbstractTableModel {
    
    private final ArrayList<Student> students;
    private final String[] headers;
    
    public StudentSearchTableModel(ArrayList<Student> students) {
        this.students = students;
        headers = new String[] {
            "STT", "Mã học sinh", "Họ tên", "Lớp", "TB Học kì 1", "TB Học kì 2"};
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
            case 0: return rowIndex + 1;
            case 1: return temp.getID();
            case 2: return temp.getName();
            case 3: return temp.getClassName();
            case 4: return temp.getAVGT1();
            case 5: return temp.getAVGT2();
            default: return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        if(column < getColumnCount())
            return headers[column];
        return "";
    }
    
}
