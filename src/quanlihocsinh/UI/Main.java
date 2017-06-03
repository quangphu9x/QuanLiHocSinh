/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlihocsinh.UI;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import quanlihocsinh.Obj.SQLConnection;
import quanlihocsinh.Obj.User;

/**
 *
 * @author DELL
 */
public class Main extends javax.swing.JFrame {

    private static CardLayout mainLayout;
    public static SQLConnection sqlConnection = new SQLConnection();
    public static User user = new User();
    
    public Main() {
        initComponents();
        mainLayout = (CardLayout)mainPanel.getLayout();
        if(!sqlConnection.isConnected()) {
            mainLayout.show(mainPanel, "cardSQLSettings");
            JOptionPane.showMessageDialog(this, "Không thể kết nối với mysql! hãy kiểm tra lại cài đặt mysql.");
        } else {
            mainLayout.show(mainPanel, "cardDangNhap");
            System.out.println("mysql is connected successfully.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        dangNhapPanel = new quanlihocsinh.UI.DangNhap();
        menuPanel = new quanlihocsinh.UI.Menu();
        tiepNhanPanel = new quanlihocsinh.UI.TiepNhan();
        lapDanhSachPanel = new quanlihocsinh.UI.LapDanhSach();
        traCuuHocSinh = new quanlihocsinh.UI.TraCuuHocSinh();
        nhapBangDiemMonPanel = new quanlihocsinh.UI.NhapBangDiemMon();
        baoCaoTongKetMonPanel = new quanlihocsinh.UI.BaoCaoTongKetMon();
        baoCaoTongKetHocKiPanel = new quanlihocsinh.UI.BaoCaoTongKetHocKi();
        caiDatPanel = new quanlihocsinh.UI.CaiDat();
        sqlSettingsPanel = new quanlihocsinh.UI.SQLSettings();
        quanLiMonHoc = new quanlihocsinh.UI.QuanLiMonHoc();
        quanLiNhanVien = new quanlihocsinh.UI.nhanvien.QuanLiNhanVien();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SQLSettingMenu = new javax.swing.JMenuItem();
        changeRegulationMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        subjectManagerMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        quanLiNhanVienMeneuItem = new javax.swing.JMenuItem();
        phanCongGiangDayMenuItem = new javax.swing.JMenuItem();
        giaoVienChuNhiemMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(dangNhapPanel, "cardDangNhap");
        mainPanel.add(menuPanel, "cardMenu");
        mainPanel.add(tiepNhanPanel, "cardTiepNhan");
        mainPanel.add(lapDanhSachPanel, "cardLapDanhSach");
        mainPanel.add(traCuuHocSinh, "cardTraCuuHocSinh");
        mainPanel.add(nhapBangDiemMonPanel, "cardNhapBangDiemMon");
        mainPanel.add(baoCaoTongKetMonPanel, "cardBaoCaoTongKetMon");
        mainPanel.add(baoCaoTongKetHocKiPanel, "cardBaoCaoTongKetHocKi");
        mainPanel.add(caiDatPanel, "cardCaiDat");
        mainPanel.add(sqlSettingsPanel, "cardSQLSettings");
        mainPanel.add(quanLiMonHoc, "cardQuanLiMonHoc");
        mainPanel.add(quanLiNhanVien, "cardQuanLiNhanVien");

        jMenu1.setText("Cài đặt");

        SQLSettingMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SQLSettingMenu.setText("Cài đặt cơ sở dữ liệu");
        SQLSettingMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQLSettingMenuActionPerformed(evt);
            }
        });
        jMenu1.add(SQLSettingMenu);

        changeRegulationMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        changeRegulationMenu.setText("Thay đổi quy định");
        jMenu1.add(changeRegulationMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Môn học");

        subjectManagerMenuItem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        subjectManagerMenuItem.setText("Quản lí môn học");
        subjectManagerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectManagerMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(subjectManagerMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Nhân viên");

        quanLiNhanVienMeneuItem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        quanLiNhanVienMeneuItem.setText("Quản lí nhân viên");
        quanLiNhanVienMeneuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLiNhanVienMeneuItemActionPerformed(evt);
            }
        });
        jMenu3.add(quanLiNhanVienMeneuItem);

        phanCongGiangDayMenuItem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        phanCongGiangDayMenuItem.setText("Phân công giảng dạy");
        jMenu3.add(phanCongGiangDayMenuItem);

        giaoVienChuNhiemMenuItem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        giaoVienChuNhiemMenuItem.setText("Giáo viên chủ nhiệm");
        jMenu3.add(giaoVienChuNhiemMenuItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void showPanel(String panel) {
        mainLayout.show(mainPanel, panel);
    }
    
    private void SQLSettingMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQLSettingMenuActionPerformed
        mainLayout.show(mainPanel, "cardSQLSettings");
        
    }//GEN-LAST:event_SQLSettingMenuActionPerformed

    private void subjectManagerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectManagerMenuItemActionPerformed
        if(!user.hasLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa đăng nhập!");
            return;
        }
        Main.showPanel("cardQuanLiMonHoc");
    }//GEN-LAST:event_subjectManagerMenuItemActionPerformed

    private void quanLiNhanVienMeneuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLiNhanVienMeneuItemActionPerformed
        if(!user.hasLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa đăng nhập!");
            return;
        }
        
        if(!user.getStaffType().equals("CV001")) {
            JOptionPane.showMessageDialog(this, "Bạn không được quyền truy cập chức năng này!");
            return;
        }
        Main.showPanel("cardQuanLiNhanVien");
    }//GEN-LAST:event_quanLiNhanVienMeneuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SQLSettingMenu;
    private quanlihocsinh.UI.BaoCaoTongKetHocKi baoCaoTongKetHocKiPanel;
    private quanlihocsinh.UI.BaoCaoTongKetMon baoCaoTongKetMonPanel;
    private quanlihocsinh.UI.CaiDat caiDatPanel;
    private javax.swing.JMenuItem changeRegulationMenu;
    private quanlihocsinh.UI.DangNhap dangNhapPanel;
    private javax.swing.JMenuItem giaoVienChuNhiemMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private quanlihocsinh.UI.LapDanhSach lapDanhSachPanel;
    private static javax.swing.JPanel mainPanel;
    private quanlihocsinh.UI.Menu menuPanel;
    private quanlihocsinh.UI.NhapBangDiemMon nhapBangDiemMonPanel;
    private javax.swing.JMenuItem phanCongGiangDayMenuItem;
    private quanlihocsinh.UI.QuanLiMonHoc quanLiMonHoc;
    private quanlihocsinh.UI.nhanvien.QuanLiNhanVien quanLiNhanVien;
    private javax.swing.JMenuItem quanLiNhanVienMeneuItem;
    private quanlihocsinh.UI.SQLSettings sqlSettingsPanel;
    private javax.swing.JMenuItem subjectManagerMenuItem;
    private quanlihocsinh.UI.TiepNhan tiepNhanPanel;
    private quanlihocsinh.UI.TraCuuHocSinh traCuuHocSinh;
    // End of variables declaration//GEN-END:variables
}