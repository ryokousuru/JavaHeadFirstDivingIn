package com.headfirst.java;

public class TestWhileLoop3c {
    public void thirdCand3() {
        int a = 0;
        int b = 0;
        while(a < 5) {
            b = b + 2;
            if(b > 1) {                     //01 12 23 34 45
                b = b - 1;
            }
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        System.out.println("\tWhile \'b\' is greater than 1");

        int c = 0;
        int d = 0;
        while (c < 5) {
            d = d + 2;
            if(d > 2){                      //02 13 24 35 46
                d = d - 1;
            }
            System.out.print(c + "" + d + " ");
            c = c + 1;
        }
        System.out.println("\tWhile \'d\' is greater than 2");

        int e = 0;
        int f = 0;
        while(e < 5){
            f = f + 2;
            if(f > 3){                      //02 13 24 35 46
                f = f - 1;
            }
            System.out.print(e + "" + f + " ");
            e = e + 1;
        }
        System.out.println("\tWhile \'f\' is greater than 3");

        int g = 0;
        int h = 0;
        while(g < 5){
            h = h + 2;
            if(h > 4){                      //02 14 25 36 47
                h = h - 1;
            }
            System.out.print(g + "" + h + " ");
            g = g + 1;
        }
        System.out.println("\tWhile \'h\' is greater than 4");

        int i = 0;
        int j = 0;
        while(i < 5){
            j = j + 2;
            if(j > 5){                      //02 14 25 36 47
                j = j - 1;
            }
            System.out.print(i + "" + j + " ");
            i = i + 1;
        }
        System.out.println("\tWhile \'j\' is greater than 5");

        int k = 0;
        int l = 0;
        while(k < 5){
            l = l + 2;
            if(l > 6){                      //02 14 26 37 48
                l = l -1;
            }
            System.out.print(k + "" + l + " ");
            k = k + 1;
        }
        System.out.println("\tWhile \'l\' is greater than 6");

        int m = 0;
        int n = 0;
        while (m < 5){
            n = n + 2;
            if(n > 7){                      //02 14 26 37 48
                n = n - 1;
            }
            System.out.print(m + "" + n + " ");
            m = m + 1;
        }
        System.out.println("\tWhile \'n\' is greater than 7");

        int o = 0;
        int p = 0;
        while(o < 5){
            p = p + 2;
            if(p > 8){                      //02 14 26 38 49
                p = p - 1;
            }
            System.out.print(o + "" + p + " ");
            o = o + 1;
        }
        System.out.println("\tWhile \'p\' is greater than 8");

    }
}
