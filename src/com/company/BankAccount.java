package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount=amount+sum;
        System.out.println("Ваш баланс:"+amount);
    }public void withDraw (double sum)throws LimitException {
        if (sum>amount){
            throw new LimitException("У вас недостаточно денег",getAmount());
        }amount=amount-sum;
        System.out.println(getAmount());
    }
}