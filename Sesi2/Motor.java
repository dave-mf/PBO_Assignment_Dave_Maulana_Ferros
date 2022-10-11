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
public class Motor {
    boolean nyala;
    int perseneling;
    int kecepatan;
    
    
    Motor(){
        nyala = false;
        perseneling = 0;
        kecepatan = 0;
    }
    
    public void Nyala(){
        if (nyala == true) {
            System.out.println("Motor sedang menyala");
        }else{
            System.out.println("Motor berhasil dinyalakan");
            nyala = true;
        }
    }
    
    public void Mati(){
        if (nyala == false) {
            System.out.println("Motor sedang mati");
        }else{
            System.out.println("Motor berhasil dimatikan");
            nyala = false;
        }
    }
    
    public void tambahPerseneling(){
        if (perseneling <= 6) {
            perseneling++;
            System.out.println("Gigi :" +perseneling);
        }
    }
    
    public void kurangiPerseneling(){
        if (perseneling >= 0) {
            perseneling--;
            System.out.println("Gigi" + perseneling);
        }
        
        if(perseneling == 6 && kecepatan > 150){
            kecepatan = 150;
            System.out.println("Kecepatan sepeda motor anda : " + kecepatan);
        }
        
        else if(perseneling == 5 && kecepatan > 100){
            kecepatan = 100;
            System.out.println("Kecepatan sepeda motor anda : " + kecepatan);
        }
        
        else if(perseneling == 4 && kecepatan > 75){
            kecepatan = 75;
            System.out.println("Kecepatan sepeda motor anda : " + kecepatan);
        }
        
        else if(perseneling == 3 && kecepatan > 50){
            kecepatan = 50;
            System.out.println("Kecepatan sepeda motor anda : " + kecepatan);
        }
        
        else if(perseneling == 2 && kecepatan > 25){
            kecepatan = 25;
            System.out.println("Kecepatan sepeda motor anda : " + kecepatan);
        }
        
        else if(perseneling == 1 && kecepatan > 10){
            kecepatan = 10;
            System.out.println("Kecepatan sepeda motor anda : " + kecepatan);
        }
    }
    
    public void tambahKecepatan(int jml_kecepatan){
        if(nyala == true){
            if (perseneling == 0) {
                System.out.println("Motor tidak bisa berjalan");
                System.out.println("Perseneling dalam keadaan normal");
            }
            else if(perseneling == 1){
                if (kecepatan + jml_kecepatan > 10) {
                    System.out.println("Mottor akan melebihi kecepatan di Gigi 1");
                }else{
                    kecepatan += jml_kecepatan;
                }
            System.out.println("Kecepatan motor sekarang adalah : " +kecepatan);
            
            }
            
            else if(perseneling == 2){
                if (kecepatan + jml_kecepatan > 25) {
                    System.out.println("Mottor akan melebihi kecepatan di Gigi 2");
                }else{
                    kecepatan += jml_kecepatan;
                }
            System.out.println("Kecepatan motor sekarang adalah : " +kecepatan);
            
            }
            
            else if(perseneling == 3){
                if (kecepatan + jml_kecepatan > 50) {
                    System.out.println("Mottor akan melebihi kecepatan di Gigi 3");
                }else{
                    kecepatan += jml_kecepatan;
                }
            System.out.println("Kecepatan motor sekarang adalah : " +kecepatan);
            
            }
            
            else if(perseneling == 4){
                if (kecepatan + jml_kecepatan > 75) {
                    System.out.println("Mottor akan melebihi kecepatan di Gigi 4");
                }else{
                    kecepatan += jml_kecepatan;
                }
            System.out.println("Kecepatan motor sekarang adalah : " +kecepatan);
            
            }
            
            else if(perseneling == 5){
                if (kecepatan + jml_kecepatan > 100) {
                    System.out.println("Mottor akan melebihi kecepatan di Gigi 5");
                }else{
                    kecepatan += jml_kecepatan;
                }
            System.out.println("Kecepatan motor sekarang adalah : " +kecepatan);
            
            }
            
            else if(perseneling == 6){
                if (kecepatan + jml_kecepatan > 150) {
                    System.out.println("Mottor akan berada di kecepatan maksimal");
                }else{
                    kecepatan += jml_kecepatan;
                }
            System.out.println("Kecepatan motor sekarang adalah : " +kecepatan);
            
            }
        }else{
            System.out.println("Motor belum menyala");
        }
    }
    
    public void kurangiKecepatan(int jml_kecepatan){
        if (nyala == true) {
            kecepatan -= jml_kecepatan;
            System.out.println("Kecepatan motor dikurangi");
            System.out.println("Kecepatan motor anda sekarang : " + kecepatan);
        }
    }
    
    public void infoMotor(){
        if (kecepatan >= 0 && kecepatan <= 50) {
            System.out.println("Kecepatan rendah");
        }else if(kecepatan >= 51 && kecepatan < 75){
            System.out.println("Kecepatan sedang");
        }else if(kecepatan >= 75){
            System.out.println("Kecepatan tinggi");
        }
    }
    
    public static void main(String[] args) {
        Motor motor = new Motor();
        
        motor.Nyala();
        
        motor.tambahPerseneling();
        motor.tambahPerseneling();
        motor.tambahPerseneling();
        motor.tambahKecepatan(50);
        motor.kurangiKecepatan(25);
        motor.kurangiPerseneling();
        
        motor.infoMotor();
        
    }
}
