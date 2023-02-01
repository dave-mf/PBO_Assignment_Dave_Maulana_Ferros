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
public class menuProduk {

    static final String jdbc = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/sistem_informasi_pos";
    static String username = "root";
    static String password = "";
    
    static Connection conn;
    static ResultSet rs;
    static Statement state;
    
    public static void menuProduk(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("--------------------------------");
        System.out.println("Menu Management Produk");
        System.out.println("--------------------------------");
        System.out.println("1. Lihat Daftar Produk");
        System.out.println("2. Tambah Produk");
        System.out.println("3. Edit Produk");
        System.out.println("4. Hapus Produk");
        System.out.println("10. Kembali Ke Menu Utama");
        System.out.println("--------------------------------");
        System.out.println("Pilih Menu :");
        int pilih = sc.nextInt();
        
        if (pilih == 1) {
            System.out.println("Lihat Daftar Produk");
            crudManagement.tampilkanProduk();
        }else if(pilih == 2){
            System.out.println("Tambah Produk");
            crudManagement.tambahProduk();
        }else if(pilih == 3){
            System.out.println("Edit Produk");
            crudManagement.updateProduk();
        }else if(pilih == 4){
            System.out.println("Hapus Produk");
            crudManagement.deleteProduk();
        }else if(pilih == 10){
            System.out.println("Kembali Ke Menu Utama");
            menuUser.tampilkan();
        }else{
            System.out.println("Pilihan tidak valid");
        }
        menuProduk();
    }
    
}
