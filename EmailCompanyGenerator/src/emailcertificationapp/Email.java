/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailcertificationapp;

import java.util.Scanner;

/**
 *
 * @author sharo_mabhfnq
 */
public class Email {
    
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private int defaultPasswordLength =10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix ="whatevercompany.com";
    
    //constructor to recieve first and last name
    public Email(String firstName, String lastName){
        this.firstname= firstName;
        this.lastname= lastName;
        
        System.out.println("EMAIL CREATED: "+ this.firstname+" "+ this.lastname);
        
        //call method asking for department + returning department
                this.department = setDepartment();
        //System.out.println("Department: "+ this.department);
        
        //calling a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: "+this.password);
        
        //combine elements to create email
        email = firstname.toLowerCase() +"."+ lastname.toLowerCase()+"@"+department +"."+companySuffix ;
        //System.out.println("Your email is:"+ email);
        
               
    }
    
    // ask for the department
    private String setDepartment(){
        System.out.print("Department CODE:\n 1. Sales\n 2.Development\n 3. Accounting\n 0. None\n Enter Department Code:");
        
        Scanner in = new Scanner(System.in);
         int depChoice = in.nextInt();
         
         if(depChoice ==1){return "Sales";}
         else if(depChoice==2){return "Dev";}
         else if(depChoice==3){return "Acc";}
         else if(depChoice==0){return "";}
                  
    }
    
    
    //generate random password
    private String randomPassword(int length){
      String Passwordset ="ABCEDFGHIJKLMNOPQRSTUV1234567890!@#$";
      char[] password = new char[length];
      
      for(int i=0; i<length;i++){
          int random = (int) (Math.random()*Passwordset.length());
          password[i]=Passwordset.charAt(random);
      }
      return new String(password);
      
    }
    
    //set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity= capacity;
    }
    
    // set an alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    
    //change the password 
    public void changePassword(String Cpassword){
        this.password=Cpassword;
    }
    
    
    //get ,methods
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    
    public String getAlternateEmail(){
    return alternateEmail;
    }
    
    public String getPassowrd(){
        return password;
    }
    
    public String showInfo(){
        return "DISPLAY NAME: " + firstname + lastname+
                "COMPANY EMAIL: "+ email +
                "MAILBOX CAPACITY: "+mailboxCapacity+ "mb";
                        
                        
                        
                  
    }
    

}
