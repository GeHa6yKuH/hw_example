package org.example;

public class Rec2 {
    public static void main(String[] args) {
        m1( (x, d) -> {
            System.out.println("ahahahah");
            System.out.println("dddhdhdhdh");
            System.out.println(x);
            System.out.println(d);
        });
    }

    public static void m1(Inter inter) {
        System.out.println("****");
        inter.get("ti lox", " idi na f");
    }
}
