package com.java.api;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        System.out.println(arr.size());
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Mango");
        arr.add("Litchi");
        arr.add(1,"Papaya");
        System.out.println(arr.size());




        System.out.println(arr);
        arr.remove("Apple");
        System.out.println(arr); System.out.println(arr.size());

    }
}
