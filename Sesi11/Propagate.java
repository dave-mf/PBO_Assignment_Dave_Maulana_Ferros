/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_sesi11;

/**
 *
 * @author Dave Maulana Ferros
 */
public class Propagate {
    public static void main(String[] args){
        try{
            System.out.println(reverse(""));
        }
        catch(Exception e){
            System.out.println("The String was blank");
        }
        finally{
            System.out.println("All done");
        }
    }

    public static String reverse(String s) throws Exception{
        if(s.length() == 0){
            throw new Exception();
        }
        String reverseStr = "";
        for(int i = s.length() - 1; i >= 0; --i){
            reverseStr += s.charAt(i);
        }

        return reverseStr;
    }
}