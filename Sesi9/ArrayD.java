/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi9;

import java.util.ArrayDeque;

/**
 *
 * @author Dave Maulana Ferros
 */
//Collection Array Deque
public class ArrayD {
    public static void main(String[] args) {
        ArrayDeque<String> keyboard = new ArrayDeque<>();
        keyboard.add("Logitech");
        keyboard.addFirst("Razer");
        keyboard.add("Digital Alliance");
        keyboard.addLast("Keychron");
        for(String brand : keyboard){
            System.out.println(brand);
        }
    }
}
