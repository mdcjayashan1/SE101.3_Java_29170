package com.mycompany.labq5;

/**
 *
 * @author M D C Jayashan
 */
public class LabQ5 
{

    public static void main(String[] args) 
    {
       SavingAccount sc=new SavingAccount();
       sc.setaccNo(10);
       sc.setbal(1000000);
       System.out.println("interest is is "+sc.calculateInterest());
       CheckingAccount sc1=new CheckingAccount();
       sc1.setbal(200000000);
       System.out.println("interest is is "+sc1.calculateInterest());
       
       
        
    }
}
