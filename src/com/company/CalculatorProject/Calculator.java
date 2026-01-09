package com.company.CalculatorProject;

public class Calculator implements Functions{


    @Override
    public double add(double a , double b) {

        return a+b;
    }

    @Override
    public double subtract(double a , double b) {
        return a-b;
    }

    @Override
    public double multiply(double a , double b) {
        return a*b;
    }

    @Override
    public double divide(double a , double b) {
        return a/b;
    }
}
