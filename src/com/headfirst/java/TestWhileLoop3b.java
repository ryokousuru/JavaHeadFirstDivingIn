package com.headfirst.java;

public class TestWhileLoop3b {
    public void thirdCand2() {
        int a = 0;
        int b = 0;
        while (a < 5) {
            b = b + 1;          //01 12 23 34 44
            if(b > 4) {
                b = b - 1;
            }
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        System.out.println("\tWhile 1 is added to \'b\'");

        int c = 0;
        int d = 0;
        while (c < 5) {
            d = d + 2;          //02 14 25 36 47
            if(d > 4) {
                d = d - 1;
            }
            System.out.print(c + "" + d + " ");
            c = c + 1;
        }
        System.out.println("\tWhile 2 is added to \'d\'");

        int e = 0;
        int f = 0;
        while(e < 5) {
            f = f + 3;          //03 15 27 39 411
            if(f > 4) {
                f = f - 1;
            }
            System.out.print(e + "" + f + " ");
            e = e + 1;
        }
        System.out.println("\tWhile 3 is added to \'f\'");

        int g = 0;
        int h = 0;
        while (g < 5) {
            h = h + 4;          //04 17 210 313 416
            if(h > 4) {
                h = h - 1;
            }
            System.out.print(g + "" + h + " ");
            g = g + 1;
        }
        System.out.println("\tWhile 4 is added to \'h\'");

        int i = 0;
        int j = 0;
        while (i < 5) {
            j = j + 5;          //04 18 212 316 420
            if(j > 4) {
                j = j - 1;
            }
            System.out.print(i + "" + j + " ");
            i = i + 1;
        }
        System.out.println("\tWhile 5 is added to \'j\'");

        int k = 0;
        int l = 0;
        while (k < 5) {
            l = l + 6;          //05 110 215 320 425
            if(l > 4) {
                l = l -1 ;
            }
            System.out.print(k + "" + l + " ");
            k = k + 1;
        }
        System.out.println("\tWhile 6 is added to \'l\'");

        int m = 0;
        int n = 0;
        while (m < 5) {
            n = n + 7;          //06 112 218 324 430
            if(n > 4) {
                n = n - 1;
            }
            System.out.print(m + "" + n + " ");
            m = m + 1;
        }
        System.out.println("\tWhile 7 is added to \'n\'");

        int o = 0;
        int p = 0;
        while (o < 5) {
            p = p + 8;          //07 114 221 328 435
            if(p > 4) {
                p = p - 1;
            }
            System.out.print(o + "" + p + " ");
            o = o + 1;
        }
        System.out.println("\tWhile 8 is added to \'p\'");
    }
}
