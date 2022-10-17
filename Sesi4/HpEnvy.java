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
public class HpEnvy extends LaptopHP{
    public void spesifikasiLaptop(){
        super.spesifikasiLaptop();
        System.out.println("Laptop ini dibekali dengan processor Intel 13th Gen \nRAM 16GB \nStorage 1TB \nGraphics Card Intel Iris X");
    }
    
    public static void main(String[] args) {
        HpEnvy hpenvy = new HpEnvy();
        
        hpenvy.spesifikasiLaptop();
    }
}
