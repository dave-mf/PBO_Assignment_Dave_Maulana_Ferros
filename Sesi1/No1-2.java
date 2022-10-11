/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi1;
import javax.swing.JOptionPane;

/**
 *
 * @author Dave Maulana Ferros
 */
public class PBO_Sesi1 {

    public static void main(String[] args) {
        //1
        JOptionPane.showMessageDialog(null, "Belajar Java");
        JOptionPane.showMessageDialog(null, "Sangat mudah sekali");
        JOptionPane.showMessageDialog(null, "dan sangat menyenangkan");
        
        //2
        String input = JOptionPane.showInputDialog("Inputkan sesuatu");
        JOptionPane.showMessageDialog(null, "Belajar "+input+ " sangat mudah");
    }
    
}
