package CacHamKiemTra;

import DangNhap.Login;
import JDBCConnection.ConnectSQL;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class KiemTraDangNhap {
    
    public void KiemTraKetNoiSQL() {
        Connection con = ConnectSQL.getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng kiểm tên database hoặc tài khoản và mật khẩu SQLServer trên máy bạn\n"
                    + "Phần mềm là QuanLyCuaHangDienThoai, sa, 123\nBạn có thể kiểm tra và thay đổi trên SQLServer của mình");
            System.exit(0);
        } else {
            new Login().showLogin();
        }
    }    
}
