/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailcertificationapp;

/**
 *
 * @author sharo_mabhfnq
 */
public class EmailCertificationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Email emL1= new Email("John", "Black");
        
       //emL1.setAlternateEmail("");
      System.out.println(emL1.showInfo());
       
    }
    
}
