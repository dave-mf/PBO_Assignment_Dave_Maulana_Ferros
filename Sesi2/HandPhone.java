/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi_2;

/**
 *
 * @author Dave Maulana Ferros
 */
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    String getJenisHP(){
        return jenis_hp;
    }
    
    int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Xiaomi", 2020);
        hp.getJenisHP();
        hp.getTahunPembuatan();
        
        System.out.println(hp.getJenisHP() + "," + hp.getTahunPembuatan());
    }
}
