package com.company;

import com.company.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposit(10000);
        while (bank.amount > 0){
            try {
                bank.withDraw(1000);
            } catch (LimitException e) {
                e.printStackTrace();
            }
        }

    }
}

