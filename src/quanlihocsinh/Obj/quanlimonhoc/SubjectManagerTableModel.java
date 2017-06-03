/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.Obj.quanlimonhoc;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SubjectManagerTableModel extends DefaultTableModel {
    
    public SubjectManagerTableModel() {
        super(new String[] {"Chọn", "STT", "Mã môn học", "Tên môn học"}, 4);
        setRowCount(0);
    }
    
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }
    
    public void toggleSelection(int row) {
        String currentValue = getValueAt(row, 0).toString();
        if(currentValue.equals("false"))
            setValueAt(true, row, 0);
        else
            setValueAt(false, row, 0);
    }
    
    @Override
    public Class<?> getColumnClass(int col) {
        if(col == 0)
            return Boolean.class;
        if(col == 1)
            return Integer.class;
        return String.class;
    }
    
}
