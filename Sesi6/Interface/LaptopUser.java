/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Laptop.commercial;

import com.Laptop.commercial.Laptop.Laptops;

/**
 *
 * @author Dave Maulana Ferros
 */
public class LaptopUser {
    private Laptops laptop;
    
    public LaptopUser(Laptops laptop){
        this.laptop = laptop;
    }
    
    void turnOnLaptop(){
        this.laptop.powerOn();
    }
    void turnOffLaptop(){
        this.laptop.powerOff();
    }
    void makeLaptopLouder(){
        this.laptop.volumeUp();
    }
    void makeLaptopSilence(){
        this.laptop.volumeDown();
    }
}
