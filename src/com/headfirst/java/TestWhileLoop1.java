package com.headfirst.java;
import java.util.Scanner;

public class TestWhileLoop1 {

    public void firstCand1Through8() {
        int a = 0;
        int b = 0;
        while (a < 2) {         //00 11
            b = a - b;
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        System.out.println("\tWhile \'a\' is less than 2");

        int c = 0;
        int d = 0;
        while (c < 3) {         //00 11 21
            d = c - d;
            System.out.print(c + "" + d + " ");
            c = c + 1;
        }
        System.out.println("\tWhile \'c\' is less than 3");

        int e = 0;
        int f = 0;
        while (e < 4) {         //00 11 21 32
            f = e - f;
            System.out.print(e + "" + f + " ");
            e = e + 1;
        }
        System.out.println("\tWhile \'e\' is less than 4");

        int g = 0;
        int h = 0;
        while ( g < 5) {        //00 11 21 32 42
            h = g - h;
            System.out.print(g + "" + h + " ");
            g = g + 1;
        }
        System.out.println("\tWhile \'g\' is less than 5");

        int i = 0;
        int j = 0;
        while (i < 6) {         //00 11 21 32 42 53
            j = i - j;
            System.out.print(i + "" + j + " ");
            i = i + 1;
        }
        System.out.println("\tWhile \'i\' is less than 6");

        int k = 0;
        int l = 0;
        while (k < 7) {         //00 11 21 32 42 53 63
            l = k - l;
            System.out.print(k + "" + l + " ");
            k = k + 1;
        }
        System.out.println("\tWhile \'k\' is less than 7");

        int m = 0;
        int n = 0;
        while (m < 8) {         //00 11 21 32 42 53 63 74
            n = m - n;
            System.out.print(m + "" + n + " ");
            m = m + 1;
        }
        System.out.println("\tWhile \'m\' is less than 8");
    }
        }

