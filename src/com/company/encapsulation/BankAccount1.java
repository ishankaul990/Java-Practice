package com.company.encapsulation;

public class BankAccount1 {
    private double balance;

    public BankAccount1(double balance){
        this.balance = balance;
    }

    protected double withDraw(double amount){
        if (amount != 0 && amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println(" please enter corrct amount");
        }
        return balance;
    }
    protected double deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
        else System.out.println("invalid number");
        return  balance;
    }

    public  void newBalance(){
        System.out.println(" new Balance is = "+ balance);
    }
}
