package com.headfirst.java;

public class TestWhileLoop5a {
    public void fifthCand1() {
        int a = 0;
        int b = 0;
        while (a < 5) {         //02 14 26 38 410
            if(b < 1){
                a = a + 1;
                if(b < 3){
                    a = a - 1;
                }
            }
            b = b + 2;
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        System.out.println("\tWhile \'b\' is less than 1");

        int c = 0;
        int d = 0;
        while (c < 5) {
            if(d < 2){          //02 14 26 38 410
                c = c + 1;
                if(d < 3){
                    c = c - 1;
                }
            }
            d = d + 2;
            System.out.print(c + "" + d + " ");
            c = c + 1;
        }
        System.out.println("\tWhile \'d\' is less than 2");

        int e = 0;
        int f = 0;
        while (e < 5) {
            if(f < 3){          //00 10 20 30 40
                e = e + 1;
                if(f < 3){
                    e = e - 1;
                }
            }
            System.out.print(e + "" + f + " ");
            e = e + 1;
        }
        System.out.println("\tWhile \'f\' is less than 3");

        int g = 0;
        int h = 0;
        while(g < 5) {
            if(h < 4) {         //00 10 20 30 40
                g = g + 1;
                if(h < 3){
                    g = g - 1;
                }
            }
            System.out.print(g + "" + h + " ");
            g = g + 1;
        }
        System.out.println("\tWhile \'h\' is less than 4");

        int i = 0;
        int j = 0;
        while(i < 5){
            if(j < 5){          //02 14 36 48
                i = i + 1;
                if(j < 3){
                    i = i - 1;
                }
            }
            j = j + 2;
            System.out.print(i + "" + j + " ");
            i = i + 1;
        }
        System.out.println("\tWhile \'j\' is less than 5");

        int k = 0;
        int l = 0;
        while (k < 5){
            if(l < 6) {         //02 14 36 48
                k = k + 1;
                if (l < 3) {
                    k = k - 1;
                }
            }
            l = l + 2;
            System.out.print(k + "" + l + " ");
            k = k + 1;
        }
        System.out.println("\tWhile \'l\' is less than 6");

        int m = 0;
        int n = 0;
        while (m < 5){
            if(n < 7){          //02 14 36 58
                m = m + 1;
                if(n < 3){
                    m = m - 1;
                }
            }
            n = n + 2;
            System.out.print(m + "" + n + " " );
            m = m + 1;
        }
        System.out.println("\tWhile \'n\' is less than 7");

        int o = 0;
        int p = 0;
        while(o < 5){
            if(p < 8){         //02 14 36 58
                o = o + 1;
                if(p < 3) {
                    o = o - 1;
                }
            }
            p = p + 2;
            System.out.print(o + "" + p + " ");
            o = o + 1;
        }
        System.out.println("\tWhile \'p\' is less than 8");
    }
}
