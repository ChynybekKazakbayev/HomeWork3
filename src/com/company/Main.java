package com.company;

import com.company.BankAccount;

public class Main {

    public static void main(String[] args) throws Exception{
        BankAccount bank = new BankAccount();
        bank.deposit(10000);
        while (true){
            bank.withDraw(1000);
        }

    }
}

