package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(powerNumber(5,4));
    }

    public static int powerNumber(int num, int power) {
        if (power > 0) {
            return num * powerNumber(num,power - 1);
        } else if (power == 0){
            return 1;
        }
        return num;
    }

    public static int powerNorm(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * powerNumber(num,pow-1);
    }
}