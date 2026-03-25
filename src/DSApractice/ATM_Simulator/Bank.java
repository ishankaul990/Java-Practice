package DSApractice.ATM_Simulator;



import java.util.Scanner;
public class Bank {
    private double balance = 10000;


    public double deposit(double money) {
       if(money > 0) {
           balance += money;

       }
       else{
           System.out.println("Wrong input");
       }
        return balance;
    }

    public double withdraw(double money) {
        if (money > balance) {
            System.out.println("insufficient funds");
        } else {
            balance -= money;
        }
        return balance;
    }

    public double getBalance() {
        return this.balance;
    }


}



