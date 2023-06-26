package com.mycompany.labq5;

/**
 *
 * @author M D C Jayashan
 */
public class SavingAccount extends BankAccount
{
    private static final double SAVING_INTEREST_RATE=0.12;
    
    @Override
    public double calculateInterest()
    {
        return getbal()* SAVING_INTEREST_RATE;
    }
    
}
