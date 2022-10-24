
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
public class Mahasiswa extends Person{
    private int jumlah_matkul;
    private ArrayList<String> mata_kuliah;
    private ArrayList<Integer> nilai_list;
    

    public Mahasiswa(String name, String address) {
        super(name, address);
        mata_kuliah = new ArrayList<>();
        nilai_list = new ArrayList<>();
    }
    
    public void addCourseGrade(String mata_kuliah, int grade){
        this.mata_kuliah.add(mata_kuliah);
        this.nilai_list.add(grade);
        jumlah_matkul++;
    }
    
    public void printNilaiList(){
        for (int i = 0; i < jumlah_matkul; i++) {
            System.out.println("Mata Kuliah : " + mata_kuliah.get(i) + " " + "Grade   :" + nilai_list.get(i));
        }
    }
    
    public double getAverageGrade(){
        int jumlah = 0;
        for (int i = 0; i < jumlah_matkul; i++) {
            jumlah += nilai_list.get(i);
        }
        
        return jumlah / jumlah_matkul;
    }
    
    public String toString(){
        return
        super.toString() +
        "Jumlah matkul yang diambil : " + this.jumlah_matkul +
        "\nRata-rata nilai : " + getAverageGrade();
    }
    
    
    
}
