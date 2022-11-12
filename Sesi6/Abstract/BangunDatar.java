/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave Maulana Ferros
 */
public abstract class BangunDatar {
    String warna;
    
    String getWarna() {
        return warna;
    }
    
    void setWarna(String warna) {
        this.warna = warna;
    }
    
    abstract float getLuas();
}
