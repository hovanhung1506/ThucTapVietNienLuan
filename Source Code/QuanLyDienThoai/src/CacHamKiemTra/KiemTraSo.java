package CacHamKiemTra;

public class KiemTraSo {
    public static boolean Kiemtra(String luong){
        try {
            Long.parseLong(luong);
            long ll = Long.parseLong(luong);
            if(ll <= 0)
                return false;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
