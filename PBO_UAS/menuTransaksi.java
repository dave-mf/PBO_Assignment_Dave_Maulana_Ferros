/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_uas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author Dave Maulana Ferros
 */
public class menuTransaksi {

    static final String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/sistem_informasi_pos";
    static String username = "root";
    static String password = "";
    
    static Connection conn;
    static ResultSet rs;
    static Statement state;
    
    public static void menuTransaksi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("--------------------------------");
        System.out.println("Menu Management Transaksi");
        System.out.println("--------------------------------");
        System.out.println("1. Lihat Riwayat Transaksi");
        System.out.println("2. Lihat Kode Produk");
        System.out.println("3. Lihat Daftar Kasir Yang Tersedia");
        System.out.println("4. Tambah Transaksi");
        System.out.println("10. Kembali Ke Menu Utama");
        System.out.println("--------------------------------");
        System.out.println("Pilih Menu :");
        int pilih = sc.nextInt();
        
        if (pilih == 1) {
            System.out.println("Lihat Riwayat Transaksi");
            crudManagement.tampilkanTransaksi();
        }else if(pilih == 2){
            System.out.println("Lihat Kode Produk");
            crudManagement.tampilkanProduk();
        }else if(pilih == 3){
            System.out.println("Lihat Daftar Kasir Yang Tersedia");
            crudManagement.tampilkanKasir();
        }else if(pilih == 4){
            System.out.println("Tambah Transaksi");
            crudManagement.tambahTransaksi();
        }else if(pilih == 10){
            System.out.println("Kembali Ke Menu Utama");
            menuUser.tampilkan();
        }else{
            System.out.println("Pilihan tidak valid");
        }
        menuTransaksi();
    }
    
}
