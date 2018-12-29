package com.company.Exercise_09.Exercise_09_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a MyStack
        MyStack stack = new MyStack();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");


        // Display in reverse order
        System.out.println("Stack: " + stack.toString());
        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.getSize());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack: " + stack.toString());
        System.out.println("Size: " + stack.getSize());
        System.out.println("Empty? " + stack.isEmpty());

    }
}
