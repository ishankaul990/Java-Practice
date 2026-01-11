package com.company.encapsulation;

public class EncapMain {
    public static void main(String[] args) {
        BankAccount1 a = new BankAccount1(1000);
        a.withDraw(100);
        a.newBalance();
        a.deposit(200);
        a.newBalance();
    }
}
