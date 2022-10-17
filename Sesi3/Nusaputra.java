
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dave Maulana Ferros
 */
public class Nusaputra extends Mahasiswa{
    
    public Nusaputra(String nim, String nama, int nilai) {
        super(nim, nama, nilai);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList <Mahasiswa> mhs = new ArrayList<>();
        ArrayList <Mahasiswa> lulus = new ArrayList<>();
        ArrayList <Mahasiswa> tidaklulus = new ArrayList<>();
        
        
        for (int i = 0; i < 4; i++) {
            System.out.print("input NIM: ");
            String nim = input.nextLine();
            
            System.out.print("input Nama: ");
            String nama = input.nextLine();

            System.out.print("input Nilai: ");
            int nilai = Integer.parseInt(input.nextLine());
            
            mhs.add(new Mahasiswa(nama, nim, nilai));
            if((mhs.get(i).getGrade().compareTo("A") == 0) || (mhs.get(i).getGrade().compareTo("B") == 0) || (mhs.get(i).getGrade().compareTo("C") == 0)){
                lulus.add(new Mahasiswa(nim, nama, nilai));
            }
            else{
                tidaklulus.add(new Mahasiswa(nama, nim, nilai));
            }
            System.out.println("================================");
        }
        
        System.out.println("Total mahasiswa : " + mhs.size());
        System.out.print("Jumlah mahasiswa yang lulus : ");
        printMhs(lulus);
        System.out.print("Jumlah mahasiswa yang tidak lulus: ");
        printMhs(tidaklulus);
        printNilai(mhs, "A");
        printNilai(mhs, "B");
        printNilai(mhs, "C");
        printNilai(mhs, "D");
        printNilai(mhs, "E");
        System.out.println();
        System.out.println("rata rata nilai: ");
        rataRata(mhs);
        
        input.close();
    }    
        
        public static void printMhs(ArrayList<Mahasiswa> mhs){
        System.out.print(mhs.size() + " yaitu ");
        for (int i = 0; i < mhs.size(); i++) {
            System.out.print(mhs.get(i).getNama() + ", ");
        }
        System.out.println();

    }

    public static void printNilai(ArrayList<Mahasiswa> mhs, String nilai){
        if(jumlahGrade(mhs, nilai) > 0){
            System.out.println();
            System.out.print("Jumlah mahasiswa dengan nilai " + nilai +  " : " + jumlahGrade(mhs, nilai) + " yaitu ");
        }
        
        for(int i = 0; i < mhs.size(); i++){
            if(mhs.get(i).getGrade().equals(nilai)){
                System.out.print(mhs.get(i).getNama() + ", ");
            }
        }
    }

    public static int jumlahGrade(ArrayList<Mahasiswa> mhs, String nilai){
        int jumlah = 0;
        for(int i = 0; i < mhs.size(); i++){
            if(mhs.get(i).getGrade().equals(nilai)){
                jumlah++;       
            }
        }
        return jumlah;
    }

    public static float rataRata(ArrayList<Mahasiswa> mhs){
        System.out.println();
        int jumlah = 0;
        for(int i = 0; i < mhs.size(); i++){
            if(mhs.get(i).getNilai() <= 100 && mhs.get(i).getNilai() >= 0){
                jumlah += mhs.get(i).getNilai();
                System.out.print(mhs.get(i).getNilai() + " + ");
            }
            else{
                System.out.println("0 + ");
            }
        }

        System.out.print(" = " + (float)jumlah/mhs.size());

        return jumlah / mhs.size();
        
    }
    
}
