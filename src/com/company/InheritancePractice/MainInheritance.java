package com.company.InheritancePractice;


public class MainInheritance  {
    public static void main(String[] args) {
       Shape r1 = new Reactangle(10,25);
       Shape c1 = new CircleInheritance(9);
        System.out.println(r1.area());
        System.out.println(c1.area());

    }
}
