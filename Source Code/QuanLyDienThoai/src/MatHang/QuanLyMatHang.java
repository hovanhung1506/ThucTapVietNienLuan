package MatHang;

import CacHamKiemTra.KiemTraSo;
import JDBCConnection.ConnectSQL;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

public class QuanLyMatHang extends javax.swing.JPanel {
    
    DefaultTableModel dtm;
    byte[] anh = null;
    
    public QuanLyMatHang() {
        initComponents();
        addIcon();
        showDataMatHang();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        btnAnhmoi = new javax.swing.JButton();
        btnLuuAnh = new javax.swing.JButton();
        btnXoaAnh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tpQLMH = new javax.swing.JTabbedPane();
        scQLMH = new javax.swing.JScrollPane();
        tblMatHang = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblMaHang = new javax.swing.JLabel();
        txtMaHang = new javax.swing.JTextField();
        lblTenHang = new javax.swing.JLabel();
        txtTenHang = new javax.swing.JTextField();
        lblGia = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        lblTenLoaiHang = new javax.swing.JLabel();
        cboTenLH = new javax.swing.JComboBox<>();
        lblTrangThai = new javax.swing.JLabel();
        cbott = new javax.swing.JComboBox<>();
        lblTimKiem = new javax.swing.JLabel();
        txtTimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnRf = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        lblSoluong = new javax.swing.JLabel();
        btnLH = new javax.swing.JButton();

        lblAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        btnAnhmoi.setText("Ảnh mới");
        btnAnhmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnhmoiActionPerformed(evt);
            }
        });

        btnLuuAnh.setText("Lưu ảnh");
        btnLuuAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuAnhActionPerformed(evt);
            }
        });

        btnXoaAnh.setText("Xóa ảnh");
        btnXoaAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaAnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnAnhmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnLuuAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnhmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scQLMH.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scQLMH.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblMatHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblMatHang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMatHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMatHangMouseClicked(evt);
            }
        });
        scQLMH.setViewportView(tblMatHang);

        tpQLMH.addTab("tab1", scQLMH);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpQLMH, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpQLMH, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMaHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaHang.setText("Mã hàng");

        txtMaHang.setEditable(false);
        txtMaHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTenHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTenHang.setText("Tên hàng");

        txtTenHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGia.setText("Giá");

        txtGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSoLuong.setText("Số lượng");

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTenLoaiHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTenLoaiHang.setText("Tên loại hàng");

        cboTenLH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTrangThai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTrangThai.setText("Trạng thái");

        cbott.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbott.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang kinh doanh", "Tạm ngừng", "Ngừng kinh doanh" }));

        lblTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimKiem.setText("Tìm kiếm");

        txtTimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

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

        btnClean.setText("CLean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        lblSoluong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSoluong.setText("Danh sách này có:");

        btnLH.setText("Thêm LH");
        btnLH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaHang, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblTenLoaiHang)
                                        .addGap(53, 53, 53))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(lblTimKiem)
                                        .addGap(80, 80, 80)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(cboTenLH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLH)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 125, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblTenHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblTrangThai, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblSoluong))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnClean, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbott, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaHang)
                    .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenHang)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGia)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuong)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenLoaiHang)
                    .addComponent(cboTenLH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrangThai)
                    .addComponent(cbott, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTimKiem)
                            .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSoluong, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblMatHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMatHangMouseClicked
        MouseClicked();
    }//GEN-LAST:event_tblMatHangMouseClicked

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        CleanThongTin();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        TimKiemMatHang();
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void btnRfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfActionPerformed
        showDataMatHang();
    }//GEN-LAST:event_btnRfActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ThemMatHang();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SuaMatHang();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnAnhmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnhmoiActionPerformed
        MoAnhMoi();
    }//GEN-LAST:event_btnAnhmoiActionPerformed

    private void btnLuuAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuAnhActionPerformed
        LuuAnh();
    }//GEN-LAST:event_btnLuuAnhActionPerformed

    private void btnXoaAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaAnhActionPerformed
        XoaAnh();
    }//GEN-LAST:event_btnXoaAnhActionPerformed

    private void btnLHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLHActionPerformed
        new ThemLoaiHang().ThemLH();
    }//GEN-LAST:event_btnLHActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnhmoi;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnLH;
    private javax.swing.JButton btnLuuAnh;
    private javax.swing.JButton btnRf;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoaAnh;
    private javax.swing.JComboBox<String> cboTenLH;
    private javax.swing.JComboBox<String> cbott;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblMaHang;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblSoluong;
    private javax.swing.JLabel lblTenHang;
    private javax.swing.JLabel lblTenLoaiHang;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JScrollPane scQLMH;
    private javax.swing.JTable tblMatHang;
    private javax.swing.JTabbedPane tpQLMH;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenHang;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
    private void addIcon() {
        ImageIcon icon = new ImageIcon("icon/inventory_24px.png");
        tpQLMH.addTab("Quản lý mặt hàng  ", icon, scQLMH);
        btnThem.setIcon(new ImageIcon("icon/new.png"));
        btnSua.setIcon(new ImageIcon("icon/tools.png"));
        btnRf.setIcon(new ImageIcon("icon/refresh.png"));
        btnClean.setIcon(new ImageIcon("icon/clean.png"));
        btnTimkiem.setIcon(new ImageIcon("icon/search.png"));
        btnAnhmoi.setIcon(new ImageIcon("icon/new.png"));
        btnLuuAnh.setIcon(new ImageIcon("icon/save.png"));
        btnXoaAnh.setIcon(new ImageIcon("icon/delete.png"));
        btnLH.setIcon(new ImageIcon("icon/new.png"));
    }
    
    public ArrayList<ModelMatHnag> ShowListMatHang() {
        ArrayList<ModelMatHnag> MatHang = new ArrayList<>();
        Connection con = ConnectSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.showDataMatHang}");
            ResultSet rs = cstm.executeQuery();
            ModelMatHnag mh;
            while (rs.next()) {
                String mahang = rs.getString("MaHang");
                String tenhang = rs.getString("TenHang");
                String soluong = rs.getString("SoLuong");
                String gia = rs.getString("Gia");
                String tenloaihang = rs.getString("TenLoaiHang");
                String tt = rs.getString("TrangThai");
                byte[] anh = rs.getBytes("Anh");
                mh = new ModelMatHnag(mahang, tenhang, soluong, gia, tenloaihang, tt, anh);
                MatHang.add(mh);
            }
            con.close();
            cstm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MatHang;
    }
    
    public ArrayList<ModelMatHnag> ShowTimKiemMatHang() {
        ArrayList<ModelMatHnag> MatHang = new ArrayList<>();
        Connection con = ConnectSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.TimKiemMatHang(?)}");
            cstm.setString(1, txtTimkiem.getText());
            ResultSet rs = cstm.executeQuery();
            ModelMatHnag mh;
            while (rs.next()) {
                String mahang = rs.getString("MaHang");
                String tenhang = rs.getString("TenHang");
                String soluong = rs.getString("SoLuong");
                String gia = rs.getString("Gia");
                String maloaihang = rs.getString("TenLoaiHang");
                String trangthai = rs.getString("TrangThai");
                byte[] anh = rs.getBytes("Anh");
                mh = new ModelMatHnag(mahang, tenhang, soluong, gia, maloaihang, trangthai, anh);
                MatHang.add(mh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MatHang;
    }
    
    private void showDataMatHang() {
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Mã hàng", "Tên hàng", "Số lượng", "Giá", "Tên loại hàng", "Trạng thái"});
        tblMatHang.setModel(dtm);
        dtm.setRowCount(0);
        int cnt = 0;
        ArrayList<ModelMatHnag> list = ShowListMatHang();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            cnt++;
            row[0] = list.get(i).getMaHang();
            row[1] = list.get(i).getTenHang();
            row[2] = list.get(i).getSoLuong();
            row[3] = list.get(i).getGia();
            row[4] = list.get(i).getTenLoaiHang();
            row[5] = list.get(i).getTrangThai();
            dtm.addRow(row);
        }
        lblSoluong.setText("Danh sách này có: " + cnt + " mặt hàng");
        NapDSLoaiHang();
        cbott.setSelectedItem("Đang kinh doanh");
    }
    
    private void CleanThongTin() {
        txtMaHang.setText("");
        txtTenHang.setText("");
        txtSoLuong.setText("");
        txtGia.setText("");
        cboTenLH.setSelectedItem(null);
        txtTimkiem.setText("");
        cbott.setSelectedItem(null);
    }
    
    private void TimKiemMatHang() {
        if (txtTimkiem.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập từ khóa");
            return;
        }
        ArrayList<ModelMatHnag> list = ShowTimKiemMatHang();
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Mã hàng", "Tên hàng", "Số lượng", "Giá", "Tên loại hàng", "Trạng thái"});
        tblMatHang.setModel(dtm);
        dtm.setRowCount(0);
        int cnt = 0;
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            cnt++;
            row[0] = list.get(i).getMaHang();
            row[1] = list.get(i).getTenHang();
            row[2] = list.get(i).getSoLuong();
            row[3] = list.get(i).getGia();
            row[4] = list.get(i).getTenLoaiHang();
            row[5] = list.get(i).getTrangThai();
            dtm.addRow(row);
        }
        if (cnt == 0) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy kết quả");
            showDataMatHang();
            return;
        }
        lblSoluong.setText("Danh sách này có: " + cnt + " mặt hàng");
    }
    
    private void MouseClicked() {
        int row = tblMatHang.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMaHang.setText(tblMatHang.getValueAt(row, 0) + "");
        txtTenHang.setText(tblMatHang.getValueAt(row, 1) + "");
        txtSoLuong.setText(tblMatHang.getValueAt(row, 2) + "");
        txtGia.setText(tblMatHang.getValueAt(row, 3) + "");
        String tenlh = tblMatHang.getValueAt(row, 4) + "";
        String tt = tblMatHang.getValueAt(row, 5) + "";
        cboTenLH.setSelectedItem(tenlh);
        cbott.setSelectedItem(tt);
        byte[] img = (ShowTimKiemMatHang().get(row).getAnh());
        if (img == null) {
            lblAnh.setIcon(new ImageIcon(new ImageIcon("Image/no-image.jpg").getImage().getScaledInstance(540, 619, Image.SCALE_SMOOTH)));
            return;
        }
        ImageIcon icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(540, 619, Image.SCALE_SMOOTH));
        lblAnh.setIcon(icon);
    }
    
    private void NapDSLoaiHang() {
        cboTenLH.removeAllItems();
        try {
            Connection con = ConnectSQL.getConnection();
            String sql = "SELECT * FROM dbo.LoaiHang";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                cboTenLH.addItem(rs.getString("TenLoaiHang"));
            }
            con.close();
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ThemMatHang() {
        Connection con = ConnectSQL.getConnection();
        String tenhang = txtTenHang.getText();
        String soluong = txtSoLuong.getText();
        String gia = txtGia.getText();
        String tenloaihang = (String) cboTenLH.getSelectedItem();
        if (tenhang.equals("") || soluong.equals("") || gia.equals("") || tenloaihang.equals(null)) {
            JOptionPane.showMessageDialog(null, "Nhập đầy đủ các thông tin trên");
            return;
        }
        if (!KiemTraSo.Kiemtra(soluong)) {
            JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0");
            return;
        }
        if (!KiemTraSo.Kiemtra(gia)) {
            JOptionPane.showMessageDialog(null, "Giá phải lớn hơn 0");
            return;
        }
        String sql = "SELECT * FROM dbo.MatHang WHERE TenHang = N'" + tenhang + "'";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Sản phẩm này đã tồn tại");
                return;
            }
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql2 = "SELECT * FROM dbo.MatHang";
        int count = 0;
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql2);
            while (rs.next()) {
                count++;
            }
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.ThemMatHang(?,?,?,?,?)}");
            cstm.setString(1, (count + 1) + "");
            cstm.setString(2, tenhang);
            cstm.setString(3, soluong);
            cstm.setString(4, gia);
            cstm.setString(5, tenloaihang);
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Thêm mặt hàng thành công");
                showDataMatHang();
            }
            cstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void SuaMatHang() {
        String tenlh = (String) cboTenLH.getSelectedItem();
        String mahang = txtMaHang.getText();
        String tenhang = txtTenHang.getText();
        String soluong = txtSoLuong.getText();
        String gia = txtGia.getText();
        if (mahang.equals("") || tenhang.equals("") || soluong.equals("") || gia.equals("") || tenlh.equals(null)) {
            JOptionPane.showMessageDialog(null, "Nhập đầy đủ các thông tin");
            return;
        }
        if (!KiemTraSo.Kiemtra(soluong)) {
            JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0");
            return;
        }
        if (!KiemTraSo.Kiemtra(gia)) {
            JOptionPane.showMessageDialog(null, "Giá phải lớn hơn 0");
            return;
        }
        try {
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.SuaMatHang(?,?,?,?,?,?)}");
            cstm.setString(1, txtTenHang.getText());
            cstm.setString(2, txtSoLuong.getText());
            cstm.setString(3, txtGia.getText());
            cstm.setString(4, tenlh);
            String tt = (String) cbott.getSelectedItem();
            cstm.setString(5, tt);
            cstm.setString(6, txtMaHang.getText());
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật thông tin thành công");
                showDataMatHang();
            }
            cstm.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void MoAnhMoi() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".png") || f.getName().toLowerCase().endsWith(".jpg");
                }
            }
            
            @Override
            public String getDescription() {
                return "Image File (*.jpg, *.png)";
            }
        });
        if (chooser.showOpenDialog(null) == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();
        String pathAnh = file.getAbsolutePath();
        ImageIcon icon = new ImageIcon(new ImageIcon(pathAnh).getImage().getScaledInstance(540, 619, Image.SCALE_SMOOTH));
        lblAnh.setText("");
        lblAnh.setIcon(icon);
        try {
            File image = new File(pathAnh);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            anh = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void LuuAnh() {
        String mahang = "";
        int row = tblMatHang.getSelectedRow();
        if (txtMaHang.getText().equals("") || row == -1) {
            JOptionPane.showMessageDialog(null, "Chọn mặt hàng để cập nhật ảnh");
            return;
        }
        if (anh == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ảnh mới để lưu");
            return;
        }
        mahang = txtMaHang.getText();
        Connection con = ConnectSQL.getConnection();
        
        try {
            CallableStatement cstm = con.prepareCall("{call dbo.CapNhatAnhMatHang(?,?)}");
            cstm.setBytes(1, anh);
            cstm.setString(2, mahang);
            int x = cstm.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật ảnh thành công");
            }
            con.close();
            cstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyMatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        anh = null;
        showDataMatHang();
    }
    
    private void XoaAnh() {
        int row = tblMatHang.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Chọn mặt hàng để xóa ảnh");
            return;
        }
        
        if (ShowListMatHang().get(row).getAnh() == null) {
            JOptionPane.showMessageDialog(null, "Sản phẩm hiện tại chưa có ảnh\nHãy thêm ảnh");
            return;
        }
        int traloi = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn ảnh này", "Message", JOptionPane.YES_NO_OPTION);
        if (traloi == JOptionPane.YES_OPTION) {
            String sql = "UPDATE dbo.MatHang SET Anh = NULL WHERE MaHang = " + txtMaHang.getText() + "";
            Connection con = ConnectSQL.getConnection();
            try {
                Statement stm = con.createStatement();
                int x = stm.executeUpdate(sql);
                if (x == 1) {
                    JOptionPane.showMessageDialog(null, "Xóa ảnh thành công");
                }
                lblAnh.setIcon(new ImageIcon(new ImageIcon("Image/no-image.jpg").getImage().getScaledInstance(540, 619, Image.SCALE_SMOOTH)));
                showDataMatHang();
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyMatHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
