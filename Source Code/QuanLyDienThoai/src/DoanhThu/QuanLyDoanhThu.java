package DoanhThu;

import JDBCConnection.ConnectSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class QuanLyDoanhThu extends javax.swing.JPanel {

    DefaultTableModel dtm;
    int year, month;
    LocalDate today = LocalDate.now();

    public QuanLyDoanhThu() {
        initComponents();
        addIcon();
        month = today.getMonthValue();
        year = today.getYear();
        addNam();
        showDataDoanhThuThang();
        showDataDoanhThuMatHang(year, month);
        showDataDoanhThuTheoNhanVienTungThang(year, month);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tpDoanhThuMH = new javax.swing.JTabbedPane();
        scDoanhThuMH = new javax.swing.JScrollPane();
        tblDoanhThuMH = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tpDoanhThuThang = new javax.swing.JTabbedPane();
        scDoanhThuThang = new javax.swing.JScrollPane();
        tblDoanhThuThang = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblTongDoanhThu = new javax.swing.JLabel();
        lblNam = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        btnThongKe = new javax.swing.JButton();
        txtDoanhThuThangn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        tpLuongNV = new javax.swing.JTabbedPane();
        scLuongNV = new javax.swing.JScrollPane();
        tblLuongNV = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scDoanhThuMH.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scDoanhThuMH.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblDoanhThuMH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDoanhThuMH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã hàng", "Tên hàng", "Số lượng bán", "Doanh thu"
            }
        ));
        tblDoanhThuMH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoanhThuMHMouseClicked(evt);
            }
        });
        scDoanhThuMH.setViewportView(tblDoanhThuMH);

        tpDoanhThuMH.addTab("tab1", scDoanhThuMH);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpDoanhThuMH, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpDoanhThuMH, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblDoanhThuThang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblDoanhThuThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "0"},
                {"2", "0"},
                {"3", "0"},
                {"4", "0"},
                {"5", "0"},
                {"6", "0"},
                {"7", "0"},
                {"8", "0"},
                {"9", "0"},
                {"10", "0"},
                {"11", "0"},
                {"12", "0"}
            },
            new String [] {
                "Tháng", "Doanh thu"
            }
        ));
        scDoanhThuThang.setViewportView(tblDoanhThuThang);

        tpDoanhThuThang.addTab("tab1", scDoanhThuThang);

        lblTongDoanhThu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTongDoanhThu.setText("Tổng doanh thu: ");

        lblNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNam.setText("Năm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpDoanhThuThang, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTongDoanhThu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNam)
                .addGap(88, 88, 88))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tpDoanhThuThang, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongDoanhThu)
                    .addComponent(lblNam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Chọn tháng");

        cboThang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        txtDoanhThuThangn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDoanhThuThangn.setText("Tổng doanh thu tháng n :");

        jLabel2.setText("Mã hàng");

        txtMH.setEditable(false);
        txtMH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setText("Tên hàng");

        txtTH.setEditable(false);
        txtTH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setText("Số lượng");

        txtSL.setEditable(false);
        txtSL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setText("Doanh thu");

        txtGia.setEditable(false);
        txtGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setText("Chọn năm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDoanhThuThangn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(txtMH, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboThang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSL, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)
                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTH, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(txtDoanhThuThangn)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scLuongNV.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scLuongNV.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblLuongNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblLuongNV.setModel(new javax.swing.table.DefaultTableModel(
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
        scLuongNV.setViewportView(tblLuongNV);

        tpLuongNV.addTab("tab1", scLuongNV);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpLuongNV)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tpLuongNV, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        ThongKe();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void tblDoanhThuMHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoanhThuMHMouseClicked
        MouseClicked();
    }//GEN-LAST:event_tblDoanhThuMHMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThongKe;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblTongDoanhThu;
    private javax.swing.JScrollPane scDoanhThuMH;
    private javax.swing.JScrollPane scDoanhThuThang;
    private javax.swing.JScrollPane scLuongNV;
    private javax.swing.JTable tblDoanhThuMH;
    private javax.swing.JTable tblDoanhThuThang;
    private javax.swing.JTable tblLuongNV;
    private javax.swing.JTabbedPane tpDoanhThuMH;
    private javax.swing.JTabbedPane tpDoanhThuThang;
    private javax.swing.JTabbedPane tpLuongNV;
    private javax.swing.JLabel txtDoanhThuThangn;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMH;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTH;
    // End of variables declaration//GEN-END:variables

    private void addIcon() {
        tpDoanhThuMH.addTab("Doanh thu mặt hàng  ", scDoanhThuMH);
        tpDoanhThuThang.addTab("Doanh thu theo tháng  ", scDoanhThuThang);
        tpLuongNV.addTab("Doanh thu theo từng nhân viên  ", scLuongNV);
        btnThongKe.setIcon(new ImageIcon("icon/profit_24px.png"));
    }

    private void showDataDoanhThuThang() {
        String nam = cboNam.getSelectedItem().toString();
        tpDoanhThuThang.setTitleAt(0, "Doanh thu theo tháng của năm " + nam);
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Tháng", "Doanh thu"});
        tblDoanhThuThang.setModel(dtm);
        
        for(int i = 1; i <= 12; i++){
            int doanhthu = 0;
            if(i == 13)
                break;
            Vector<Object>vec = new Vector<>();
            vec.add(i);
            vec.add(doanhthu);
            dtm.addRow(vec);
        }
        try {
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.TongDoanhThu(?)}");
            cstm.setString(1, nam);
            ResultSet rs = cstm.executeQuery();
            long tongdt = 0;
            while (rs.next()) {
                String thang = rs.getString("Thang");
                String doanhthu = rs.getString("DoanhThu");
                int dt = Integer.parseInt(doanhthu);
                tongdt += dt;
                for(int i = 1; i <= 12; i++){
                    if(thang.equals(i+"")){
                        tblDoanhThuThang.setValueAt(doanhthu, i-1, 1);
                    }
                }
            }
            con.close();
            cstm.close();
            rs.close();
            lblNam.setText("Năm " + nam);
            lblTongDoanhThu.setText("Tổng doanh thu " + tongdt);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showDataDoanhThuMatHang(int year, int month) {
        tpDoanhThuMH.setTitleAt(0, "Doanh thu mặt hàng tháng " + month);
        try {
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"STT", "Mã hàng", "Tên hàng", "Số lượng", "Doanh thu"});
            tblDoanhThuMH.setModel(dtm);
            dtm.setRowCount(0);
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.DoanhThuMatHang(?,?)}");
            cstm.setString(1, year + "");
            cstm.setString(2, month + "");
            ResultSet rs = cstm.executeQuery();
            int stt = 0;
            long tdt = 0;
            while (rs.next()) {
                stt++;
                String mahang = rs.getString("MaHang");
                String tenhang = rs.getString("TenHang");
                String soluong = rs.getString("SoLuong");
                String doanhthu = rs.getString("DoanhThu");
                long dt = Long.parseLong(doanhthu);
                tdt += dt;
                Vector<Object> vec = new Vector<>();
                vec.add(stt);
                vec.add(mahang);
                vec.add(tenhang);
                vec.add(soluong);
                vec.add(doanhthu);
                dtm.addRow(vec);
            }
            con.close();
            rs.close();
            cstm.close();
            txtDoanhThuThangn.setText("Tổng doanh thu tháng " + month + " : " + tdt);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showDataDoanhThuTheoNhanVienTungThang(int year, int month) {
        tpLuongNV.setTitleAt(0, "Doanh thu theo từng nhân viên tháng " + month);
        try {
            dtm = new DefaultTableModel();
            dtm.setColumnIdentifiers(new String[]{"Mã nhân viên", "Tên nhân viên", "Doanh thu"});
            tblLuongNV.setModel(dtm);
            Connection con = ConnectSQL.getConnection();
            CallableStatement cstm = con.prepareCall("{call dbo.DoanhThuTungNhanVien(?,?)}");
            cstm.setString(1, year + "");
            cstm.setString(2, month + "");
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                String manv = rs.getString("MaNhanVien");
                String tennv = rs.getString("TenNhanVien");
                String doanhthu = rs.getString("DoanhThu");
                Vector<Object> vec = new Vector<>();
                vec.add(manv);
                vec.add(tennv);
                vec.add(doanhthu);
                dtm.addRow(vec);
            }
            con.close();
            cstm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addNam() {
        try {
            Connection con = ConnectSQL.getConnection();
            String sql = "SELECT YEAR(NgayBan) Nam FROM dbo.HoaDon GROUP BY YEAR(NgayBan)";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                cboNam.addItem(rs.getString("Nam"));
            }
            con.close();
            stm.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        cboNam.setSelectedItem(year + "");
        cboThang.setSelectedItem(month + "");
    }

    private void MouseClicked() {
        int row = tblDoanhThuMH.getSelectedRow();
        if (row == -1) {
            return;
        }
        txtMH.setText(tblDoanhThuMH.getValueAt(row, 1) + "");
        txtTH.setText(tblDoanhThuMH.getValueAt(row, 2) + "");
        txtSL.setText(tblDoanhThuMH.getValueAt(row, 3) + "");
        txtGia.setText(tblDoanhThuMH.getValueAt(row, 4) + "");
    }

    private void ThongKe() {
        String t = (String) cboThang.getSelectedItem();
        String n = (String) cboNam.getSelectedItem();
        int thang = Integer.parseInt(t);
        int nam = Integer.parseInt(n);
        showDataDoanhThuMatHang(nam, thang);
        showDataDoanhThuTheoNhanVienTungThang(nam, thang);
        showDataDoanhThuThang();
    }
}
