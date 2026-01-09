package com.company.CalculatorProject;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       double sum =  calculator.add(2,4);
        System.out.println(sum);
        System.out.println(calculator.divide(4,2));
    }
}
