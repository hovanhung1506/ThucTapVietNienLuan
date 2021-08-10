package KhachHang;

import CacHamKiemTra.KiemTraNgayHopLe;
import CacHamKiemTra.KiemTraSoDienThoai;
import JDBCConnection.ConnectSQL;
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

public class QuanLyKhachHang extends javax.swing.JPanel {

    DefaultTableModel dtm;

    public QuanLyKhachHang() {
        initComponents();
        addIcon();
        showDataKhachHang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSex = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tpKhachHang = new javax.swing.JTabbedPane();
        scKhachHang = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtTimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        lblmakh = new javax.swing.JLabel();
        lblsdt = new javax.swing.JLabel();
        lbltenkh = new javax.swing.JLabel();
        lblngaysinh = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        txtMaKH = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnRf = new javax.swing.JButton();
        txtSoluong = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        lblgioitinh = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        radKhac = new javax.swing.JRadioButton();
        btnXoa = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scKhachHang.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scKhachHang.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        scKhachHang.setViewportView(tblKhachHang);
        if (tblKhachHang.getColumnModel().getColumnCount() > 0) {
            tblKhachHang.getColumnModel().getColumn(2).setResizable(false);
        }

        tpKhachHang.addTab("tab1", scKhachHang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpKhachHang)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        lblmakh.setText("Mã khách hàng");

        lblsdt.setText("Số điện thoại");

        lbltenkh.setText("Tên khách hàng");

        lblngaysinh.setText("Ngày sinh");

        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtMaKH.setEditable(false);
        txtMaKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSdt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        txtSoluong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoluong.setText("Danh sách này có :");

        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        lblgioitinh.setText("Giới tính");

        btnGroupSex.add(radNam);
        radNam.setText("Nam");

        btnGroupSex.add(radNu);
        radNu.setText("Nữ");

        btnGroupSex.add(radKhac);
        radKhac.setText("Khác");

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
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
                            .addComponent(lbltenkh)
                            .addComponent(lblmakh)
                            .addComponent(lblsdt)
                            .addComponent(lblngaysinh)
                            .addComponent(lblgioitinh))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radNam)
                                .addGap(53, 53, 53)
                                .addComponent(radNu)
                                .addGap(36, 36, 36)
                                .addComponent(radKhac)
                                .addGap(0, 67, Short.MAX_VALUE))
                            .addComponent(txtTenKH)
                            .addComponent(txtMaKH)
                            .addComponent(txtSdt)
                            .addComponent(txtNgaySinh)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSoluong)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRf, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTimkiem)
                    .addComponent(btnTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmakh)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblsdt)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltenkh)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radNam)
                    .addComponent(lblgioitinh)
                    .addComponent(radNu)
                    .addComponent(radKhac))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblngaysinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSoluong)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        MouseClicked();
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        CleanThongTin();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnRfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfActionPerformed
        showDataKhachHang();
    }//GEN-LAST:event_btnRfActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ThemKhachHang();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SuaThongTin();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        TimKiem();
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        XoaKH();
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.ButtonGroup btnGroupSex;
    private javax.swing.JButton btnRf;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblgioitinh;
    private javax.swing.JLabel lblmakh;
    private javax.swing.JLabel lblngaysinh;
    private javax.swing.JLabel lblsdt;
    private javax.swing.JLabel lbltenkh;
    private javax.swing.JRadioButton radKhac;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JScrollPane scKhachHang;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTabbedPane tpKhachHang;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JLabel txtSoluong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables

    private void addIcon() {
        ImageIcon icon = new ImageIcon("icon/teamwork_24px.png");
        tpKhachHang.addTab("Quản lý khách hàng  ", icon, scKhachHang);
        btnClean.setIcon(new ImageIcon("icon/clean.png"));
        btnRf.setIcon(new ImageIcon("icon/refresh.png"));
        btnSua.setIcon(new ImageIcon("icon/tools.png"));
        btnThem.setIcon(new ImageIcon("icon/new.png"));
        btnTimkiem.setIcon(new ImageIcon("icon/search.png"));
        btnXoa.setIcon(new ImageIcon("icon/delete.png"));
    }

    private void showDataKhachHang() {
        try {
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Mã khách hàng", "Số điện thoại", "Tên khách hàng", "Giới tính", "Ngày sinh"});
            tblKhachHang.setModel(dtm);
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.ShowDataKhachHang}");
            ResultSet rs = cstm.executeQuery();
            int cnt = 0;
            while (rs.next()) {
                String makhachhang = rs.getString("MaKhachHang");
                String sdt = rs.getString("SoDienThoai");
                String tenkhachhang = rs.getString("TenKhachHang");
                String gioitinh = rs.getString("GioiTinh");
                String ngaysinh = rs.getString("NgaySinh");
                Vector<Object> vec = new Vector<>();
                vec.add(makhachhang);
                vec.add(sdt);
                vec.add(tenkhachhang);
                vec.add(gioitinh);
                vec.add(ngaysinh);
                dtm.addRow(vec);
                cnt++;
            }
            txtSoluong.setText("Danh sách này có: " + cnt + " khách hàng");
            con.close();
            cstm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MouseClicked() {
        int row = tblKhachHang.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMaKH.setText(tblKhachHang.getValueAt(row, 0) + "");
        txtSdt.setText(tblKhachHang.getValueAt(row, 1) + "");
        txtTenKH.setText(tblKhachHang.getValueAt(row, 2) + "");
        txtNgaySinh.setText(tblKhachHang.getValueAt(row, 4) + "");
        String gt = tblKhachHang.getValueAt(row, 3) + "";
        if (gt.equals("Nam")) {
            radNam.setSelected(true);
        }
        if (gt.equals("Nữ")) {
            radNu.setSelected(true);
        }
        if (gt.equals("Khác")) {
            radKhac.setSelected(true);
        }
    }

    private void CleanThongTin() {
        txtMaKH.setText("");
        txtTenKH.setText("");
        txtSdt.setText("");
        txtNgaySinh.setText("");
        btnGroupSex.clearSelection();
    }

    private void ThemKhachHang() {
        if (txtSdt.getText().equals("") || txtTenKH.getText().equals("") || txtNgaySinh.getText().equals("")
                || (!radNam.isSelected()) && !radNu.isSelected() && !radKhac.isSelected()) {
            JOptionPane.showMessageDialog(null, "Nhập đầy đủ các thông tin trên");
            return;
        }
        if (!KiemTraSoDienThoai.KiemTraSDT(txtSdt.getText())) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ");
            txtSdt.grabFocus();
            return;
        }
        if (!KiemTraNgayHopLe.NgayHopLe(txtNgaySinh.getText())) {
            JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ\n Định dạng hợp lệ: dd-MM-yyyy");
            txtNgaySinh.grabFocus();
            return;
        }
        String ngaysinh = null, gioitinh = null;
        if (radNam.isSelected()) {
            gioitinh = radNam.getText();
        }
        if (radNu.isSelected()) {
            gioitinh = radNu.getText();
        }
        if (radKhac.isSelected()) {
            gioitinh = radKhac.getText();
        }
        Date dob = null;
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dob = sdf1.parse(txtNgaySinh.getText());
            ngaysinh = sdf2.format(dob);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = ConnectSQL.getConnection();
        String sql = "SELECT * FROM dbo.KhachHang WHERE SoDienThoai = N'" + txtSdt.getText() + "'";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Đã tồn tại khách hàng có số điện thoại này");
                txtSdt.grabFocus();
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        int soKH = 0;
        String sql2 = "SELECT * FROM dbo.KhachHang";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql2);
            while (rs.next()) {
                soKH++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.ThemKhachHang(?,?,?,?,?)}");
            cstm.setString(1, txtSdt.getText());
            cstm.setString(2, txtTenKH.getText());
            cstm.setString(3, gioitinh);
            cstm.setString(4, ngaysinh);
            cstm.setString(5, (soKH + 1) + "");
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công");
                showDataKhachHang();
            }
            con.close();
            cstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SuaThongTin() {
        if (txtSdt.getText().equals("") || txtTenKH.getText().equals("") || txtNgaySinh.getText().equals("")
                || (!radNam.isSelected()) && !radNu.isSelected() && !radKhac.isSelected()) {
            JOptionPane.showMessageDialog(null, "Nhập đầy đủ các thông tin trên");
            return;
        }
        if (!KiemTraSoDienThoai.KiemTraSDT(txtSdt.getText())) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ");
            txtSdt.grabFocus();
            return;
        }
        if (!KiemTraNgayHopLe.NgayHopLe(txtNgaySinh.getText())) {
            JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ\n Định dạng hợp lệ: dd-MM-yyyy");
            txtNgaySinh.grabFocus();
            return;
        }
        String ngaysinh = null, gioitinh = null;
        if (radNam.isSelected()) {
            gioitinh = radNam.getText();
        }
        if (radNu.isSelected()) {
            gioitinh = radNu.getText();
        }
        if (radKhac.isSelected()) {
            gioitinh = radKhac.getText();
        }
        Date dob = null;
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dob = sdf1.parse(txtNgaySinh.getText());
            ngaysinh = sdf2.format(dob);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = ConnectSQL.getConnection();
        try {
            String sql = "SELECT MaKhachHang FROM dbo.KhachHang WHERE SoDienThoai = N'"+txtSdt.getText()+"'";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            String makh = null;
            while(rs.next())
                makh = rs.getString("MaKhachHang");
            if(!txtMaKH.getText().equals(makh)){
                JOptionPane.showMessageDialog(null, "Đã tồn tại khách hàng có số điện thoại này");
                return;
            }
            rs.close();
            s.close();
        } catch (Exception e) {
        }
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.SuaThongTinKhachHang(?,?,?,?,?)}");
            cstm.setString(1, txtMaKH.getText());
            cstm.setString(2, txtSdt.getText());
            cstm.setString(3, txtTenKH.getText());
            cstm.setString(4, gioitinh);
            cstm.setString(5, ngaysinh);
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                showDataKhachHang();
            }
            con.close();
            cstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void TimKiem() {
        if (txtTimkiem.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập từ khóa tìm kiếm");
            txtTimkiem.grabFocus();
            return;
        }
        try {
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Mã khách hàng", "Số điện thoại", "Tên khách hàng", "Giới tính", "Ngày sinh"});
            tblKhachHang.setModel(dtm);
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.TimKiemKhachHang(?)}");
            cstm.setString(1, txtTimkiem.getText());
            ResultSet rs = cstm.executeQuery();
            int cnt = 0;
            while (rs.next()) {
                String makh = rs.getString("MaKhachHang");
                String sdt = rs.getString("SoDienThoai");
                String tenkh = rs.getString("TenKhachHang");
                String gioitinh = rs.getString("GioiTinh");
                String ngaysinh = rs.getString("NgaySinh");
                Vector<Object> vec = new Vector<>();
                vec.add(makh);
                vec.add(sdt);
                vec.add(tenkh);
                vec.add(gioitinh);
                vec.add(ngaysinh);
                dtm.addRow(vec);
                cnt++;
            }
            if (cnt == 0) {
                JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả");
                showDataKhachHang();
                return;
            }
            txtSoluong.setText("Danh sách này có: " + cnt + " khách hàng");
            con.close();
            rs.close();
            cstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void XoaKH() {
        if (txtMaKH.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập mã khách hàng");
            return;
        }
        Connection con = ConnectSQL.getConnection();
        try {
            String sql = "SELECT * FROM dbo.HoaDon WHERE MaKhachHang = " + txtMaKH.getText() + "";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Chỉ xóa được khách hàng chưa mua hàng");
                return;
            }
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        int traloi = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa", "Messagse", JOptionPane.YES_NO_OPTION);
        if(traloi == JOptionPane.YES_OPTION){
            try {
                String sql = "DELETE dbo.KhachHang WHERE MaKhachHang = "+txtMaKH.getText()+"";
                Statement stm = con.createStatement();
                int x = stm.executeUpdate(sql);
                if(x == 1){
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                    showDataKhachHang();
                }
                stm.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
