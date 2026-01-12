package com.company.exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 2/0;
        }
        catch (Exception e){
            System.out.println("please dont divide by zero");
        }
        finally {
            System.out.println("Execution finished");
        }
    }
}
