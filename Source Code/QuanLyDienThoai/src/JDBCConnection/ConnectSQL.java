package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectSQL {
    public static Connection getConnection(){
        String URL = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyDienThoai";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                return DriverManager.getConnection(URL,"sa","123");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
}
