package com.headfirst.java;

public class Magnets {
    int x = 3;
    int a = 4;

    public void magnetize(){
        while (x > 0) {
            if (x > 2){
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2){
                System.out.print("b c");
            }
            if (x == 1){
                System.out.print("d");
                x = x - 1;
            }
        }

    }
    public void magnetizeAgain() {
        while (a > 0) {
            if (a > 3) {
                System.out.print("adhere");
            }
            a = a - 1;
            System.out.print(" ");
            if (a == 3) {
                System.out.print("to");
            }
            if (a == 2) {
                System.out.print("the");
                a = a - 1;
                System.out.print(" ");
            }
            if (a == 1) {
                System.out.print("yellow");
            }
            if (a == 0){
                System.out.print("fridge");
            }
        }
    }
}