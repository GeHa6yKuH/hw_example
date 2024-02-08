package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("_____________________________");
        System.out.println(stack.empty());
        System.out.println("_____________________________");

        stack.push("Ol");

        Iterator<String> stringIterator = stack.iterator();
        stringIterator.remove();

        System.out.println("_____________________________");
        System.out.println(stack.empty());
        System.out.println("_____________________________");
    }
}