/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Laptop.commercial;

import com.Laptop.commercial.Laptop.Laptops;
import java.util.Scanner;

/**
 *
 * @author Dave Maulana Ferros
 */
public class Main {
    public static void main(String[] args) {
        Laptops thinkpad = new Lenovo();
        LaptopUser andri = new LaptopUser(thinkpad);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Gunakan Laptop");
        
        while(true){
            System.out.print("Operasi apa yang akan anda lakukan? \nON/OFF/UP/DOWN/EXIT: ");
            String input = in.nextLine();
            if(input.equals("EXIT")){
                System.out.println("laptop sedang tidak digunakan");
                break;
            }
            pakaiLaptop(andri, input);
        }
    }
    
    public static void pakaiLaptop(LaptopUser laptop, String input){
        if(input.equals("ON")){
            laptop.turnOnLaptop();
        }
        else if(input.equals("OFF")){
            laptop.turnOffLaptop();
        }
        else if(input.equals("UP")){
            laptop.makeLaptopLouder();
        }
        else if(input.equals("DOWN")){
            laptop.makeLaptopSilence();
        }
    }
}
