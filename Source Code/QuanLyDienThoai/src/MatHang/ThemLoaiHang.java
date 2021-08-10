package MatHang;

import JDBCConnection.ConnectSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ThemLoaiHang extends javax.swing.JDialog {

    public ThemLoaiHang() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Thêm loại hàng");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txttenlh = new javax.swing.JTextField();
        btnDY = new javax.swing.JButton();
        btnHB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Tên loại hàng mới");

        txttenlh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnDY.setText("Đồng ý");
        btnDY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDYActionPerformed(evt);
            }
        });

        btnHB.setText("Hủy bỏ");
        btnHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(txttenlh, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDY, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnHB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttenlh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDYActionPerformed
        Them();
    }//GEN-LAST:event_btnDYActionPerformed

    private void btnHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHBActionPerformed
        dispose();
    }//GEN-LAST:event_btnHBActionPerformed

    public void ThemLH() {
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
            java.util.logging.Logger.getLogger(ThemLoaiHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemLoaiHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemLoaiHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemLoaiHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemLoaiHang dialog = new ThemLoaiHang();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDY;
    private javax.swing.JButton btnHB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txttenlh;
    // End of variables declaration//GEN-END:variables

    private void Them() {
        if(txttenlh.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nhập tên loại hàng");
            txttenlh.grabFocus();
            return;
        }
        Connection con = ConnectSQL.getConnection();
        try {
            Statement s = con.createStatement();
            String sql = "SELECT * FROM dbo.LoaiHang WHERE TenLoaiHang = N'" + txttenlh.getText() + "'";
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Đã tồn tại loại hàng này");
                return;
            }
            rs.close();
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(ThemLoaiHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String sql = "INSERT dbo.LoaiHang (TenLoaiHang) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txttenlh.getText());
            int x = ps.executeUpdate();
            if (x > 0) {
                JOptionPane.showMessageDialog(null, "Thêm loại hàng mới thành công");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ThemLoaiHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }
}
