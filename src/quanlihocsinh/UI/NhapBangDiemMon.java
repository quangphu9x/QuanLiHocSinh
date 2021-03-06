/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.UI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import quanlihocsinh.Obj.Transcript;
import quanlihocsinh.Obj.nhapbangdiem.TranscriptTableModel;

/**
 *
 * @author DELL
 */
public class NhapBangDiemMon extends javax.swing.JPanel {

    /**
     * Creates new form NhapBangDiemMon
     */
    private TranscriptTableModel tableModel;
    private ArrayList<Transcript> transcripts; // bang diem
    
    public NhapBangDiemMon() {
        initComponents();
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gradeComboBox = new javax.swing.JComboBox<>();
        classComboBox = new javax.swing.JComboBox<>();
        subjectComboBox = new javax.swing.JComboBox<>();
        semesterComboBox = new javax.swing.JComboBox<>();
        openButton = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        cantEditLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Lớp:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Môn:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Học Kì:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Nhập Bảng Điểm Môn");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Khối:");

        gradeComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gradeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gradeComboBoxItemStateChanged(evt);
            }
        });

        classComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        classComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classComboBoxItemStateChanged(evt);
            }
        });

        subjectComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        subjectComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subjectComboBoxItemStateChanged(evt);
            }
        });

        semesterComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        semesterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        semesterComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semesterComboBoxItemStateChanged(evt);
            }
        });

        openButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        openButton.setText("Mở bảng điểm");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Học Sinh", "Họ Tên", "Điểm miệng", "Điểm 15'", "Điểm 1 tiết", "Điểm Cuối Kì", "Điểm TB"
            }
        ));
        jScrollPane1.setViewportView(table);

        saveButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        saveButton.setText("Lưu");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancelButton.setText("Hủy");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        cantEditLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cantEditLabel.setForeground(new java.awt.Color(255, 0, 0));
        cantEditLabel.setText("Bạn không thể chỉnh sửa bảng điểm này");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cantEditLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton)
                        .addGap(21, 21, 21))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveButton)
                        .addComponent(cancelButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(cantEditLabel)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(subjectComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(classComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(gradeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(semesterComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(gradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gradeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gradeComboBoxItemStateChanged
        panel.setVisible(false);
        if(evt.getStateChange() == 2) // item deselected
            return;
        try {
            Connection connection = Main.sqlConnection.getConnection();
            // hien thi danh sach lop cua khoi da chon
            loadClassSelection(
                    gradeComboBox.getSelectedItem().toString(),
                    connection.createStatement()
            );
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LapDanhSach.class.getName()).log(Level.SEVERE, null, ex);
            Main.sqlConnection.closeAllConnection();
        }
    }//GEN-LAST:event_gradeComboBoxItemStateChanged

    // xem bang diem
    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        String className = classComboBox.getSelectedItem().toString();
        String subject = subjectComboBox.getSelectedItem().toString();
        int semester = semesterComboBox.getSelectedIndex() + 1;
        
        String sql = "SELECT BANGDIEMMON.MaHocSinh, HoVaTen, DiemMieng, Diem15Phut, Diem1Tiet, DiemCuoiKi, DiemTrungBinhMon"
                + " FROM BANGDIEMMON, HOCSINH"
                + " WHERE BANGDIEMMON.MaHocSinh=HOCSINH.MaHocSinh AND"
                + " MaMonHoc=(SELECT MaMonHoc FROM MONHOC WHERE TenMonHoc='" + subject + "')"
                + " AND MaLop=("
                    + "SELECT MaLop FROM LOPHOC WHERE TenLop='" + className + "'"
                + ") AND HocKi=" + semester;
        try {
            Connection connection = Main.sqlConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            // duyet danh sach hoc sinh
            transcripts.clear();
            while(rs.next()) {
                Transcript transcript = new Transcript(
                        rs.getString(1), // ma hoc sinh
                        rs.getString(2), // ten hoc sinh
                        rs.getString(3), // diem mieng
                        rs.getString(4), // diem 15 phut
                        rs.getString(5), // diem 1 tiet
                        rs.getString(6), // diem cuoi ki
                        rs.getFloat(7) // diem trung binh mon
                );
                transcripts.add(transcript);
            }
            
            showOnTable();
            connection.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NhapBangDiemMon.class.getName()).log(Level.SEVERE, null, ex);
            Main.sqlConnection.closeAllConnection();
        }
    }//GEN-LAST:event_openButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        showOnTable();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(table.isEditing()) // dung viec nhap du lieu tren bang
            table.getCellEditor().stopCellEditing();
        if(!checkInput()) // kiem tra cac gia tri nhap vao da hop le chua
            return;
        
        try {
            Connection connection = Main.sqlConnection.getConnection();
            Statement statement = connection.createStatement();
            
            // lay ma mon hoc
            ResultSet rs = statement.executeQuery(
                    "SELECT MaMonHoc FROM MONHOC"
                    + " WHERE TenMonHoc='" + subjectComboBox.getSelectedItem().toString() + "'"
            );
            rs.first();
            String subjectID = rs.getString(1);
                
            for(int i = 0; i < tableModel.getRowCount(); i++) {
                String diemMieng = tableModel.getValueAt(i, 3).toString();
                String diem15Phut = tableModel.getValueAt(i, 4).toString();
                String diem1Tiet = tableModel.getValueAt(i, 5).toString();
                String diemCuoiKi = tableModel.getValueAt(i, 6).toString();
                
                int semester = semesterComboBox.getSelectedIndex() + 1;
                Transcript transcript = transcripts.get(i);
                
                // chuan hoa va luu du lieu
                transcript.setDiemMieng(diemMieng);
                transcript.setDiem15Phut(diem15Phut);
                transcript.setDiem1Tiet(diem1Tiet);
                transcript.setDiemCuoiKi(diemCuoiKi);
                transcript.tinhDiemTrungBinhMon();
                
                statement.executeUpdate("UPDATE BANGDIEMMON SET"
                        + " DiemMieng=" + Transcript.getSQLValue(diemMieng) + ","
                        + " Diem15Phut='" + diem15Phut + "',"
                        + " Diem1Tiet='" + diem1Tiet + "',"
                        + " DiemCuoiKi=" + Transcript.getSQLValue(diemCuoiKi) + ","
                        + " DiemTrungBinhMon=" + transcript.getDiemTrungBinhMon()
                        + " WHERE MaMonHoc='" + subjectID + "'"
                        + " AND MaHocSinh='" + transcript.getId() + "'"
                        + " AND HocKi=" + semester
                );
                
                // cap nhat diem trung binh hoc sinh
                rs = statement.executeQuery("SELECT COUNT(*) FROM MONHOC");
                rs.first();
                int numOfSuject = rs.getInt(1); // so mon hoc
                
                rs = statement.executeQuery(
                        "SELECT SUM(DiemTrungBinhMon)" +
                        "FROM BANGDIEMMON " +
                        "WHERE HocKi=" + semester + " " +
                        "AND MaHocSinh='" + transcript.getId() + "'"
                );
                rs.first();
                float sumOfPoint = rs.getFloat(1); // tong diem trung binh cac mon hoc
                rs.close();
                
                // diem trung binh hoc ki lam tron 2 chu so
                float avgPoint = Math.round(100 * (sumOfPoint / numOfSuject)) / (float)100;
                statement.executeUpdate(
                        "UPDATE HOCSINH SET"
                        + " DTBHocKi" + semester + "=" + avgPoint
                        + " WHERE MaHocSinh='" + transcript.getId() + "'"
                );
                
            }
            
            connection.close();
            showOnTable();
            JOptionPane.showMessageDialog(this, "Lưu bảng điểm thành công!");
                
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra, hãy thử lại!");
            Logger.getLogger(NhapBangDiemMon.class.getName()).log(Level.SEVERE, null, ex);
            Main.sqlConnection.closeAllConnection();
        } 
    }//GEN-LAST:event_saveButtonActionPerformed

    private void classComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classComboBoxItemStateChanged
        panel.setVisible(false);
    }//GEN-LAST:event_classComboBoxItemStateChanged

    private void subjectComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subjectComboBoxItemStateChanged
        panel.setVisible(false);
    }//GEN-LAST:event_subjectComboBoxItemStateChanged

    private void semesterComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semesterComboBoxItemStateChanged
        panel.setVisible(false);
    }//GEN-LAST:event_semesterComboBoxItemStateChanged

    public void initData() {
        panel.setVisible(false);
        try {
            Connection connection = Main.sqlConnection.getConnection();
            Statement statement = connection.createStatement();
            transcripts = new ArrayList<>();
            
            // hien thi danh sach khoi
            gradeComboBox.removeAllItems();
            ResultSet rs = statement.executeQuery("SELECT KhoiLop FROM KHOI ORDER BY(KhoiLop)");
            while(rs.next())
                gradeComboBox.addItem(rs.getString(1));
            
            // hien thi danh sach lop
            loadClassSelection("10", statement);
            
            // hien thi danh sach mon hoc
            subjectComboBox.removeAllItems();
            rs = statement.executeQuery("SELECT TenMonHoc FROM MONHOC");
            while(rs.next())
                subjectComboBox.addItem(rs.getString(1));
            
            rs.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LapDanhSach.class.getName()).log(Level.SEVERE, null, ex);
            Main.sqlConnection.closeAllConnection();
        }
    }
    
    private void loadClassSelection(String grade, Statement statement) throws SQLException {
        classComboBox.removeAllItems();
        ResultSet rs = statement.executeQuery(
                "SELECT TenLop FROM LOPHOC WHERE KhoiLop=" + grade + " ORDER BY(TenLop)");
        while(rs.next())
            classComboBox.addItem(rs.getString(1));
        rs.close();
    }
    
    private boolean checkInput() {
        
        for(int i = 0; i < tableModel.getRowCount(); i++) {
            
            String diemMieng = tableModel.getValueAt(i, 3).toString();
            String diem15Phut = tableModel.getValueAt(i, 4).toString();
            String diem1Tiet = tableModel.getValueAt(i, 5).toString();
            String diemCuoiKi = tableModel.getValueAt(i, 6).toString();
            
            // kiem tra cac du lieu co hop le
            Transcript transcript = transcripts.get(i);
            String studentID = transcript.getId();
            if(!transcript.checkDiemMieng_CK(diemMieng)) {
                JOptionPane.showMessageDialog(this, 
                        "Điểm miệng của học sinh " + studentID + " không hợp lệ, hãy kiểm tra lại!");
                return false;
            }
            
            if(!transcript.checkDiem15Phut_1Tiet(diem15Phut)) {
                JOptionPane.showMessageDialog(this,
                        "Điểm 15 phút của học sinh " + studentID + " không hợp lệ, hãy kiểm tra lại!");
                return false;
            }
            
            if(!transcript.checkDiem15Phut_1Tiet(diem1Tiet)) {
                JOptionPane.showMessageDialog(this,
                        "Điểm 1 tiết của học sinh " + studentID + " không hợp lệ, hãy kiểm tra lại!");
                return false;
            }
            
            if(!transcript.checkDiemMieng_CK(diemCuoiKi)) {
                JOptionPane.showMessageDialog(this,
                        "Điểm cuối kì của học sinh " + studentID + " không hợp lệ, hãy kiểm tra lại!");
                return false;
            }
        }
        return true;
    }
    
    private void showOnTable() {
        tableModel = new TranscriptTableModel(transcripts);
        table.setModel(tableModel);
        panel.setVisible(true);
        setEditable();
    }
    
    public void setEditable() {
        String userID = Main.user.getID(); // ma giao vien
        if(userID == null || userID.equals(""))
            TranscriptTableModel.setEditable(false);
        try {
            Connection connection = Main.sqlConnection.getConnection();
            Statement statement = connection.createStatement();
            
            // lay cac thong tin
            ResultSet rs = statement.executeQuery(
                    "SELECT MaMonHoc FROM MONHOC WHERE TenMonHoc='"
                            + subjectComboBox.getSelectedItem().toString() + "'"
            );
            rs.first();
            String subjectID = rs.getString(1); // ma mon hoc
            
            rs = statement.executeQuery("SELECT MaLop FROM LOPHOC WHERE TenLop='"
                    + classComboBox.getSelectedItem().toString() + "'"
            );
            rs.first();
            String classID = rs.getString(1); // ma lop
            String semester = semesterComboBox.getSelectedItem().toString();
            
            // xac nhan giao vien co day lop hoc nay khong
            rs = statement.executeQuery("SELECT * FROM GIANGDAY WHERE MaGiaoVien='"
                    + userID + "' AND MaMonHoc='" + subjectID + "' AND MaLop='"
                    + classID + "' AND HocKi=" + semester
            );
            rs.last();
            int rowCount = rs.getRow();
            rs.close();
            connection.close();
            
            boolean editable = true;
            if(rowCount < 1) // giao vien khong day lop nay
                editable = false;
            
            TranscriptTableModel.setEditable(editable);
            saveButton.setVisible(editable);
            cancelButton.setVisible(editable);
            cantEditLabel.setVisible(!editable);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NhapBangDiemMon.class.getName()).log(Level.SEVERE, null, ex);
            Main.sqlConnection.closeAllConnection();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cantEditLabel;
    private javax.swing.JComboBox<String> classComboBox;
    private javax.swing.JComboBox<String> gradeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openButton;
    private javax.swing.JPanel panel;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> semesterComboBox;
    private javax.swing.JComboBox<String> subjectComboBox;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
