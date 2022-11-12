/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave Maulana Ferros
 */
public class Lingkaran extends BangunDatar{

    float jari_jari;
    
    public Lingkaran(float jari_jari){
        this.jari_jari = jari_jari;
    }
    
    @Override
    float getLuas() {
        return (float) Math.PI * jari_jari * jari_jari;
    }
    
}
