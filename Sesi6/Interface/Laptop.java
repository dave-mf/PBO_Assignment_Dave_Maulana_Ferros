/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave Maulana Ferros
 */
package com.Laptop.commercial;
public class Laptop {
    public interface Laptops {
        int MAX_VOL = 100;
        int MIN_VOL = 0;
        
        void powerOn();
        void powerOff();
        void volumeUp();
        void volumeDown();
    }
}
