/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_uas;
import java.util.Scanner;
/**
 *
 * @author Dave Maulana Ferros
 */
public class Menu {
    public static void main(String[] args) {
        
        try{
            menuForm();
        }
        catch(Exception e){
            System.out.println("Ada Sebuah Kesalahan");
            System.out.println("Error Message : " +e.getMessage());
            e.printStackTrace();
        }
    }
    
    static void menuForm(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------------");
        System.out.println("Sistem Informasi Point Of Sales");
        System.out.println("--------------------------------");
        System.out.println("1. Daftar Produk");
        System.out.println("2. Menu Management Kasir");
        System.out.println("3. Jenis Kategori");
        System.out.println("4. Daftar Transaksi");
        System.out.println("10. Keluar Program");
        System.out.println("--------------------------------");
        System.out.println("Pilih Menu :");
        int pilih = sc.nextInt();
        
        if (pilih == 1) {
//            System.out.println("Daftar menuProduk");
            menuProduk.menuProduk();
        }else if(pilih == 2){
//            System.out.println("Daftar Kasir");
            menuKasir.menuKasir();
        }else if(pilih == 3){
//            System.out.println("Jenis Kategori");
            menuKategori.menuKategori();
        }else if(pilih == 4){
//            System.out.println("Daftar Transaksi");
            menuTransaksi.menuTransaksi();
        }else if(pilih == 10){
            System.exit(0);
        }else{
            System.out.println("Input tidak valid");
        }
    }
}
