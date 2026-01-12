package com.company.exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch(NullPointerException e){
            System.out.println("Null value found");
        }
        catch(Exception e ){
            System.out.println("General Exception");
        }
        finally {
            System.out.println("'Finally' always runs");
        }
    }
}
