package NhanVien;

import CacHamKiemTra.KiemTraSo;
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

public class QuanLyNhanVien extends javax.swing.JPanel {

    DefaultTableModel dtm;

    public QuanLyNhanVien() {
        initComponents();
        addIcon();
        showDataNhanVien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGT = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        lblmanv = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        lbltennv = new javax.swing.JLabel();
        txtTennv = new javax.swing.JTextField();
        lblngaysinh = new javax.swing.JLabel();
        txtNgsinh = new javax.swing.JTextField();
        lblgioitinh = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        radKhac = new javax.swing.JRadioButton();
        lblngaybdlv = new javax.swing.JLabel();
        txtNgaybdlv = new javax.swing.JTextField();
        lblluong = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnRf = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        lblSoLuongKH = new javax.swing.JLabel();
        lbldiachi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lbltendn = new javax.swing.JLabel();
        txtTendn = new javax.swing.JTextField();
        lblmatkhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        lblsdt = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        lbltrangthai = new javax.swing.JLabel();
        cbott = new javax.swing.JComboBox<>();
        lbltimkiem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tpQLNV = new javax.swing.JTabbedPane();
        scpQLNV = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        lblmanv.setText("Mã nhân viên");

        txtManv.setEditable(false);
        txtManv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbltennv.setText("Tên nhân viên");

        txtTennv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblngaysinh.setText("Ngày sinh");

        txtNgsinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblgioitinh.setText("Giới Tính");

        btnGroupGT.add(radNam);
        radNam.setText("Nam");

        btnGroupGT.add(radNu);
        radNu.setText("Nữ");

        btnGroupGT.add(radKhac);
        radKhac.setText("Khác");

        lblngaybdlv.setText("Ngày bắt đầu làm việc");

        txtNgaybdlv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblluong.setText("Lương");

        txtLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        lblSoLuongKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSoLuongKH.setText("Danh sách này có: ");

        lbldiachi.setText("Địa chỉ");

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbltendn.setText("Tên đăng nhập");

        txtTendn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblmatkhau.setText("Mật khẩu");

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblsdt.setText("Số điện thoại");

        txtSdt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSdt.setPreferredSize(new java.awt.Dimension(6, 35));

        lbltrangthai.setText("Trạng thái");

        cbott.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang làm việc", "Đã nghỉ việc" }));

        lbltimkiem.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmanv)
                                    .addComponent(lblgioitinh))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(radNam)
                                                .addGap(42, 42, 42)
                                                .addComponent(radNu)
                                                .addGap(55, 55, 55)
                                                .addComponent(radKhac))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtTendn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNgaybdlv, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(55, 55, 55))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblmatkhau)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbltennv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbldiachi)
                                            .addComponent(lblluong))
                                        .addGap(123, 123, 123)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltendn)
                                    .addComponent(lblngaybdlv))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNgsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblngaysinh)
                                    .addComponent(lblsdt)
                                    .addComponent(lbltimkiem)
                                    .addComponent(lbltrangthai))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbott, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSdt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(116, 116, 116))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSoLuongKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltennv)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmanv)
                    .addComponent(txtNgsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblngaysinh)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgioitinh)
                    .addComponent(radNam)
                    .addComponent(radNu)
                    .addComponent(radKhac)
                    .addComponent(lbldiachi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsdt)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblngaybdlv)
                    .addComponent(txtNgaybdlv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblluong)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltrangthai)
                    .addComponent(cbott, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTendn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmatkhau)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltendn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltimkiem)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSoLuongKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClean, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tpQLNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        scpQLNV.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scpQLNV.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        scpQLNV.setViewportView(tblNhanVien);

        tpQLNV.addTab("Quản lý nhân viên", scpQLNV);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, 1550, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 310, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 383, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        MouseClicked();
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        CleanThongTin();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnRfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfActionPerformed
        showDataNhanVien();
    }//GEN-LAST:event_btnRfActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SuaThongTinNhanVien();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ThemNhanVien();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        TimkiemNV();
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.ButtonGroup btnGroupGT;
    private javax.swing.JButton btnRf;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbott;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSoLuongKH;
    private javax.swing.JLabel lbldiachi;
    private javax.swing.JLabel lblgioitinh;
    private javax.swing.JLabel lblluong;
    private javax.swing.JLabel lblmanv;
    private javax.swing.JLabel lblmatkhau;
    private javax.swing.JLabel lblngaybdlv;
    private javax.swing.JLabel lblngaysinh;
    private javax.swing.JLabel lblsdt;
    private javax.swing.JLabel lbltendn;
    private javax.swing.JLabel lbltennv;
    private javax.swing.JLabel lbltimkiem;
    private javax.swing.JLabel lbltrangthai;
    private javax.swing.JRadioButton radKhac;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JScrollPane scpQLNV;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTabbedPane tpQLNV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgaybdlv;
    private javax.swing.JTextField txtNgsinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTendn;
    private javax.swing.JTextField txtTennv;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void showDataNhanVien() {
        try {
            Connection con = ConnectSQL.getConnection();
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Giới tính", "Địa chỉ",
                "Số điện thoại", "Ngày BDLV", "Lương", "Tên đăng nhập", "Mật khẩu", "Trạng thái"});
            tblNhanVien.setModel(dtm);
            CallableStatement cstm = con.prepareCall("{call dbo.ShowDataNhanVien}");
            ResultSet rs = cstm.executeQuery();
            dtm.setRowCount(0);
            int cnt = 0;
            while (rs.next()) {
                String manv = rs.getString("MaNhanVien");
                String tennv = rs.getString("TenNhanVien");
                String ngaysinh = rs.getString("NgaySinh");
                String gioitinh = rs.getString("GioiTinh");
                String diachi = rs.getString("DiaChi");
                String sdt = rs.getString("SoDienThoai");
                String ngaybdlv = rs.getString("NgayBDLV");
                String luong = rs.getString("Luong");
                String tendn = rs.getString("TenDangNhap");
                String matkhau = rs.getString("MatKhau");
                String tt = rs.getString("TrangThai");
                Vector<Object> vec = new Vector<>();
                vec.add(manv);
                vec.add(tennv);
                vec.add(ngaysinh);
                vec.add(gioitinh);
                vec.add(diachi);
                vec.add(sdt);
                vec.add(ngaybdlv);
                vec.add(luong);
                vec.add(tendn);
                vec.add(matkhau);
                vec.add(tt);
                dtm.addRow(vec);
                cnt++;
            }
            con.close();
            rs.close();
            cstm.close();
            lblSoLuongKH.setText("Danh sách này có: " + (cnt - 1) + " nhân viên");
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void TimkiemNV() {
        if (txtTimKiem.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập từ khóa");
            return;
        }
        try {
            Connection con = ConnectSQL.getConnection();
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Mã nhân viên", "Tên nhân viên", "Ngày sinh", "Giới tính", "Địa chỉ",
                "Số điện thoại", "Ngày BDLV", "Lương", "Tên đăng nhập", "Mật khẩu", "Trạng thái"});
            tblNhanVien.setModel(dtm);
            CallableStatement cstm = con.prepareCall("{call dbo.TimKiemNV(?)}");
            cstm.setString(1, txtTimKiem.getText());
            ResultSet rs = cstm.executeQuery();
            dtm.setRowCount(0);
            int cnt = 0;
            while (rs.next()) {
                String manv = rs.getString("MaNhanVien");
                String tennv = rs.getString("TenNhanVien");
                String ngaysinh = rs.getString("NgaySinh");
                String gioitinh = rs.getString("GioiTinh");
                String diachi = rs.getString("DiaChi");
                String sdt = rs.getString("SoDienThoai");
                String ngaybdlv = rs.getString("NgayBDLV");
                String luong = rs.getString("Luong");
                String tendn = rs.getString("TenDangNhap");
                String matkhau = rs.getString("MatKhau");
                String tt = rs.getString("TrangThai");
                Vector<Object> vec = new Vector<>();
                vec.add(manv);
                vec.add(tennv);
                vec.add(ngaysinh);
                vec.add(gioitinh);
                vec.add(diachi);
                vec.add(sdt);
                vec.add(ngaybdlv);
                vec.add(luong);
                vec.add(tendn);
                vec.add(matkhau);
                vec.add(tt);
                dtm.addRow(vec);
                cnt++;
            }
            if (cnt == 0) {
                JOptionPane.showMessageDialog(null, "Không có kết quả tìm kiếm");
                showDataNhanVien();
                return;
            }
            con.close();
            cstm.close();
            rs.close();
            lblSoLuongKH.setText("Danh sách này có: " + cnt + " nhân viên");
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addIcon() {
        ImageIcon icon = new ImageIcon("icon/work_24px.png");
        tpQLNV.addTab("Quản lý nhân viên  ", icon, scpQLNV);
        btnClean.setIcon(new ImageIcon("icon/clean.png"));
        btnRf.setIcon(new ImageIcon("icon/refresh.png"));
        btnSua.setIcon(new ImageIcon("icon/tools.png"));
        btnThem.setIcon(new ImageIcon("icon/new.png"));
        btnTimKiem.setIcon(new ImageIcon("icon/search.png"));
    }

    private void ThemNhanVien() {
        if (txtTennv.getText().equals("") || txtNgsinh.getText().equals("") || txtDiaChi.getText().equals("")
                || txtSdt.getText().equals("") || txtNgaybdlv.getText().equals("") || txtLuong.getText().equals("")
                || txtTendn.getText().equals("") || txtMatKhau.getText().equals("") || (!radNam.isSelected()
                && !radNu.isSelected() && !radKhac.isSelected())) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ các thông tin");
            return;
        }
        if (!KiemTraSoDienThoai.KiemTraSDT(txtSdt.getText())) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ");
            return;
        }
        if (!KiemTraNgayHopLe.NgayHopLe(txtNgsinh.getText())) {
            JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ\n Định dạng hợp lệ: dd-MM-yyyy");
            return;
        }
        if (!KiemTraSo.Kiemtra(txtLuong.getText())) {
            JOptionPane.showMessageDialog(null, "Lương phải là số và lớn hơn 0");
            return;
        }
        if (!KiemTraNgayHopLe.NgayHopLe(txtNgaybdlv.getText())) {
            JOptionPane.showMessageDialog(null, "Ngày bắt đầu làm việc không hợp lệ\n Định dạng hợp lệ: dd-MM-yyyy");
            return;
        }
        String ngaysinh = null, ngaybdlv = null, gioitinh = null;
        if (radNam.isSelected()) {
            gioitinh = radNam.getText();
        }
        if (radNu.isSelected()) {
            gioitinh = radNu.getText();
        }
        if (radKhac.isSelected()) {
            gioitinh = radKhac.getText();
        }
        Date dngaysinh, dngaybdlv;
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dngaysinh = sdf1.parse(txtNgsinh.getText());
            dngaybdlv = sdf1.parse(txtNgaybdlv.getText());
            ngaysinh = sdf2.format(dngaysinh);
            ngaybdlv = sdf2.format(dngaybdlv);

        } catch (ParseException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = ConnectSQL.getConnection();
        String sql1 = "SELECT * FROM dbo.NhanVien WHERE SoDienThoai = N'" + txtSdt.getText() + "'";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql1);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Đã tồn tại nhân viên có số điện thoại này");
                txtSdt.grabFocus();
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql2 = "SELECT * FROM dbo.NhanVien WHERE TenDangNhap = N'" + txtTendn.getText() + "'";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql2);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Tên đăng nhập này đã tồn tại");
                txtTendn.grabFocus();
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.ThemNhanVien(?,?,?,?,?,?,?,?,?)}");
            cstm.setString(1, txtTennv.getText());
            cstm.setString(2, ngaysinh);
            cstm.setString(3, gioitinh);
            cstm.setString(4, txtDiaChi.getText());
            cstm.setString(5, txtSdt.getText());
            cstm.setString(6, ngaybdlv);
            cstm.setString(7, txtLuong.getText());
            cstm.setString(8, txtTendn.getText());
            cstm.setString(9, txtMatKhau.getText());
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Thêm nhân viên mới thành công");
                showDataNhanVien();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CleanThongTin() {
        txtManv.setText("");
        txtTennv.setText("");
        txtNgsinh.setText("");
        txtDiaChi.setText("");
        txtSdt.setText("");
        txtNgaybdlv.setText("");
        txtLuong.setText("");
        txtTendn.setText("");
        txtMatKhau.setText("");
        btnGroupGT.clearSelection();
        txtTimKiem.setText("");
        cbott.setSelectedItem(null);
    }

    private void SuaThongTinNhanVien() {
        if (txtTennv.getText().equals("") || txtNgsinh.getText().equals("") || txtDiaChi.getText().equals("")
                || txtSdt.getText().equals("") || txtNgaybdlv.getText().equals("") || txtLuong.getText().equals("")
                || txtTendn.getText().equals("") || txtMatKhau.getText().equals("") || (!radNam.isSelected()
                && !radNu.isSelected() && !radKhac.isSelected())) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ các thông tin");
            return;
        }
        if (!KiemTraSoDienThoai.KiemTraSDT(txtSdt.getText())) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ");
            return;
        }
        try {
            String sql = "SELECT MaNhanVien FROM dbo.NhanVien WHERE SoDienThoai = N'" + txtSdt.getText() + "'";
            Connection con = ConnectSQL.getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            String manv = null;
            while(rs.next()){
                manv = rs.getString("MaNhanVien");
            }
            con.close();
            stm.close();
            rs.close();
            if(!manv.equals(txtManv.getText())){
                JOptionPane.showMessageDialog(null, "Đã tồn tại 1 nhân viên khác có số điện thoại này");
                return;
            }
        } catch (Exception e) {
        }

        if (!KiemTraNgayHopLe.NgayHopLe(txtNgsinh.getText())) {
            JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ\n Định dạng hợp lệ: dd-MM-yyyy");
            return;
        }
        if (!KiemTraSo.Kiemtra(txtLuong.getText())) {
            JOptionPane.showMessageDialog(null, "Lương phải là số và lớn hơn 0");
            return;
        }
        if (!KiemTraNgayHopLe.NgayHopLe(txtNgaybdlv.getText())) {
            JOptionPane.showMessageDialog(null, "Ngày bắt đầu làm việc không hợp lệ\n Định dạng hợp lệ: dd-MM-yyyy");
            return;
        }
        String ngaysinh = null, ngaybdlv = null, gioitinh = null;
        if (radNam.isSelected()) {
            gioitinh = radNam.getText();
        }
        if (radNu.isSelected()) {
            gioitinh = radNu.getText();
        }
        if (radKhac.isSelected()) {
            gioitinh = radKhac.getText();
        }
        Date dngaysinh, dngaybdlv;
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dngaysinh = sdf1.parse(txtNgsinh.getText());
            dngaybdlv = sdf1.parse(txtNgaybdlv.getText());
            ngaysinh = sdf2.format(dngaysinh);
            ngaybdlv = sdf2.format(dngaybdlv);

        } catch (ParseException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.SuaThongTinNhanVien(?,?,?,?,?,?,?,?,?,?,?)}");
            cstm.setString(1, txtTennv.getText());
            cstm.setString(2, ngaysinh);
            cstm.setString(3, gioitinh);
            cstm.setString(4, txtDiaChi.getText());
            cstm.setString(5, txtSdt.getText());
            cstm.setString(6, ngaybdlv);
            cstm.setString(7, txtLuong.getText());
            cstm.setString(8, txtTendn.getText());
            cstm.setString(9, txtMatKhau.getText());
            String trangthai = cbott.getSelectedItem().toString();
            cstm.setString(10, trangthai);
            cstm.setString(11, txtManv.getText());
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật nhân viên thành công");
                showDataNhanVien();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MouseClicked() {
        int row = tblNhanVien.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtManv.setText(tblNhanVien.getValueAt(row, 0) + "");
        txtTennv.setText(tblNhanVien.getValueAt(row, 1) + "");
        txtNgsinh.setText(tblNhanVien.getValueAt(row, 2) + "");
        txtDiaChi.setText(tblNhanVien.getValueAt(row, 4) + "");
        txtSdt.setText(tblNhanVien.getValueAt(row, 5) + "");
        txtNgaybdlv.setText(tblNhanVien.getValueAt(row, 6) + "");
        txtLuong.setText(tblNhanVien.getValueAt(row, 7) + "");
        txtTendn.setText(tblNhanVien.getValueAt(row, 8) + "");
        txtMatKhau.setText(tblNhanVien.getValueAt(row, 9) + "");
        String tt = tblNhanVien.getValueAt(row, 10) + "";
        cbott.setSelectedItem(tt);
        String gt = tblNhanVien.getValueAt(row, 3) + "";
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
}
