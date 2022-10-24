
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave Maulana Ferros
 */
public class Dosen extends Person{
    private int jumlah_matkul;
    private ArrayList<String> matkul_list;
    
    public Dosen(String name, String address){
        super(name, address);
        jumlah_matkul = 0;
        matkul_list = new ArrayList<>();
    }
    
    public boolean addCourse(String course){
//jika dalam arraylist ada yang sama maka matkul telah ada
        if (matkul_list.contains(course)) {
            System.out.println("Matkul sudah ada!");
            return false;
        }
        
//  Add matkul
        jumlah_matkul++;
        matkul_list.add(course);
        return true;
    }
    
    public boolean removeCourse(String course){
//jika dalam arraylist tidak ada course maka tidak bisa menghapus matkul
        if (!matkul_list.contains(course)) {
            System.out.println("Matkul yang akan dihapus tidak tersedia!");
            return false;
        }
        
//  Jika tersedia maka hapus
        jumlah_matkul--;
        matkul_list.remove(course);
        return true;
    }
    
    public int getjumlahMatkul(){
        return jumlah_matkul;
    }
    
    public String toString(){
        return
        super.toString() +
        "\nJumlah mata kuliah yang diampu : " + getjumlahMatkul();
    }
}
