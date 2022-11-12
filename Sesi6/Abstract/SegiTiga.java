/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave Maulana Ferros
 */
public class SegiTiga extends BangunDatar {
    private float alas;
    private float tinggi;
    
    public SegiTiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    float getLuas() {
        return (float)0.5 * alas * tinggi;
    }
}
