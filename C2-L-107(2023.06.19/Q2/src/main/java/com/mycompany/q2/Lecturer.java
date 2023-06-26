package com.mycompany.q2;

/**
 *
 * @author M D C Jayashan
 */
public class Lecturer implements Speaker
{
    @Override
    public void speak()
    {
        System.out.println("As a Lecturer, I deliver Lectures");
    }
}
