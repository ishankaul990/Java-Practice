package com.company.InheritancePractice;

public class CircleInheritance extends Shape{
    double radius;

    public CircleInheritance(double radius) {
        this.radius = radius;
    }
    public double area(){
        return radius*radius*3.14;
    }
}

