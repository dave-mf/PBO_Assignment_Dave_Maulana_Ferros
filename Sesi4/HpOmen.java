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

//Overriding
public class HpOmen extends LaptopHP{
    public void spesifikasiLaptop(){
        super.spesifikasiLaptop();
        System.out.println("Laptop ini dibekali dengan processor Intel 13th Gen H-Series \nRAM 32GB \nStorage 2TB \nGraphics Card Nvidia RTX 3000 Series");
    }
    
    public static void main(String[] args) {
        HpOmen hpomen = new HpOmen();
        
        hpomen.spesifikasiLaptop();
    }
}
