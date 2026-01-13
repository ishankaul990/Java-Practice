package com.company.collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "ishan");
        students.put(2, "Jack");
        students.put(3, "Katrina");
        students.put(4, "Karan");

        for ( Integer key : students.keySet()){
            System.out.println(key +" = "+ students.get(key)); // using keySet()
        }
        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println(entry.getKey()+ " = "+ entry.getValue()); // using entrySet()

        }
        if(students.containsKey(4)){
            System.out.println(" Key exists");
        }
        else{
            System.out.println("Invalid key");
        }
        students.remove(1); // removed 1st key
        for(int updatedKey : students.keySet()){
            System.out.println(updatedKey +" = "+ students.get(updatedKey)); // prints updated key
        }
    }
}
