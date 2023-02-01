/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Dave Maulana Ferros
 */
public class menuKategori {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/sistem_informasi_pos";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static Statement state;
    static PreparedStatement ps;
    
    public static void menuKategori(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("--------------------------------");
        System.out.println("Menu Kategori");
        System.out.println("--------------------------------");
        System.out.println("1. Tampilkan Kategori");
        System.out.println("10. Kembali Ke Menu Utama");
        System.out.println("--------------------------------");
        System.out.println("Pilih Menu :");
        int pilih = sc.nextInt();
        
        if (pilih == 1) {
            System.out.println("Lihat Daftar Kategori");
            crudManagement.tampilkanKategori();
        }else if(pilih == 10){
            System.out.println("Kembali Ke Menu Utama");
            menuUser.tampilkan();
        }else{
            System.out.println("Pilihan tidak valid");
        }
        menuKategori();
    }
    
}
