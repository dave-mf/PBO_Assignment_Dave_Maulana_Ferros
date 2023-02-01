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

public class HalamanLogin {
    
    public static void jalankan(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan User ID Anda: ");
        String user = sc.nextLine();

        System.out.print("Masukkan Password Anda: ");
        String pass = sc.nextLine();

        //cek password
        try {
            if(pass.equals(crudManagement.getPassword(user))){
                menuUser.setCurrentUser(user);
                System.out.println("----------------");
                System.out.println("Login Berhasil!");
                System.out.println("----------------");
                menuUser.tampilkan();
            }
            else{
                System.out.println("Password salah!, tolong masukkan password dengan benar");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
