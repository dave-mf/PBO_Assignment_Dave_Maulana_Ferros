
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave Maulana Ferros
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nama dosen     : ");
        String nama = input.nextLine();
        System.out.println("Masukkan alamat dosen   : ");
        String alamat = input.nextLine();
        
        Dosen dosen_satu = new Dosen(nama,alamat);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Mata kuliah yang diampu : ");
            String matkul = input.nextLine();
            dosen_satu.addCourse(matkul);
        }
        
        System.out.println(dosen_satu);
    }
}
