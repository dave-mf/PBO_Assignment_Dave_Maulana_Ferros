/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi12;

/**
 *
 * @author Dave Maulana Ferros
 */
import java.awt.*;
import javax.swing.*;
public class MyForm extends JFrame
{    
   JButton b0,b10,b11,b12,b13,b14,b15,b16,b17; 
   JButton b[]=new JButton[10];
    int i,r,n1,n2;
    JTextField res;
    char op; 
   public MyForm()
  {
     super("Calulator");
      setLayout(new BorderLayout());
      JPanel p=new JPanel();
      p.setLayout(new GridLayout(3,6));
      
      b0=new JButton("0");
      p.add(b0);
      for(int i=1;i<=9;i++)
      {
        b[i]=new JButton(i+"");
        p.add(b[i]);
      }
      b10=new JButton("+");
      p.add(b10);

      b11=new JButton("-");
      p.add(b11);

      b12=new JButton("*");
      p.add(b12);

      b13=new JButton("/");
      p.add(b13);
 
      b14=new JButton("=");
      p.add(b14);

      b15=new JButton("%");
      p.add(b15);
      
      b16=new JButton("Mod");
      p.add(b16);
      
      b17=new JButton("Exit");
      p.add(b17);

      res=new JTextField(20);
      add(p,BorderLayout.CENTER);
      add(res,BorderLayout.NORTH);
      setVisible(true);
      setSize(400,200);
     }


  public static void main(String arg[])
  {
      new MyForm();
   }
}
