/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.Obj.nhapbangdiem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import quanlihocsinh.Obj.Transcript;

/**
 *
 * @author DELL
 */
public class TranscriptTableModel extends AbstractTableModel {
    private ArrayList<Transcript> transcripts;
    private String[] headers;
    
    public TranscriptTableModel(ArrayList<Transcript> transcripts) {
        this.transcripts = transcripts;
        headers = new String[] {"STT", "Mã Học Sinh", "Họ Tên", "Điểm Miệng",
                    "Điểm 15'", "Điểm 1 Tiết", "Điểm Cuối Kì", "Điểm Trung Bình"};
    }

    @Override
    public int getRowCount() {
        if(transcripts != null)
            return transcripts.size();
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
        Transcript temp = transcripts.get(rowIndex);
        switch(columnIndex) {
            case 0: return rowIndex + 1;
            case 1: return temp.getId();
            case 2: return temp.getName();
            case 3: return temp.getDiemMieng();
            case 4: return temp.getDiem15Phut();
            case 5: return temp.getDiem1Tiet();
            case 6: return temp.getDiemCuoiKi();
            case 7: return temp.getDiemTrungBinhMon();
            default: return "";
        }
    }
    
    @Override
    public void setValueAt(Object value, int row, int column) {
        if(row < 0 || row >= getRowCount() || column < 0 || column >= getColumnCount())
            return;
        
        String str = value.toString();
        Transcript transcript = transcripts.get(row);
        
        switch(column) {
            case 3: transcript.setDiemMieng(str);
                    break;
            case 4: transcript.setDiem15Phut(str);
                    break;
            case 5: transcript.setDiem1Tiet(str);
                    break;
            case 6: transcript.setDiemCuoiKi(str);
                    break;
        }
        fireTableCellUpdated(row, column);
        System.out.println("Changed !");
    }
    
    @Override
    public String getColumnName(int column) {
        if(column < getColumnCount())
            return headers[column];
        return "";
    }
    
    @Override
    public boolean isCellEditable(int row, int column) {
        if(column < 3 || column >= 7)
            return false;
        return true;
    }
    
}
