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
import java.util.UUID;

public class DaftarAkun {
    
    public static void jalankan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");

        System.out.print("Masukkan Nama : ");
        String user = sc.nextLine();
        System.out.print("Masukkan Password : ");
        String password = sc.nextLine();

        //insert data
        String id = UUID.randomUUID().toString();
        String newid = "";
        for (int i = 0; i < 13; i++) {
            newid += id.charAt(i);
        }

        try {
            crudManagement.insertAkun(newid, user, password);
            System.out.println("User ID Digunakan Untuk Login, Mohon Untuk Dicatat!" );
            System.out.println("User ID Anda : " + newid);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        sc.close();
    }
}
