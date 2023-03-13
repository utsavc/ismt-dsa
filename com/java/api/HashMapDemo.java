package com.java.api;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Ram");
        hm.put(2,"Ramesh");
        hm.put(1,"Rambo");
        hm.put(0,"Ram");
        hm.put(110,"Ram");
        hm.put(5,"Sujan");

       for (Map.Entry<Integer,String> entry: hm.entrySet()){
            System.out.println(entry);
        }

        for (Integer s:hm.keySet()) {
            System.out.println(s);
        }
        for (String s:hm.values()) {
            System.out.println(s);
        }

        System.out.println(hm);
        hm.remove(1);
        System.out.println(hm);

    }
}
