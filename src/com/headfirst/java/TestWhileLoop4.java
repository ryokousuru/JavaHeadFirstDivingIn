package com.headfirst.java;

public class TestWhileLoop4 {
    public void fourthCand() {
        int a = 0;
        int b = 0;
        while (a < 5) {
            a = a + 1;          //11 34 59
            b = b + a;
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        System.out.println("\tWhile 1 is added to \'a\'");

        int c = 0;
        int d = 0;
        while (c < 5) {
            c = c + 2;          //22 57
            d = d + c;
            System.out.print(c + "" + d + " ");
            c = c + 1;
        }
        System.out.println("\tWhile 2 is added to \'c\'");

        int e = 0;
        int f = 0;
        while (e < 5) {
            e = e + 3;          //33 710
            f = f + e;
            System.out.print(e + "" + f + " ");
            e = e + 1;
        }
        System.out.println("\tWhile 3 is added to \'e\'");

        int g = 0;
        int h = 0;
        while (g < 5) {
            g = g + 4;          //44
            h = h + g;
            System.out.print(g + "" + h + " ");
            g = g + 1;
        }
        System.out.println("\tWhile 4 is added to \'g\'");

        int i = 0;
        int j = 0;
        while (i < 5) {
            i = i + 5;          //55
            j = j + i;
            System.out.print(i + "" + j + " ");
            i = i + 1;
        }
        System.out.println("\tWhile 5 is added to \'i\'");
    }
}
