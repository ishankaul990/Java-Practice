package com.company.exceptions;

public class ThrowDemo {
    public static void main(String[] args) {
       demo(17);

    }
    static void demo(int age){
        if (age < 18 ){
            throw new IllegalArgumentException("Not eligible for entry");
        }


    }
}
