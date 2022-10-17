/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave Maulana Ferros
 */
public class Mahasiswa {
    String nim, nama, grade;
    int nilai;
    
    Mahasiswa(String nim, String nama, int nilai){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        setGrade();
    }
    
    public void setGrade(){
        if (getNilai() >= 80 && getNilai() <= 100) {
            setGrade("A");
        }else if(getNilai() >= 70 && getNilai() < 80){
            setGrade("B");
        }else if(getNilai() >= 60 && getNilai() < 70){
            setGrade("C");
        }else if(getNilai() >= 50 && getNilai() < 60){
            setGrade("D");
        }else if(getNilai() < 50){
            setGrade("E");
        }else{
            setGrade("Input anda salah!, masukkan nilai dengan benar");
        }
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }
    
    public String getGrade(){
        return this.grade;
    }
    
    public void infoMahasiswa(){
        System.out.println("NIM :" + getNim());
        System.out.println("Nama :" + getNama());
        System.out.println("Nilai :" + getNilai());
        System.out.println("Grade :" + getGrade());
    }
   
//  Get
    public String getNim(){
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getNilai(){
        return nilai;
    }
    
//  Set
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNilai(int nilai){
        this.nilai = nilai;
    }

}