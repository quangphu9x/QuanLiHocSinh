/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.UI;

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

        tiepNhanButton = new javax.swing.JButton();
        lapDanhSachButton = new javax.swing.JButton();
        traCuuButton = new javax.swing.JButton();
        nhapBangDiemMonButton = new javax.swing.JButton();
        baoCaoTongKetMonButton = new javax.swing.JButton();
        baoCaoTongKetHocKiButton = new javax.swing.JButton();
        thayDoiQuyDinhButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tiepNhanButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tiepNhanButton.setText("Tiếp nhận học sinh");
        tiepNhanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiepNhanButtonActionPerformed(evt);
            }
        });
        add(tiepNhanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 70, 187, -1));

        lapDanhSachButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lapDanhSachButton.setText("Lập danh sách lớp");
        lapDanhSachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapDanhSachButtonActionPerformed(evt);
            }
        });
        add(lapDanhSachButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 150, 187, -1));

        traCuuButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        traCuuButton.setText("Tra cứu học sinh");
        traCuuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traCuuButtonActionPerformed(evt);
            }
        });
        add(traCuuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 235, 187, -1));

        nhapBangDiemMonButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nhapBangDiemMonButton.setText("Nhập bảng điểm môn");
        nhapBangDiemMonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapBangDiemMonButtonActionPerformed(evt);
            }
        });
        add(nhapBangDiemMonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        baoCaoTongKetMonButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        baoCaoTongKetMonButton.setText("Báo cáo tổng kết môn");
        baoCaoTongKetMonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baoCaoTongKetMonButtonActionPerformed(evt);
            }
        });
        add(baoCaoTongKetMonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 70, 203, -1));

        baoCaoTongKetHocKiButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        baoCaoTongKetHocKiButton.setText("Báo cáo tổng kết học kì");
        baoCaoTongKetHocKiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baoCaoTongKetHocKiButtonActionPerformed(evt);
            }
        });
        add(baoCaoTongKetHocKiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 150, -1, -1));

        thayDoiQuyDinhButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        thayDoiQuyDinhButton.setText("Thay đổi quy định");
        thayDoiQuyDinhButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thayDoiQuyDinhButtonActionPerformed(evt);
            }
        });
        add(thayDoiQuyDinhButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 235, 203, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tiepNhanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiepNhanButtonActionPerformed
        Main.showPanel("cardTiepNhan");
    }//GEN-LAST:event_tiepNhanButtonActionPerformed

    private void lapDanhSachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapDanhSachButtonActionPerformed
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
        Main.showPanel("cardCaiDat");
    }//GEN-LAST:event_thayDoiQuyDinhButtonActionPerformed


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