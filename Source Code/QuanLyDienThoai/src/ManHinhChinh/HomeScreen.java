package ManHinhChinh;

import DangNhap.Login;
import DoanhThu.QuanLyDoanhThu;
import HoaDon.QuanLyHoaDon;
import JDBCConnection.ConnectSQL;
import KhachHang.QuanLyKhachHang;
import MatHang.QuanLyMatHang;
import NhanVien.QuanLyNhanVien;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HomeScreen extends javax.swing.JFrame implements Runnable {

    public HomeScreen(String tendangnhap) {
        initComponents();
        addIcon();
        ThongTinNgay();
        Thread t = new Thread(this);
        t.start();
        setTitle("Quản lý cửa hàng điện thoại");
        setLocationRelativeTo(null);
        LoadInfo(tendangnhap);
        showHome();
        ThongTinThoiGian();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnHome = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnQLMH = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnQLKH = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnQLHD = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnQLNV = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnQLDT = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnDangXuat = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        pnInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtManv = new javax.swing.JLabel();
        txtTennv = new javax.swing.JLabel();
        pnNgayThang = new javax.swing.JPanel();
        lblThu = new javax.swing.JLabel();
        pnGio = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnHome.setText("          Home          ");
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHome);
        jToolBar1.add(jSeparator2);

        btnQLMH.setText("  Quản lý mặt hàng ");
        btnQLMH.setFocusable(false);
        btnQLMH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLMH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMHActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLMH);
        jToolBar1.add(jSeparator3);

        btnQLKH.setText("Quản lý khách hàng");
        btnQLKH.setFocusable(false);
        btnQLKH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLKH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKHActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLKH);
        jToolBar1.add(jSeparator4);

        btnQLHD.setText("   Quản lý hóa đơn  ");
        btnQLHD.setFocusable(false);
        btnQLHD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLHD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLHD);
        jToolBar1.add(jSeparator5);

        btnQLNV.setText(" Quản lý nhân viên ");
        btnQLNV.setFocusable(false);
        btnQLNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLNV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLNV);
        jToolBar1.add(jSeparator6);

        btnQLDT.setText(" Quản lý doanh thu ");
        btnQLDT.setFocusable(false);
        btnQLDT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLDT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDTActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLDT);
        jToolBar1.add(jSeparator7);

        btnDangXuat.setText(" Đăng xuất ");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);
        jToolBar1.add(jSeparator9);

        pnInfo.setBackground(new java.awt.Color(204, 255, 255));
        pnInfo.setAutoscrolls(true);

        jLabel1.setText("Mã nhân viên:");

        jLabel2.setText("Tên nhân viên:");

        txtManv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtManv.setText("1");

        txtTennv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTennv.setText("Chủ quán");

        javax.swing.GroupLayout pnInfoLayout = new javax.swing.GroupLayout(pnInfo);
        pnInfo.setLayout(pnInfoLayout);
        pnInfoLayout.setHorizontalGroup(
            pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInfoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtManv, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addGroup(pnInfoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTennv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnInfoLayout.setVerticalGroup(
            pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtManv))
                .addGap(27, 27, 27)
                .addGroup(pnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTennv))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jToolBar1.add(pnInfo);

        pnNgayThang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblThu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblThu.setText("Hôm nay thứ");

        javax.swing.GroupLayout pnNgayThangLayout = new javax.swing.GroupLayout(pnNgayThang);
        pnNgayThang.setLayout(pnNgayThangLayout);
        pnNgayThangLayout.setHorizontalGroup(
            pnNgayThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNgayThangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThu)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnNgayThangLayout.setVerticalGroup(
            pnNgayThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNgayThangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblThu)
                .addGap(40, 40, 40))
        );

        pnGio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        timeLabel.setText("Thời gian");

        javax.swing.GroupLayout pnGioLayout = new javax.swing.GroupLayout(pnGio);
        pnGio.setLayout(pnGioLayout);
        pnGioLayout.setHorizontalGroup(
            pnGioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(timeLabel)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        pnGioLayout.setVerticalGroup(
            pnGioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timeLabel)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnNgayThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnGio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnNgayThang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnGio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnMain.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        Login l = new Login();
        dispose();
        l.showLogin();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnQLMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMHActionPerformed
        setBorder();
        btnQLMH.setBorder(BorderFactory.createLineBorder(Color.red));
        QuanLyMatHang mh = new QuanLyMatHang();
        addManHinh(mh);
    }//GEN-LAST:event_btnQLMHActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        setBorder();
        btnHome.setBorder(BorderFactory.createLineBorder(Color.red));
        showHome();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNVActionPerformed
        if (txtManv.getText().equals("1")) {
            setBorder();
            btnQLNV.setBorder(BorderFactory.createLineBorder(Color.red));
            QuanLyNhanVien nv = new QuanLyNhanVien();
            addManHinh(nv);
        } else {
            JOptionPane.showMessageDialog(null, "Chỉ có quản lý mới sử dụng được chức năng này", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnQLNVActionPerformed

    private void btnQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKHActionPerformed
        setBorder();
        btnQLKH.setBorder(BorderFactory.createLineBorder(Color.red));
        QuanLyKhachHang kh = new QuanLyKhachHang();
        addManHinh(kh);
    }//GEN-LAST:event_btnQLKHActionPerformed

    private void btnQLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHDActionPerformed
        setBorder();
        btnQLHD.setBorder(BorderFactory.createLineBorder(Color.red));
        QuanLyHoaDon hd = new QuanLyHoaDon(txtManv.getText());
        addManHinh(hd);
    }//GEN-LAST:event_btnQLHDActionPerformed

    private void btnQLDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDTActionPerformed
        setBorder();
        btnQLDT.setBorder(BorderFactory.createLineBorder(Color.red));
        QuanLyDoanhThu dt = new QuanLyDoanhThu();
        addManHinh(dt);
    }//GEN-LAST:event_btnQLDTActionPerformed

    public void ShowManHinhChinh(String tendangnhap) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen(tendangnhap).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnQLDT;
    private javax.swing.JButton btnQLHD;
    private javax.swing.JButton btnQLKH;
    private javax.swing.JButton btnQLMH;
    private javax.swing.JButton btnQLNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblThu;
    private javax.swing.JPanel pnGio;
    private javax.swing.JPanel pnInfo;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnNgayThang;
    private javax.swing.JLabel timeLabel;
    public javax.swing.JLabel txtManv;
    private javax.swing.JLabel txtTennv;
    // End of variables declaration//GEN-END:variables

    private void LoadInfo(String tendn) {
        String manv = null, tennv;
        Connection con = ConnectSQL.getConnection();
        String sql = "SELECT * FROM dbo.NhanVien  WHERE TenDangNhap = N'" + tendn + "'";
        try {
            Statement sttm = con.createStatement();
            ResultSet rs = sttm.executeQuery(sql);
            while (rs.next()) {
                txtManv.setText("");
                txtTennv.setText("");
                manv = rs.getString("MaNhanVien");
                tennv = rs.getString("TenNhanVien");
                txtManv.setText(manv);
                txtTennv.setText(tennv);
            }
            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addManHinh(Component component) {
        pnMain.removeAll();
        pnMain.add(component);
        pnMain.repaint();
        pnMain.revalidate();
    }

    private void showHome() {
        XinChao xc = new XinChao();
        addManHinh(xc);
    }

    private void ThongTinNgay() {
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        //int ngay = c.get(Calendar.DATE);
        String ngay = new SimpleDateFormat("dd").format(date);
        String thang = new SimpleDateFormat("MM").format(date);
        int nam = c.get(Calendar.YEAR);
        if (dayOfWeek == 1) {
            lblThu.setText("Chủ nhật," + " ngày " + ngay + " tháng " + thang + " năm " + nam);
        } else if (dayOfWeek == 2) {
            lblThu.setText("Thứ 2," + " ngày " + ngay + " tháng " + thang + " năm " + nam);
        } else if (dayOfWeek == 3) {
            lblThu.setText("Thứ 3," + " ngày " + ngay + " tháng " + thang + " năm " + nam);
        } else if (dayOfWeek == 4) {
            lblThu.setText("Thứ 4," + " ngày " + ngay + " tháng " + thang + " năm " + nam);
        } else if (dayOfWeek == 5) {
            lblThu.setText("Thứ 5," + " ngày " + ngay + " tháng " + thang + " năm " + nam);
        } else if (dayOfWeek == 6) {
            lblThu.setText("Thứ 6," + " ngày " + ngay + " tháng " + thang + " năm " + nam);
        } else if (dayOfWeek == 7) {
            lblThu.setText("Thứ 7," + " ngày " + ngay + " tháng " + thang + " năm " + nam);
        }
    }

    private void ThongTinThoiGian() {

    }

    @Override
    public void run() {
        int hour, second, minute;
        while (true) {
            Calendar cal = Calendar.getInstance();
            hour = cal.get(Calendar.HOUR_OF_DAY);
            minute = cal.get(Calendar.MINUTE);
            second = cal.get(Calendar.SECOND);
            SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm:ss aa");
            Date dat = cal.getTime();
            String time = sdf12.format(dat);
            timeLabel.setText(time);
        }
    }

    private void addIcon() {
        btnHome.setIcon(new ImageIcon("icon/homepage.png"));
        btnDangXuat.setIcon(new ImageIcon("icon/logout.png"));
        btnQLDT.setIcon(new ImageIcon("icon/revenue.png"));
        btnQLHD.setIcon(new ImageIcon("icon/invoice.png"));
        btnQLKH.setIcon(new ImageIcon("icon/teamwork.png"));
        btnQLMH.setIcon(new ImageIcon("icon/inventory.png"));
        btnQLNV.setIcon(new ImageIcon("icon/work.png"));
    }

    private void setBorder() {
        btnHome.setBorder(null);
        btnQLDT.setBorder(null);
        btnQLHD.setBorder(null);
        btnQLKH.setBorder(null);
        btnQLMH.setBorder(null);
        btnQLNV.setBorder(null);
    }
}
