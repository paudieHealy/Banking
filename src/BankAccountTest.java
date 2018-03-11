package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
       // fail();
        BankAccount account = new BankAccount("hasan","jaman",1000,BankAccount.CHECKING);
        double balance = account.deposit(500,true);
        assertEquals(1500,balance,0);
    }

    @org.junit.Test
    public void withdraw() {
        BankAccount account = new BankAccount("hasan","jaman",1500,BankAccount.CHECKING);
        double balance = account.withdraw(800,true);
        assertEquals(700,balance,0);
    }

    @org.junit.Test
    public void getBalance() {
        fail("This test has yet to be implemented");
    }
    @Test
    public void getBalance_Withdraw() {
        BankAccount account = new BankAccount("hasan","jaman",1500,BankAccount.CHECKING);
        account.withdraw(800,true);
        assertEquals(700,account.getBalance(),0);
    }

    @Test
    public void isChecking_true(){                                                                      // 1
        BankAccount account = new BankAccount("hasan","jaman",1500,BankAccount.CHECKING);
        //assertEquals(true,account.isChecking());
        assertTrue("account is not checking account",account.isChecking());
    }

}