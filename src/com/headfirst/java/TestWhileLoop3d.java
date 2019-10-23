package com.headfirst.java;

public class TestWhileLoop3d {
    public void thirdCand4() {
        int a = 0;
        int b = 0;
        while (a < 5) {
            b = b + 2;
            if(b > 4) {
                b = b - 1;           //02 14 25 36 47
            }
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        System.out.println("\tWhile 1 is subtracted from \'b\'");

        int c = 0;
        int d = 0;
        while(c < 5) {
            d = d + 2;
            if(d > 4) {
                d = d - 2;          //02 14 24 34 44
            }
            System.out.print(c + "" + d + " ");
            c = c + 1;
        }
        System.out.println("\tWhile 2 is subtracted from \'d\'");

        int e = 0;
        int f = 0;
        while(e < 5) {
            f = f + 2;
            if(f > 4) {
                f = f - 3;          //02 14 23 32 44
            }
            System.out.print(e + "" + f + " ");
            e = e + 1;
        }
        System.out.println("\tWhile 3 is subtracted from \'f\'");

        int g = 0;
        int h = 0;
        while(g < 5) {
            h = h + 2;
            if(h > 4) {
                h = h - 4;          //02 14 22 34 42
            }
            System.out.print(g + "" + h + " ");
            g = g + 1;
        }
        System.out.println("\tWhile 4 is subtracted from \'h\'");

        int i = 0;
        int j = 0;
        while(i < 5) {
            j = j + 2;
            if(j > 4) {
                j = j - 5;          //02 14 21 33 40
            }
            System.out.print(i + "" + j + " ");
            i = i + 1;
        }
        System.out.println("\tWhile 5 is subtracted from \'j\'");

        int k = 0;
        int l = 0;
        while (k < 5) {
            l = l + 2;
            if(l > 4) {
               l = l - 6;          //02 14 20 32 44
            }
            System.out.print(k + "" + l + " ");
            k = k + 1;
        }
        System.out.println("\tWhile 6 is subtracted from \'l\'");

        int m = 0;
        int n= 0;
        while(m < 5) {
            n = n + 2;
            if(n > 4) {
                n = n - 7;          //02 14 2-1 31 43
            }
            System.out.print(m + "" + n + " ");
            m = m + 1;
        }
        System.out.println("\tWhile 7 is subtracted from \'n\'");

        int o = 0;
        int p = 0;
        while(o < 5) {
            p = p + 2;
            if(p > 4) {
                p = p - 8;          //02 14 2-2 30 42

            }
            System.out.print(o + "" + p + " ");
            o = o + 1;
        }
        System.out.println("\tWhile 8 is subtracted from \'p\'");
    }
}
