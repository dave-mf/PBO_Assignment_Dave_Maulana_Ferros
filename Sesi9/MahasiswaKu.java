/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi9;

/**
 *
 * @author Dave Maulana Ferros
 */
class Mahasiswa <T> {
    private T data;
    
    public T getData(){
        return data;
    }
    
    public void setData(T data){
        this.data = data;
    }
}

public class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa<String> m1 = new Mahasiswa<String>();
        Mahasiswa<String> m2 = new Mahasiswa<String>();
        Mahasiswa<Integer> m3 = new Mahasiswa<Integer>();
        
        m1.setData("1102020");
        m2.setData("Ferdi");
        m3.setData(21);
        
        String value1 = m1.getData();
        String value2 = m2.getData();
        Integer value3 = m3.getData();
        
        System.out.println("NIM   : " +value1);
        System.out.println("Nama  : " +value2);
        System.out.println("Kelas : " +value3);
    }
}
