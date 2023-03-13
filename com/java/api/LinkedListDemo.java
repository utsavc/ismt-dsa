package com.java.api;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<>();
        ll.add("February");
        ll.add("March");
        ll.add("April");
        System.out.println(ll);
        ll.addFirst("January");


        System.out.println(ll);
        ll.add(2,"May");
        System.out.println(ll);

        Iterator<String> it=ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
