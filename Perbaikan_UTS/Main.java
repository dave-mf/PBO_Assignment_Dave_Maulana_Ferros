/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave Maulana Ferros
 */
import com.uts_pbo.Lingkaran.*;

public class Main {
    
    public static void main(String[] args) {
        Lingkaran circle_satu = new SetengahLingkaran();
        LuasSetengah luasst = new LuasSetengah(circle_satu);
        
        luasst.hitung();
        luasst.tampilkan();
        
    }
}
