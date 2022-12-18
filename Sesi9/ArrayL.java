/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi9;

import java.util.ArrayList;

/**
 *
 * @author Dave Maulana Ferros
 */
//Collection ArrayList
public class ArrayL {
    public static void main(String[] args) {
        ArrayList <String> myData = new ArrayList<String>();
        myData.add("Lenovo");
        myData.add("HP");
        myData.add("Asus");
        for (String brand : myData){
            System.out.println(brand);
        }
    }
}
