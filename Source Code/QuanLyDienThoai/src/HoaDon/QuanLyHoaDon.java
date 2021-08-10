package HoaDon;

import CacHamKiemTra.KiemTraNgayHopLe;
import CacHamKiemTra.KiemTraSo;
import JDBCConnection.ConnectSQL;
import ManHinhChinh.HomeScreen;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyHoaDon extends javax.swing.JPanel {

    DefaultTableModel dtm;
    String manhanvien;

    public QuanLyHoaDon(String manv) {
        manhanvien = manv;
        initComponents();
        addIcon();
        showDataHoaDon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tpHoaDon = new javax.swing.JTabbedPane();
        scHoaDon = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMahd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNgayban = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMakh = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnRf = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXemChiTiet = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        txtSoluong = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbott = new javax.swing.JComboBox<>();
        btnInHD = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scHoaDon.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scHoaDon.setToolTipText("");
        scHoaDon.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        scHoaDon.setViewportView(tblHoaDon);

        tpHoaDon.addTab("tab1", scHoaDon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpHoaDon)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã hóa đơn");

        txtMahd.setEditable(false);
        txtMahd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setText("Mã nhân viên");

        txtManv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setText("Ngày bán");

        txtNgayban.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setText("Giá");

        txtGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setText("Mã khách hàng");

        txtMakh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        btnRf.setText("Refresh");
        btnRf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRfActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnXemChiTiet.setText("Xem chi tiết");
        btnXemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietActionPerformed(evt);
            }
        });

        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        txtSoluong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoluong.setText("Danh sách này có");

        jLabel6.setText("Trạng thái");

        cbott.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã thanh toán", "Đang chờ" }));

        btnInHD.setText("In hóa đơn");
        btnInHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMahd, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(txtManv)
                                    .addComponent(txtNgayban)
                                    .addComponent(txtGia)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbott, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSoluong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXemChiTiet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMahd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgayban, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbott, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnXemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSoluong)
                    .addComponent(btnInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        MouseClicked();
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        TimKiem();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ThemHoaDon();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        CleanThongTin();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SuaHoaDon();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietActionPerformed
        if (txtMahd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chọn hóa đơn để xem chi tiết");
            return;
        }
        String trangthai = cbott.getSelectedItem().toString();
        ChiTietHoaDon cthd = new ChiTietHoaDon(txtMahd.getText(), trangthai);
        cthd.showChiTietHoaDon(txtMahd.getText(), trangthai);
    }//GEN-LAST:event_btnXemChiTietActionPerformed

    private void btnRfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfActionPerformed
        showDataHoaDon();
    }//GEN-LAST:event_btnRfActionPerformed

    private void btnInHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHDActionPerformed
        InHoaDon();
    }//GEN-LAST:event_btnInHDActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        XoaHD();
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnInHD;
    private javax.swing.JButton btnRf;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXemChiTiet;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbott;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scHoaDon;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTabbedPane tpHoaDon;
    private javax.swing.JTextField txtGia;
    public javax.swing.JTextField txtMahd;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtNgayban;
    private javax.swing.JLabel txtSoluong;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void addIcon() {
        ImageIcon icon = new ImageIcon("icon/invoice_24px.png");
        tpHoaDon.addTab("Quản lý hóa đơn  ", icon, scHoaDon);
        btnClean.setIcon(new ImageIcon("icon/clean.png"));
        btnInHD.setIcon(new ImageIcon("icon/printer_24px.png"));
        btnRf.setIcon(new ImageIcon("icon/refresh.png"));
        btnSua.setIcon(new ImageIcon("icon/tools.png"));
        btnThem.setIcon(new ImageIcon("icon/new.png"));
        btnTimKiem.setIcon(new ImageIcon("icon/search.png"));
        btnXemChiTiet.setIcon(new ImageIcon("icon/bar_24px.png"));
        btnXoa.setIcon(new ImageIcon("icon/delete.png"));
    }

    private void showDataHoaDon() {
        try {
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Mã hóa đơn", "Mã nhân viên", "Ngày bán", "Giá Bán", "Mã khách hàng", "Trạng thái"});
            tblHoaDon.setModel(dtm);
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.ShowDataHoaDon}");
            ResultSet rs = cstm.executeQuery();
            int cnt = 0;
            while (rs.next()) {
                String mahd = rs.getString("MaHoaDon");
                String manv = rs.getString("MaNhanVien");
                String ngayban = rs.getString("NgayBan");
                String giaban = rs.getString("GiaBan");
                String makh = rs.getString("MaKhachHang");
                String tt = rs.getString("TrangThai");
                Vector<Object> vec = new Vector<>();
                vec.add(mahd);
                vec.add(manv);
                vec.add(ngayban);
                vec.add(giaban);
                vec.add(makh);
                vec.add(tt);
                dtm.addRow(vec);
                cnt++;
            }
            txtSoluong.setText("Danh sách này có: " + cnt + " hóa đơn");
            con.close();
            cstm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbott.setSelectedItem("Đang chờ");
    }

    private void MouseClicked() {
        int row = tblHoaDon.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMahd.setText(tblHoaDon.getValueAt(row, 0) + "");
        txtManv.setText(tblHoaDon.getValueAt(row, 1) + "");
        txtNgayban.setText(tblHoaDon.getValueAt(row, 2) + "");
        txtGia.setText(tblHoaDon.getValueAt(row, 3) + "");
        txtMakh.setText(tblHoaDon.getValueAt(row, 4) + "");
        String tt = tblHoaDon.getValueAt(row, 5) + "";
        cbott.setSelectedItem(tt);
    }

    private void TimKiem() {
        if (txtTimKiem.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập từ khóa");
            txtTimKiem.grabFocus();
            return;
        }
        try {
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Mã hóa đơn", "Mã nhân viên", "Ngày bán", "Giá bán", "Mã khách hàng", "Trạng thái"});
            tblHoaDon.setModel(dtm);
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.TimKiemHoaDon(?)}");
            cstm.setString(1, txtTimKiem.getText());
            ResultSet rs = cstm.executeQuery();
            int cnt = 0;
            while (rs.next()) {
                String mahd = rs.getString("MaHoaDon");
                String manv = rs.getString("MaNhanVien");
                String ngayban = rs.getString("NgayBan");
                String giaban = rs.getString("GiaBan");
                String makh = rs.getString("MaKhachHang");
                String tt = rs.getString("TrangThai");
                Vector<Object> vec = new Vector<>();
                vec.add(mahd);
                vec.add(manv);
                vec.add(ngayban);
                vec.add(giaban);
                vec.add(makh);
                vec.add(tt);
                dtm.addRow(vec);
                cnt++;
            }
            if (cnt == 0) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả");
                showDataHoaDon();
            }
            txtSoluong.setText("Danh sách này có " + cnt + " hóa đơn");
            con.close();
            cstm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CleanThongTin() {
        txtMahd.setText("");
        txtManv.setText("");
        txtGia.setText("");
        txtNgayban.setText("");
        txtMakh.setText("");
        cbott.setSelectedItem(null);
    }

    private void ThemHoaDon() {
        if (txtMakh.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập đầy đủ thông tin");
            return;
        }
        String manv = null;
        if (txtManv.getText().equals("")) {
            manv = manhanvien;
        } else {
            manv = txtManv.getText();
            try {
                Connection con = ConnectSQL.getConnection();
                String sql = "SELECT MaNhanVien FROM dbo.NhanVien WHERE MaNhanVien = " + manv + "";
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "Không tồn tại người có mã nhân viên này");
                    return;
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Connection con = ConnectSQL.getConnection();
        int soHD = 0;
        String sql = "SELECT * FROM dbo.HoaDon";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                soHD++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            CallableStatement cstm = con.prepareCall("{call dbo.ThemHoaDon(?,?,?)}");
            cstm.setString(1, manv);
            cstm.setString(2, txtMakh.getText());
            cstm.setString(3, (soHD + 1) + "");
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Thêm hóa đơn thành công");
                showDataHoaDon();
            }
            con.close();
            cstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SuaHoaDon() {
        int row = tblHoaDon.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn hóa đơn và điền đầy đủ thông tin");
            return;
        }
        if(!tblHoaDon.getValueAt(row, 5).toString().equals("Đang chờ")){
            if(!cbott.getSelectedItem().toString().equals("Đang chờ")){
                JOptionPane.showMessageDialog(null, "Hóa đơn này đã được thanh toán\nBạn cần chuyển về trạng thái đang chờ để sửa đổi");
                return;
            }
        }
        String manv = null;
        if (txtManv.getText().equals("")) {
            manv = manhanvien;
        } else {
            manv = txtManv.getText();
        }
        if (!KiemTraNgayHopLe.NgayHopLe(txtNgayban.getText())) {
            JOptionPane.showMessageDialog(null, "Ngày không hợp lệ");
            return;
        }
        String ngayban = null;
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
            date1 = sdf1.parse(txtNgayban.getText());
            ngayban = sdf2.format(date1);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.SuaHoaDon(?,?,?,?,?)}");
            cstm.setString(1, manv);
            cstm.setString(2, ngayban);
            cstm.setString(3, txtMakh.getText());
            String tt = (String) cbott.getSelectedItem();
            cstm.setString(4, tt);
            cstm.setString(5, txtMahd.getText());
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Sửa hóa đơn thành công");
                showDataHoaDon();
            }
            con.close();
            cstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void InHoaDon() {
        if (txtMahd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hãy chọn hóa đơn để in");
            return;
        }
        String tt = cbott.getSelectedItem().toString();
        if (tt.equals("Đang chờ")) {
            JOptionPane.showMessageDialog(null, "Khách hàng chưa thanh toán cho hóa đơn này");
            return;
        }
        Connection con = ConnectSQL.getConnection();
        String mahd = txtMahd.getText();
        String tenkh = null, sdt = null, tennv = null, giaban = null;
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.InKH(?)}");
            cstm.setString(1, mahd);
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                tenkh = rs.getString("TenKhachHang");
                sdt = rs.getString("SoDienThoai");
                tennv = rs.getString("TenNhanVien");
            }
            cstm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        String h1 = String.format("Mã hóa đơn: " + mahd + "\nTên khách hàng: " + tenkh + "\t Số điện thoại: " + sdt + "\nTên nhân viên : "
                + tennv + "\t Ngày bán     : " + txtNgayban.getText() + "\nDanh sách các sản phẩm\n");
        String h2 = String.format("STT\t" + "Tên hàng\t\t\t    " + "Số lượng\t " + "Giá\n");
        String total = h1 + h2;
        int stt = 0;
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.InHoaDon(?)}");
            cstm.setString(1, mahd);
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                String tenhang = rs.getString("TenHang");
                String soluong = rs.getString("SoLuong");
                String gia = rs.getString("Gia");
                giaban = rs.getString("GiaBan");
                stt++;
                String h3 = String.format("%-8d%-40s%-8s%7s\n", stt, tenhang, soluong, gia);
                total += h3;
            }
            cstm.close();
            rs.close();
            con.close();
            String h4 = "Tổng: " + giaban + " VNĐ";
            total += h4;
            GhiHoaDon(total);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void GhiHoaDon(String hoadon) {
        File f = new File("hoadon.txt");
        if (!f.isFile()) {
            try {
                f.createNewFile();
            } catch (Exception ex) {
                Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(hoadon.getBytes("UTF-8"));
            fos.close();
            JOptionPane.showMessageDialog(null, "Xuất hóa đơn thành công");
        } catch (Exception ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        ProcessBuilder pb = new ProcessBuilder("Notepad.exe","hoadon.txt");
        try {
            pb.start();
        } catch (IOException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void XoaHD() {
        Connection con = ConnectSQL.getConnection();
        String trangthai = null;
        if (txtMahd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chọn hóa đơn để xóa");
            return;
        }
        String sql = "SELECT TrangThai FROM dbo.HoaDon WHERE MaHoaDon = " + txtMahd.getText() + "";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                trangthai = rs.getString("TrangThai");
            }
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (trangthai.equals("Đã thanh toán")) {
            JOptionPane.showMessageDialog(null, "Chỉ xóa được hóa đơn chưa thanh toán");
            return;
        }
        int traloi = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa", "Messgase", JOptionPane.YES_NO_OPTION);
        if (traloi == JOptionPane.YES_OPTION) {
            try {
                CallableStatement cstm = con.prepareCall("{call dbo.XoaHD(?)}");
                cstm.setString(1, txtMahd.getText());
                int x = cstm.executeUpdate();
                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                    showDataHoaDon();
                }
                cstm.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
