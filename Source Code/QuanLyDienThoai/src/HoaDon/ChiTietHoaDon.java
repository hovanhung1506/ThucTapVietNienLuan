package HoaDon;

import CacHamKiemTra.KiemTraSo;
import JDBCConnection.ConnectSQL;
import ManHinhChinh.HomeScreen;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ChiTietHoaDon extends javax.swing.JFrame {

    DefaultTableModel dtm;
    String mhd;
    int cnt = 0;
    String tt = null;

    public ChiTietHoaDon(String ma, String trangthai) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Chi tiết hóa đơn");
        addIcon();
        showDataCTHD(ma);
        mhd = ma;
        tt = trangthai;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tpCTHD = new javax.swing.JTabbedPane();
        scCTHD = new javax.swing.JScrollPane();
        tblCTHD = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtMCTHD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMHD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnRf = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        txtSoluongma = new javax.swing.JLabel();
        txtMaHang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboTenHang = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scCTHD.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scCTHD.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblCTHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTHDMouseClicked(evt);
            }
        });
        scCTHD.setViewportView(tblCTHD);

        tpCTHD.addTab("tab1", scCTHD);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tpCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpCTHD)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMCTHD.setEditable(false);
        txtMCTHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setText("Mã chi tiết hóa đơn");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã hóa đơn");

        txtMHD.setEditable(false);
        txtMHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setText("Mã hàng");

        jLabel4.setText("Số lượng");

        txtSoluong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnRf.setText("Refresh");
        btnRf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRfActionPerformed(evt);
            }
        });

        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        txtSoluongma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoluongma.setText("Có n mã chi tiết hóa đơn");

        txtMaHang.setEditable(false);
        txtMaHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setText("Giá");

        txtGia.setEditable(false);
        txtGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setText("Tên hàng");

        cboTenHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboTenHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSoluongma)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(btnRf, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(txtSoluong, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtMCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtMHD, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboTenHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaHang))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtMHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClean, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoluongma, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTHDMouseClicked
        MouseClicked();
    }//GEN-LAST:event_tblCTHDMouseClicked

    private void cboTenHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenHangActionPerformed
        setThongTinHang();
    }//GEN-LAST:event_cboTenHangActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        CleanThongTin();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ThemCTHD();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnRfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfActionPerformed
        showDataCTHD(mhd);
    }//GEN-LAST:event_btnRfActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        XoaCTHD();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SuaCTHD();
    }//GEN-LAST:event_btnSuaActionPerformed

    public void showChiTietHoaDon(String ma, String trangthai) {
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
            java.util.logging.Logger.getLogger(ChiTietHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietHoaDon(ma, trangthai).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnRf;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTenHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scCTHD;
    private javax.swing.JTable tblCTHD;
    private javax.swing.JTabbedPane tpCTHD;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMCTHD;
    public javax.swing.JTextField txtMHD;
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JLabel txtSoluongma;
    // End of variables declaration//GEN-END:variables

    private void addIcon() {
        ImageIcon icon = new ImageIcon("icon/slip_24px.png");
        tpCTHD.addTab("Chi tiết hóa đơn  ", icon, scCTHD);
        btnClean.setIcon(new ImageIcon("icon/clean.png"));
        btnRf.setIcon(new ImageIcon("icon/refresh.png"));
        btnSua.setIcon(new ImageIcon("icon/tools.png"));
        btnThem.setIcon(new ImageIcon("icon/add-to-cart_24px.png"));
        btnXoa.setIcon(new ImageIcon("icon/delete.png"));
    }

    public void showDataCTHD(String mahoadon) {
        txtMHD.setText(mahoadon);
        try {
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Mã chi tiết hóa đơn", "Mã hóa đơn", "Mã hàng", "Tên hàng", "Số lượng", "Giá"});
            tblCTHD.setModel(dtm);
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.ShowDataCTHD(?)}");
            cstm.setString(1, mahoadon);
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                String macthd = rs.getString("MaCTHD");
                String mahd = rs.getString("MaHoaDon");
                String mahang = rs.getString("MaHang");
                String tenhang = rs.getString("TenHang");
                String soluong = rs.getString("SoLuong");
                String gia = rs.getString("Gia");
                Vector<Object> vec = new Vector<>();
                vec.add(macthd);
                vec.add(mahd);
                vec.add(mahang);
                vec.add(tenhang);
                vec.add(soluong);
                vec.add(gia);
                dtm.addRow(vec);
                cnt++;
            }
            txtSoluongma.setText("Có " + cnt + " mã chi tiết hóa đơn");
            con.close();
            cstm.close();
            rs.close();
            napMaHang();
            cboTenHang.setSelectedItem(null);
            txtMaHang.setText("");
            txtGia.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void napMaHang() {
        try {
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.NapMaHang}");
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                String mahang = rs.getString("TenHang");
                cboTenHang.addItem(mahang);
            }
            con.close();
            cstm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void MouseClicked() {
        int row = tblCTHD.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMCTHD.setText(tblCTHD.getValueAt(row, 0) + "");
        txtMHD.setText(tblCTHD.getValueAt(row, 1) + "");
        txtMaHang.setText(tblCTHD.getValueAt(row, 2) + "");
        String tenhang = tblCTHD.getValueAt(row, 3) + "";
        cboTenHang.setSelectedItem(tenhang);
        txtSoluong.setText(tblCTHD.getValueAt(row, 4) + "");
        txtGia.setText(tblCTHD.getValueAt(row, 5) + "");
    }

    private void setThongTinHang() {
        int vt = cboTenHang.getSelectedIndex();
        if (vt != -1) {
            try {
                Connection con = ConnectSQL.getConnection();
                CallableStatement cstm = con.prepareCall("{call dbo.DuLieuHang(?)}");
                cstm.setString(1, cboTenHang.getSelectedItem() + "");
                ResultSet rs = cstm.executeQuery();
                while (rs.next()) {
                    txtMaHang.setText(rs.getString("MaHang"));
                    txtGia.setText(rs.getString("Gia"));
                }
                con.close();
                cstm.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void CleanThongTin() {
        txtMCTHD.setText("");
        txtMaHang.setText("");
        txtSoluong.setText("");
        cboTenHang.setSelectedItem(null);
        txtGia.setText("");
    }

    private void ThemCTHD() {
        if (tt.equals("Đã thanh toán")) {
            JOptionPane.showMessageDialog(null, "Hóa đơn này đã thanh toán không thể thêm");
            return;
        }
        int index = cboTenHang.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Hãy chọn mặt hàng để thêm");
            return;
        }
        if (!KiemTraSo.Kiemtra(txtSoluong.getText()) || txtSoluong.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0");
            txtSoluong.grabFocus();
            return;
        }
        Connection con = ConnectSQL.getConnection();
        try {
            String sql = "SELECT SoLuong FROM dbo.MatHang WHERE MaHang = " + txtMaHang.getText() + "";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            int soluongmua = Integer.parseInt(txtSoluong.getText());
            int soluongcon = 0;
            while (rs.next()) {
                String sl = rs.getString("SoLuong");
                soluongcon = Integer.parseInt(sl);
            }
            if (soluongmua > soluongcon) {
                JOptionPane.showMessageDialog(null, "Số lượng mua đã vượt quá số lượng hàng còn");
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        int soCTHD = 0;
        try {
            String sql = "SELECT * FROM dbo.ChiTietHoaDon";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                soCTHD++;
            }
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String sql = "SELECT * FROM dbo.ChiTietHoaDon WHERE MaHoaDon = " + txtMHD.getText() + " AND MaHang = " + txtMaHang.getText() + "";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                String sql2 = "UPDATE dbo.ChiTietHoaDon SET SoLuong = SoLuong + " + txtSoluong.getText() + " WHERE MaHoaDon = " + txtMHD.getText() + " AND MaHang = " + txtMaHang.getText() + "";
                int x = stm.executeUpdate(sql2);
                if (x > 0) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                    showDataCTHD(mhd);
                    return;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            CallableStatement cstm = con.prepareCall("{call dbo.ThemCTHD(?,?,?,?,?,?)}");
            cstm.setString(1, mhd);
            cstm.setString(2, txtMaHang.getText());
            cstm.setString(3, cboTenHang.getSelectedItem() + "");
            cstm.setString(4, txtSoluong.getText());
            cstm.setString(5, txtGia.getText());
            cstm.setString(6, (soCTHD + 1) + "");
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                showDataCTHD(mhd);
            }
            con.close();
            cstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void XoaCTHD() {
        if (tt.equals("Đã thanh toán")) {
            JOptionPane.showMessageDialog(null, "Không thể xóa chi tiết hóa đơn của hóa đơn đã thanh toán");
            return;
        }
        if (txtMCTHD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chọn mã chi tiết để xóa");
            return;
        }
        Connection con = ConnectSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.XoaCTHD(?)}");
            cstm.setString(1, txtMCTHD.getText());
            int x = cstm.executeUpdate();
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                showDataCTHD(txtMHD.getText());
            }
            con.close();
            cstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SuaCTHD() {

        if (!tt.equals("Đang chờ")) {
            JOptionPane.showMessageDialog(null, "Không thể sửa chi tiết của hóa đơn đã thanh toán\n"
                    + "Bạn cần chuyển hóa đơn về trạng thái đang chờ");
            return;
        }
        if (!KiemTraSo.Kiemtra(txtSoluong.getText()) || txtSoluong.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0");
            txtSoluong.grabFocus();
            return;
        }
        try {
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.SuaCTHD(?,?,?,?,?)}");
            cstm.setString(1, txtMaHang.getText());
            cstm.setString(2, cboTenHang.getSelectedItem() + "");
            cstm.setString(3, txtSoluong.getText());
            cstm.setString(4, txtGia.getText());
            cstm.setString(5, txtMCTHD.getText());
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                showDataCTHD(txtMHD.getText());
            }
            con.close();
            cstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
