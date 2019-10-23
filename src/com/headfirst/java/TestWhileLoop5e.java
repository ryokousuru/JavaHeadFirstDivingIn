package com.headfirst.java;

public class TestWhileLoop5e {
    public void fifthCand5(){
        int a = 0;
        int b = 0;
        while(a < 5){
            if(b < 5){
                a = a + 1;
                if(b < 3){
                    a = a - 1;
                }
            }
            b = b + 1;          //11 12 13 34 55
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        System.out.println("\tWhile 1 is added to \'b\'");

        int c = 0;
        int d = 0;
        while (c < 5){
            if (d < 5) {
                c = c + 1;
                if (d < 3){
                    c = c - 1;
                }
            }
            d = d + 2;          //02 14 36 48
            System.out.print(c + "" + d + " ");
            c = c + 1;
        }
        System.out.println("\tWhile 2 is added to \'d\'");

        int e = 0;
        int f = 0;
        while (e < 5){
            if (f < 5){
                e = e + 1;
                if (f < 3){
                    e = e - 1;
                }
            }
            f = f + 3;          //03 26 39 412
            System.out.print(e + "" + f + " ");
            e = e + 1;
        }
        System.out.println("\tWhile 3 is added to \'f\'");

        int g = 0;
        int h = 0;
        while (g < 5){
            if (h < 5){
                g = g + 1;
                if (h < 3){
                    g = g - 1;
                }
            }
            h = h + 4;          //04 28 312 416
            System.out.print(g + "" + h + " ");
            g = g + 1;
        }
        System.out.println("\tWhile 4 is added to \'h\'");

        int i = 0;
        int j = 0;
        while (i < 5){
            if (j < 5){
                i = i + 1;
                if (j < 3){
                    i = i - 1;
                }
            }
            j = j + 5;          //05 110 215 320 425
            System.out.print(i + "" + j + " ");
            i = i + 1;
        }
        System.out.println("\tWhile 5 is added to \'j\'");

        int k = 0;
        int l = 0;
        while (k < 5){
            if (l < 5){
                k = k + 1;
                if (l < 3){
                    k = k - 1;
                }
            }
            l = l + 6;          //06 112 218 324 430
            System.out.print(k + "" + l + " ");
            k = k + 1;
        }
        System.out.println("\tWhile 6 is added to \'l\'");

        int m = 0;
        int n = 0;
        while (m < 5){
            if (n < 5){
                m = m + 1;
                if (n < 3){
                    m = m - 1;
                }
            }
            n = n + 7;          //07 114 221 328 435
            System.out.print(m + "" + n + " ");
            m = m + 1;
        }
        System.out.println("\tWhile 7 is added to \'n\'");

        int o = 0;
        int p = 0;
        while (o < 5){
            if (p < 5){
                o = o + 1;
                if (p < 3){
                    o = o -1;
                }
            }
            p = p + 8;          //08 116 224 332 440
            System.out.print(o + "" + p + " ");
            o = o + 1;
        }
        System.out.println("\tWhile 8 is added to \'p\'");
    }
}
