package com.java.api;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> s=new Stack<String>();
        s.push("Ram");
        s.push("Shyam");
        s.push("Rama");
        s.push("Ramesh");

        System.out.println(s);

        s.size();
        s.pop();
        System.out.println(s);
        s.size();

        Iterator<String> it =s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
