/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts_pbo.Lingkaran;

/**
 *
 * @author Dave Maulana Ferros
 */
public class SetengahLingkaran implements Lingkaran{
    
    double hasil;
    public SetengahLingkaran(){
        hasil = 0;
    }
    @Override
    public void hitungLuas() {
        hasil = (panjang * lebar) * (Math.PI * lebar * lebar);
    }
    
    public double getHasil(){
        return hasil;
    }
}
