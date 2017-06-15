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
        phanCongGiangDay = new quanlihocsinh.UI.nhanvien.PhanCongGiangDay();
        xepGVCN = new quanlihocsinh.UI.nhanvien.XepGVCN();
        quanLiLopHoc = new quanlihocsinh.UI.QuanLiLopHoc();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SQLSettingMenu = new javax.swing.JMenuItem();
        changeRegulationMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        tiepNhanMenu = new javax.swing.JMenuItem();
        lapDanhSachLopMenu = new javax.swing.JMenuItem();
        traCuuMenu = new javax.swing.JMenuItem();
        nhapBangDiemMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        subjectManagerMenuItem = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        classManagementMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        quanLiNhanVienMeneuItem = new javax.swing.JMenuItem();
        phanCongGiangDayMenuItem = new javax.swing.JMenuItem();
        giaoVienChuNhiemMenuItem = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuBaoCaoTongKetMon = new javax.swing.JMenuItem();
        menuBaoCaoTongKetHocKi = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        loginMenu = new javax.swing.JMenuItem();
        logoutMenu = new javax.swing.JMenuItem();

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
        mainPanel.add(phanCongGiangDay, "cardPhanCongGiangDay");
        mainPanel.add(xepGVCN, "cardXepGVCN");
        mainPanel.add(quanLiLopHoc, "cardQuanLiLopHoc");

        jMenu1.setText("Cài đặt");

        SQLSettingMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SQLSettingMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sqlsettings.png"))); // NOI18N
        SQLSettingMenu.setText("Cài đặt cơ sở dữ liệu");
        SQLSettingMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQLSettingMenuActionPerformed(evt);
            }
        });
        jMenu1.add(SQLSettingMenu);

        changeRegulationMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        changeRegulationMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings.png"))); // NOI18N
        changeRegulationMenu.setText("Thay đổi quy định");
        changeRegulationMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeRegulationMenuActionPerformed(evt);
            }
        });
        jMenu1.add(changeRegulationMenu);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Học sinh");

        tiepNhanMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tiepNhanMenu.setText("Tiếp nhận");
        tiepNhanMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiepNhanMenuActionPerformed(evt);
            }
        });
        jMenu4.add(tiepNhanMenu);

        lapDanhSachLopMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lapDanhSachLopMenu.setText("Lập danh sách lớp");
        lapDanhSachLopMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapDanhSachLopMenuActionPerformed(evt);
            }
        });
        jMenu4.add(lapDanhSachLopMenu);

        traCuuMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        traCuuMenu.setText("Tra cứu");
        traCuuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traCuuMenuActionPerformed(evt);
            }
        });
        jMenu4.add(traCuuMenu);

        nhapBangDiemMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nhapBangDiemMenu.setText("Nhập bảng điểm môn");
        nhapBangDiemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapBangDiemMenuActionPerformed(evt);
            }
        });
        jMenu4.add(nhapBangDiemMenu);

        jMenuBar1.add(jMenu4);

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

        jMenu7.setText("Lớp học");

        classManagementMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        classManagementMenu.setText("Quản lí lớp học");
        classManagementMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classManagementMenuActionPerformed(evt);
            }
        });
        jMenu7.add(classManagementMenu);

        jMenuBar1.add(jMenu7);

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
        phanCongGiangDayMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phanCongGiangDayMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(phanCongGiangDayMenuItem);

        giaoVienChuNhiemMenuItem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        giaoVienChuNhiemMenuItem.setText("Giáo viên chủ nhiệm");
        giaoVienChuNhiemMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaoVienChuNhiemMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(giaoVienChuNhiemMenuItem);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Tổng kết");

        menuBaoCaoTongKetMon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        menuBaoCaoTongKetMon.setText("Báo cáo tổng kết môn");
        menuBaoCaoTongKetMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBaoCaoTongKetMonActionPerformed(evt);
            }
        });
        jMenu5.add(menuBaoCaoTongKetMon);

        menuBaoCaoTongKetHocKi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        menuBaoCaoTongKetHocKi.setText("Báo cáo tổng kết học kì");
        menuBaoCaoTongKetHocKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBaoCaoTongKetHocKiActionPerformed(evt);
            }
        });
        jMenu5.add(menuBaoCaoTongKetHocKi);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Tài khoản");

        loginMenu.setText("Đăng nhập");
        loginMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuActionPerformed(evt);
            }
        });
        jMenu6.add(loginMenu);

        logoutMenu.setText("Đăng xuất");
        logoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuActionPerformed(evt);
            }
        });
        jMenu6.add(logoutMenu);

        jMenuBar1.add(jMenu6);

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
        if(!checkLogin())
            return;
        if(!checkAdmin())
            return;
        Main.showPanel("cardQuanLiMonHoc");
    }//GEN-LAST:event_subjectManagerMenuItemActionPerformed

    private void quanLiNhanVienMeneuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLiNhanVienMeneuItemActionPerformed
        if(!checkLogin())
            return;
        if(!checkAdmin())
            return;
        showPanel("cardQuanLiNhanVien");
    }//GEN-LAST:event_quanLiNhanVienMeneuItemActionPerformed

    private void phanCongGiangDayMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phanCongGiangDayMenuItemActionPerformed
        if(!checkLogin())
            return;
        if(!checkAdmin())
            return;
        showPanel("cardPhanCongGiangDay");
    }//GEN-LAST:event_phanCongGiangDayMenuItemActionPerformed

    private void giaoVienChuNhiemMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaoVienChuNhiemMenuItemActionPerformed
        if(!checkLogin())
            return;
        if(!checkAdmin())
            return;
        showPanel("cardXepGVCN");
    }//GEN-LAST:event_giaoVienChuNhiemMenuItemActionPerformed

    private void tiepNhanMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiepNhanMenuActionPerformed
        if(!checkLogin())
            return;
        if(!checkAdmin())
            return;
        showPanel("cardTiepNhan");
    }//GEN-LAST:event_tiepNhanMenuActionPerformed

    private void lapDanhSachLopMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapDanhSachLopMenuActionPerformed
        if(!checkLogin())
            return;
        if(!checkAdmin())
            return;
        showPanel("cardLapDanhSach");
    }//GEN-LAST:event_lapDanhSachLopMenuActionPerformed

    private void traCuuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traCuuMenuActionPerformed
        if(!checkLogin())
            return;
        showPanel("cardTraCuuHocSinh");
    }//GEN-LAST:event_traCuuMenuActionPerformed

    private void nhapBangDiemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapBangDiemMenuActionPerformed
        if(!checkLogin())
            return;
        showPanel("cardNhapBangDiemMon");
    }//GEN-LAST:event_nhapBangDiemMenuActionPerformed

    private void menuBaoCaoTongKetMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBaoCaoTongKetMonActionPerformed
        showPanel("cardBaoCaoTongKetMon");
    }//GEN-LAST:event_menuBaoCaoTongKetMonActionPerformed

    private void menuBaoCaoTongKetHocKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBaoCaoTongKetHocKiActionPerformed
        showPanel("cardBaoCaoTongKetHocKi");
    }//GEN-LAST:event_menuBaoCaoTongKetHocKiActionPerformed

    private void changeRegulationMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeRegulationMenuActionPerformed
        if(!checkLogin())
            return;
        if(!checkAdmin())
            return;
        showPanel("cardCaiDat");
    }//GEN-LAST:event_changeRegulationMenuActionPerformed

    private void classManagementMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classManagementMenuActionPerformed
        if(!checkLogin())
            return;
        if(!checkAdmin())
            return;
        showPanel("cardQuanLiLopHoc");
    }//GEN-LAST:event_classManagementMenuActionPerformed

    private void loginMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuActionPerformed
        if(Main.user.hasLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Bạn đã đăng nhập!");
            return;
        }
        showPanel("cardDangNhap");
    }//GEN-LAST:event_loginMenuActionPerformed

    private void logoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuActionPerformed
        if(!checkLogin())
            return;
        int reply = JOptionPane.showConfirmDialog(this,
                "Bạn có muốn đăng xuất?",
                "Đăng xuất",
                JOptionPane.YES_NO_OPTION
        );
        if(reply == JOptionPane.YES_OPTION) {
            Main.user.reset();
            showPanel("cardDangNhap");
        }
    }//GEN-LAST:event_logoutMenuActionPerformed

    private boolean checkLogin() {
        if(!user.hasLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa đăng nhập!");
            return false;
        }
        return true;
    }
    
    private boolean checkAdmin() {
        if(!user.getStaffType().equals("CV001")) {
            JOptionPane.showMessageDialog(this, "Chức năng này chỉ dành cho admin!");
            return false;
        }
        return true;
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
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
    private javax.swing.JMenuItem classManagementMenu;
    private quanlihocsinh.UI.DangNhap dangNhapPanel;
    private javax.swing.JMenuItem giaoVienChuNhiemMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem lapDanhSachLopMenu;
    private quanlihocsinh.UI.LapDanhSach lapDanhSachPanel;
    private javax.swing.JMenuItem loginMenu;
    private javax.swing.JMenuItem logoutMenu;
    private static javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem menuBaoCaoTongKetHocKi;
    private javax.swing.JMenuItem menuBaoCaoTongKetMon;
    private quanlihocsinh.UI.Menu menuPanel;
    private javax.swing.JMenuItem nhapBangDiemMenu;
    private quanlihocsinh.UI.NhapBangDiemMon nhapBangDiemMonPanel;
    private quanlihocsinh.UI.nhanvien.PhanCongGiangDay phanCongGiangDay;
    private javax.swing.JMenuItem phanCongGiangDayMenuItem;
    private quanlihocsinh.UI.QuanLiLopHoc quanLiLopHoc;
    private quanlihocsinh.UI.QuanLiMonHoc quanLiMonHoc;
    private quanlihocsinh.UI.nhanvien.QuanLiNhanVien quanLiNhanVien;
    private javax.swing.JMenuItem quanLiNhanVienMeneuItem;
    private quanlihocsinh.UI.SQLSettings sqlSettingsPanel;
    private javax.swing.JMenuItem subjectManagerMenuItem;
    private javax.swing.JMenuItem tiepNhanMenu;
    private quanlihocsinh.UI.TiepNhan tiepNhanPanel;
    private quanlihocsinh.UI.TraCuuHocSinh traCuuHocSinh;
    private javax.swing.JMenuItem traCuuMenu;
    private quanlihocsinh.UI.nhanvien.XepGVCN xepGVCN;
    // End of variables declaration//GEN-END:variables
}
