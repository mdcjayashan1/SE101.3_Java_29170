package com.mycompany.labq5;

/**
 *
 * @author M D C Jayashan
 */
public class CheckingAccount extends BankAccount
{
    private static final double CHECKING_INTEREST_RATE=0.02;
    @Override
    public double calculateInterest()
    {
        return getbal()*CHECKING_INTEREST_RATE; 
    }
}
