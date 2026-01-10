package com.company.InheritancePractice;

public class Reactangle extends Shape{
    double length;
    double breadth;

    public Reactangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        double area = length*breadth;
        return area;
    }
}
