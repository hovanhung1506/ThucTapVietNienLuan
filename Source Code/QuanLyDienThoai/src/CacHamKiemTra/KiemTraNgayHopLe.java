
package CacHamKiemTra;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KiemTraNgayHopLe {

    public static boolean NgayHopLe(final String date) {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date BOD = null;
        df.setLenient(false);
        try {
            BOD = df.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
