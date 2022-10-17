/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi4;

/**
 *
 * @author Dave Maulana Ferros
 */
// Overloading
public class Perkalian {
     public float kali(float a, float b){
        return a * b;
    }
     
    public int kali(int a, int b) {
        return a * b;
    }

    public double kali(double a, double b){
        return a * b;
    }

    public static void main(String[] args) {
        Perkalian pkr = new Perkalian();

        System.out.println("Perkalian dengan tipe data float : " +pkr.kali(9.8, 2.5));
        System.out.println("Perkalian dengan tipe data int : " +pkr.kali(43, 12));
        System.out.println("Perkalian dengan tipe data double : " +pkr.kali(17.029384902348, 18.102912387864));
        
    }
}
