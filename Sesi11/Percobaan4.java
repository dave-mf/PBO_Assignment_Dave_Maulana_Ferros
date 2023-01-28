/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi11;

/**
 *
 * @author Dave Maulana Ferros
 */
public class Percobaan4 {
    public static void main(String[] args) {
        int bil=10;
        String b[]={"a","b","c"};
        
        try{
            System.out.println(bil/0);
            System.out.println(b[3]);
        }
        
        catch(ArithmeticException e){
            System.out.println("Terjadi Aritmatika error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Melebihi jumlah array");
        }
        catch(Exception e){
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}