package com.java.api;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("World");

        System.out.println(hs);

        hs.remove("Hello");
        System.out.println(hs);
    }
}
