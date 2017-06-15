/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.UI;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tiepNhanButton = new javax.swing.JButton();
        lapDanhSachButton = new javax.swing.JButton();
        traCuuButton = new javax.swing.JButton();
        nhapBangDiemMonButton = new javax.swing.JButton();
        baoCaoTongKetMonButton = new javax.swing.JButton();
        baoCaoTongKetHocKiButton = new javax.swing.JButton();
        thayDoiQuyDinhButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        tiepNhanButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tiepNhanButton.setText("Tiếp nhận học sinh");
        tiepNhanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiepNhanButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 59, 0, 0);
        add(tiepNhanButton, gridBagConstraints);

        lapDanhSachButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lapDanhSachButton.setText("Lập danh sách lớp");
        lapDanhSachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapDanhSachButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 59, 0, 0);
        add(lapDanhSachButton, gridBagConstraints);

        traCuuButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        traCuuButton.setText("Tra cứu học sinh");
        traCuuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traCuuButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 59, 0, 0);
        add(traCuuButton, gridBagConstraints);

        nhapBangDiemMonButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nhapBangDiemMonButton.setText("Nhập bảng điểm môn");
        nhapBangDiemMonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapBangDiemMonButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(64, 60, 81, 0);
        add(nhapBangDiemMonButton, gridBagConstraints);

        baoCaoTongKetMonButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        baoCaoTongKetMonButton.setText("Báo cáo tổng kết môn");
        baoCaoTongKetMonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baoCaoTongKetMonButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 151, 0, 74);
        add(baoCaoTongKetMonButton, gridBagConstraints);

        baoCaoTongKetHocKiButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        baoCaoTongKetHocKiButton.setText("Báo cáo tổng kết học kì");
        baoCaoTongKetHocKiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baoCaoTongKetHocKiButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 151, 0, 74);
        add(baoCaoTongKetHocKiButton, gridBagConstraints);

        thayDoiQuyDinhButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        thayDoiQuyDinhButton.setText("Thay đổi quy định");
        thayDoiQuyDinhButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thayDoiQuyDinhButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 151, 0, 74);
        add(thayDoiQuyDinhButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tiepNhanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiepNhanButtonActionPerformed
        if(!checkAdmin())
            return;
        Main.showPanel("cardTiepNhan");
    }//GEN-LAST:event_tiepNhanButtonActionPerformed

    private void lapDanhSachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapDanhSachButtonActionPerformed
        if(!checkAdmin())
            return;
        Main.showPanel("cardLapDanhSach");
    }//GEN-LAST:event_lapDanhSachButtonActionPerformed

    private void traCuuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traCuuButtonActionPerformed
        Main.showPanel("cardTraCuuHocSinh");
    }//GEN-LAST:event_traCuuButtonActionPerformed

    private void nhapBangDiemMonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapBangDiemMonButtonActionPerformed
        Main.showPanel("cardNhapBangDiemMon");
    }//GEN-LAST:event_nhapBangDiemMonButtonActionPerformed

    private void baoCaoTongKetHocKiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baoCaoTongKetHocKiButtonActionPerformed
        Main.showPanel("cardBaoCaoTongKetHocKi");
    }//GEN-LAST:event_baoCaoTongKetHocKiButtonActionPerformed

    private void baoCaoTongKetMonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baoCaoTongKetMonButtonActionPerformed
        Main.showPanel("cardBaoCaoTongKetMon");
    }//GEN-LAST:event_baoCaoTongKetMonButtonActionPerformed

    private void thayDoiQuyDinhButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thayDoiQuyDinhButtonActionPerformed
        if(!checkAdmin())
            return;
        Main.showPanel("cardCaiDat");
    }//GEN-LAST:event_thayDoiQuyDinhButtonActionPerformed
    
    private boolean checkAdmin() {
        if(!Main.user.getStaffType().equals("CV001")) {
            JOptionPane.showMessageDialog(this, "Chức năng này chỉ dành cho admin!");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baoCaoTongKetHocKiButton;
    private javax.swing.JButton baoCaoTongKetMonButton;
    private javax.swing.JButton lapDanhSachButton;
    private javax.swing.JButton nhapBangDiemMonButton;
    private javax.swing.JButton thayDoiQuyDinhButton;
    private javax.swing.JButton tiepNhanButton;
    private javax.swing.JButton traCuuButton;
    // End of variables declaration//GEN-END:variables
}
