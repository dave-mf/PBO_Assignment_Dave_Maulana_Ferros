/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_uas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import static pbo_uas.menuProduk.jdbc;

//import com.mysql.cj.jdbc.Driver;
/**
 *
 * @author Dave Maulana Ferros
 */
public class crudManagement {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/sistem_informasi_pos";
    static final String username = "root";
    static final String password = "";
    
    static Connection con;
    static ResultSet rs;
    static Statement state;
    static PreparedStatement ps;
    
//    Menu Produk
    public static void tampilkanProduk() {
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
//            String query = "select * from produk";
            String queryKategori = "select kode_produk, nama_produk, jenis_kategori, harga from produk, kategori where kategori =  id_kategori;";
            state = con.createStatement();
            rs = state.executeQuery(queryKategori);
            int nomor = 0;
            while(rs.next()){
                System.out.println("\n");
                System.out.println("--------------------------------");
                nomor++;
                System.out.println("No  : " + nomor);
                System.out.println("Kode Produk :" + rs.getString(1));
                System.out.println("Nama Produk :" + rs.getString(2));
                System.out.println("Kategori Produk :" + rs.getString(3));
                System.out.println("Harga Produk :" + rs.getString(4));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void tambahProduk() {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        
        String kode_produk = null;
        System.out.print("Nama Produk : ");
        String nama_produk = sc.nextLine();
        System.out.print("Kategori :\n");
        System.out.println("(1) Makanan - (2) Minuman");
        int kategori_produk = sc.nextInt();
        System.out.print("Harga Produk : ");
        int harga_produk = sc.nextInt();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
//            String queryKategori = "select kode_produk, nama_produk, jenis_kategori, harga, stok from produk, kategori where kategori =  id_kategori;";
            String query = "insert into produk values(?,?,?,?)";
            
            ps = con.prepareStatement(query);
            ps.setString(1, kode_produk);
            ps.setString(2, nama_produk);
            ps.setInt(3, kategori_produk);
            ps.setInt(4, harga_produk);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Insert Berhasil!");
            }else{
                System.out.println("Proses Gagal");
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void updateProduk() {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kode Produk Yang Akan Di Update : ");
        String kode_produk = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.print("Isi value produk yang akan di update :\n");
        System.out.println("--------------------------------");
        System.out.print("Nama Produk : ");
        String nama_produk = sc.nextLine();
        System.out.print("Kategori :\n");
        System.out.print("(1) Makanan ");
        System.out.print("(2) Minuman \n");
        int kategori_produk = sc.nextInt();
        System.out.print("Harga Produk : ");
        int harga_produk = sc.nextInt();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update produk set nama_produk=?, kategori=?, harga=? where kode_produk=?;";
            
            ps = con.prepareStatement(query);
            
            ps.setString(1, nama_produk);
            ps.setInt(2, kategori_produk);
            ps.setInt(3, harga_produk);
            ps.setString(4, kode_produk);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil!");
            }else{
                System.out.println("Proses Gagal");
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void deleteProduk() {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kode Barang Yang Akan Dihapus : ");
        String kode_produk = sc.next();
       
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "delete from produk where kode_produk=?";
            
            ps = con.prepareStatement(query);
            ps.setString(1, kode_produk);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Hapus Data Berhasil!");
            }else{
                System.out.println("Proses Gagal");
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    

//    Menu Kategori
    public static void tampilkanKategori() {
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
//            String query = "select * from produk";
            String queryKategori = "select * from kategori";
            state = con.createStatement();
            rs = state.executeQuery(queryKategori);
            int nomor = 0;
            while(rs.next()){
                System.out.println("\n");
                System.out.println("--------------------------------");
                System.out.println("Jenis Kategori");
                nomor++;
                System.out.println("No  : " + nomor);
                System.out.println("ID Kategori :" + rs.getString(1));
                System.out.println("Jenis Kategori :" + rs.getString(2));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
  
    
//    Menu Kasir
    public static void tampilkanKasir() {
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
//            String query = "select * from produk";
            String queryKasir = "select * from kasir";
            state = con.createStatement();
            rs = state.executeQuery(queryKasir);
            int nomor = 0;
            while(rs.next()){
                System.out.println("\n");
                System.out.println("--------------------------------");
                nomor++;
                System.out.println("No  : " + nomor);
                System.out.println("ID Kasir :" + rs.getString(1));
                System.out.println("Nama Kasir :" + rs.getString(2));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void tambahKasir() {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        
        String id_kasir = null;
        System.out.print("Nama Kasir : ");
        String nama_kasir= sc.nextLine();
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
//            String queryKategori = "select kode_produk, nama_produk, jenis_kategori, harga, stok from produk, kategori where kategori =  id_kategori;";
            String query = "insert into kasir values(?,?)";
            
            ps = con.prepareStatement(query);
            ps.setString(1, id_kasir);
            ps.setString(2, nama_kasir);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Insert Berhasil!");
            }else{
                System.out.println("Proses Gagal");
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void updateKasir() {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ID Kasir Yang Akan Di Update : ");
        String id_kasir = sc.nextLine();
        System.out.println("--------------------------------");
        System.out.print("Isi data kasir yang akan di update :\n");
        System.out.println("--------------------------------");
        System.out.print("Nama Kasir :");
        String nama_kasir = sc.nextLine();
        System.out.println("Isi");
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "update kasir set nama_kasir=? where id_kasir=?;";
            
            ps = con.prepareStatement(query);
            
            ps.setString(1, nama_kasir);
            ps.setString(2, id_kasir);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Update Berhasil!");
            }else{
                System.out.println("Proses Gagal");
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void deleteKasir() {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ID Kasir Yang Akan Dihapus : ");
        String id_kasir = sc.next();
       
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "delete from kasir where id_kasir=?";
            
            ps = con.prepareStatement(query);
            ps.setString(1, id_kasir);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Hapus Data Berhasil!");
            }else{
                System.out.println("Proses Gagal");
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
       
   
    
//    Menu Transaksi
    public static void tampilkanTransaksi() {
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
//          String queryReferensi = "select kode_produk, nama_produk, jenis_kategori, harga, stok from produk, kategori where kategori =  id_kategori;";
            String queryProduk_Kasir = "SELECT no_invoice, nama_produk, tanggal, qty, nama_kasir, harga, total\n" +
                                        "FROM kasir K\n" +
                                        "INNER JOIN transaksi T\n" +
                                        "ON K.id_kasir = T.kasir\n" +
                                        "INNER JOIN produk P\n" +
                                        "ON P.kode_produk = T.produk;";
//          String queryTransaksi = "select * from transaksi";
            state = con.createStatement();
            rs = state.executeQuery(queryProduk_Kasir);
            
            int nomor = 0;
            while(rs.next()){
//              System.out.println("\n");
                System.out.println("--------------------------------");
                nomor++;
                System.out.println("No  : " + nomor);
                System.out.println("No Invoice :" + rs.getString(1));
                System.out.println("Nama Produk :" + rs.getString(2));
                System.out.println("Tanggal Pembelian :" + rs.getString(3));
                System.out.println("QTY :" + rs.getString(4));
                System.out.println("Nama Kasir :" + rs.getString(5));
                System.out.println("Total Harga :" + rs.getString("total"));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void tambahTransaksi() {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        
        String no_invoice = null;
        System.out.print("Masukkan Kode Produk : ");
        int produk = sc.nextInt();
        Timestamp tanggal = new Timestamp(System.currentTimeMillis());
        System.out.print("Harga Per PCS : ");
        int harga_per_pcs = sc.nextInt();
        System.out.print("QTY : ");
        int qty = sc.nextInt();
        System.out.print("Pilih kasir : ");
        int kasir = sc.nextInt();
        int totalSebelum = qty;
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url, username, password);
            
            String query = "insert into transaksi values(?,?,?,?,?,?,?)";
            int totalSesudah = totalSebelum * harga_per_pcs;           
            
            ps = con.prepareStatement(query);
            ps.setString(1, no_invoice);
            ps.setInt(2, produk);
            ps.setTimestamp(3, tanggal);
            ps.setInt(4, harga_per_pcs);
            ps.setInt(5, qty);
            ps.setInt(6, kasir);
            ps.setInt(7, totalSesudah);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Insert Berhasil!");
            }else{
                System.out.println("Proses Gagal");
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void deleteTransaksi() {
        int no = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ID Kasir Yang Akan Dihapus : ");
        String id_kasir = sc.next();
       
        
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(url,username,password);
            String query = "delete from kasir where id_kasir=?";
            
            ps = con.prepareStatement(query);
            ps.setString(1, id_kasir);
            
            if (ps.executeUpdate() > 0) {
                System.out.println("Proses Hapus Data Berhasil!");
            }else{
                System.out.println("Proses Gagal");
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
       

//     Per-Akun-an
    public static void insertAkun(String id_akun, String nama_user, String pass) throws Exception{
        Class.forName(jdbc);
        con = DriverManager.getConnection(url, username, password);

        String query = "INSERT INTO akun VALUES (?,?,?)";
        
        ps = con.prepareStatement(query);

        ps.setString(1, id_akun);
        ps.setString(2, nama_user);
        ps.setString(3, pass);

        if(ps.executeUpdate() > 0){
            System.out.println("Proses daftar berhasil!");
        } else {
            System.out.println("Proses daftar berhasil!");
        }
    }
    
    public static String getPassword(String id_akun) throws Exception {
        
        Class.forName(jdbc);
        con = DriverManager.getConnection(url, username, password);
        
        String query = "SELECT pass FROM akun WHERE id_akun = (?)";
        ps = con.prepareStatement(query);
        ps.setString(1, id_akun);
        rs = ps.executeQuery();

        if(!rs.next()){
            return null;
        }
        else{
            return rs.getString(1).toString();
        }

    }
}
