package DSApractice.ATM_Simulator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank acc = new Bank();

        while(true){

            System.out.println("Plese choose the options");
            System.out.println("Press 1 to check balance\n" + "Press 2 to deposit \n" + "press 3 to withdraw\n" + "Press 4 to exit\n");
            int choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.println(acc.getBalance());
                    break;
                case 2 :
                    System.out.println("Please enter amount to deposit\n");
                    double d = sc.nextDouble();
                    acc.deposit(d);
                    System.out.println("Updated Balance = "+ acc.deposit(d));
                    break;
                case 3:
                    System.out.println("Please enter amount to withdraw\n");
                    double w = sc.nextDouble();
                    acc.withdraw(w);
                    System.out.println("Updayed Balance = "+ acc.withdraw(w));
                    break;
                case 4:
                    System.out.println("Exiting...");
                     return;
                default:
                    System.out.println("Wrong input. Plaese try agaon \n");
            }
        }
    }
}
