package com.mycompany.labq5;

/**
 *
 * @author M D C Jayashan
 */
abstract class BankAccount 
{
    private int accNo;
    private double bal;
    
    public void setaccNo(int accNo)
    {
        this.accNo=accNo;
    }
    public int getaccNo()
    {
        return accNo;
    }
    public void setbal(double bal)
    {
        this.bal=bal;
    }
    public double getbal()
    {
        return bal;
    }
    public abstract double calculateInterest();
    
    
}
