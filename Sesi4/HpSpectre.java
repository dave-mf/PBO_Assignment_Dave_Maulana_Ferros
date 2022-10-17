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
public class HpSpectre extends LaptopHP{
    public void spesifikasiLaptop(){
        super.spesifikasiLaptop();
        System.out.println("Laptop ini dibekali dengan processor Intel 13th Gen \nRAM 32GB \nStorage 2TB \nGraphics Card Nvidia MX");
    }
    
    public static void main(String[] args) {
        HpSpectre hpspectre = new HpSpectre();
        
        hpspectre.spesifikasiLaptop();
    }
}
