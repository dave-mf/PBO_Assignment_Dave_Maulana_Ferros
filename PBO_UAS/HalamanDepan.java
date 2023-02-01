/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_uas;

/**
 *
 * @author Dave Maulana Ferros
 */
import java.util.Scanner;

public class HalamanDepan {
    
    public static void main(String[] args) {
        try {
            jalankan();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }

    //halaman depan 
    public static void jalankan() throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan Login/Daftar Untuk Melanjutkan");
        System.out.println("---------------------------");
        System.out.println("1. Login ");
        System.out.println("2. Daftar");
        System.out.println("3. Exit");
        System.out.println("---------------------------");
        System.out.print("pilih: ");
        int pilih = sc.nextInt();

        if(pilih == 1){
            //masuk menu utama
            System.out.println("Form Login");
            HalamanLogin.jalankan();            
        }
        else if(pilih == 2){
            //daftar akun
            System.out.println("Daftar Akun");
            DaftarAkun.jalankan();
        } else if(pilih == 3) {
            //keluar dari program
            System.out.println("Keluar Dari Program");
            System.exit(0);
        }

        
    }

}