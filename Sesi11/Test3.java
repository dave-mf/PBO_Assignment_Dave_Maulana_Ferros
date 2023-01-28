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
import java.io.*;

public class Test3 {
    
    public void methodA(){
        System.out.println("Method A");
    }

    public void methodB(){
        System.out.println(20/0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args){
        Test3 o = new Test3();
        o.methodA();
    
        try {
            o.methodB();

        } catch (Exception e) {
            System.out.println("Error di method B");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("selalu dicetak");
        }
    }
}