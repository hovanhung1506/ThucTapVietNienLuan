package MatHang;

public class ModelMatHnag {
    String MaHang, TenHang, SoLuong, Gia, TenLoaiHang, TrangThai;
    byte[] Anh;

    public ModelMatHnag() {
    }

    public ModelMatHnag(String MaHang, String TenHang, String SoLuong, String Gia, String TenLoaiHang, String TrangThai, byte[] Anh) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.TenLoaiHang = TenLoaiHang;
        this.TrangThai = TrangThai;
        this.Anh = Anh;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getTenLoaiHang() {
        return TenLoaiHang;
    }

    public void setTenLoaiHang(String TenLoaiHang) {
        this.TenLoaiHang = TenLoaiHang;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public byte[] getAnh() {
        return Anh;
    }

    public void setAnh(byte[] Anh) {
        this.Anh = Anh;
    }
    
}
