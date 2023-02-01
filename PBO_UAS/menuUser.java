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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class menuUser {

    static String currentuser;;

    public static void setCurrentUser(String u){
        currentuser = u;
    }

    public static void tampilkan(){
        System.out.println("useranda: " + currentuser);

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("Sistem Informasi Point Of Sales");
        System.out.println("--------------------------------");
        System.out.println("1. Daftar Produk");
        System.out.println("2. Jenis Kategori");
        System.out.println("3. Daftar Transaksi");
        System.out.println("10. Keluar Program");
        System.out.println("11. Log Out");
        System.out.println("--------------------------------");
        System.out.println("Pilih Menu :");
        int pilih = sc.nextInt();

        if (pilih == 1) {
//            System.out.println("Daftar menuProduk");
            menuProduk.menuProduk();
        }else if(pilih == 2){
//            System.out.println("Daftar Kasir");
            menuKategori.menuKategori();
        }else if(pilih == 3){
//            System.out.println("Jenis Kategori");
            menuTransaksi.menuTransaksi();
        }else if(pilih == 10){
            System.exit(0);
        }else if(pilih == 11){
            // logout akun
            try {
                HalamanDepan.jalankan();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }else{
            System.out.println("Input tidak valid");
        }

        sc.close();

    }
}

