/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CacHamKiemTra;

/**
 *
 * @author Ho Van Hung
 */
public class KiemTraSoDienThoai {

    public static boolean KiemTraSDT(String sdt) {
        String regex = "^0\\d{9}$";
        if(sdt.matches(regex))
            return true;
        return false;
    }
}
