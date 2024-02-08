package org.example;

import java.util.ArrayList;
import java.util.List;

public class Rec3 {
    public static void main(String[] args) {
        m1(Rec3::rr);

        List<Inter> inters = new ArrayList<>();
        inters.forEach(System.out::println);
    }

    public static void rr() {
        System.out.println("^^^");
        System.out.println("jet");
    }


    public static void m1(Inter1 inter1) {
        System.out.println("ahah");
        inter1.get();
    }
}
