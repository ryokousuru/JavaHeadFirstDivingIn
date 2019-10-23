package com.headfirst.java;

public class TestWhileLoop5d {
    public void fifthCand4() {
        int a = 0;
        int b = 0;
        while (a < 5){
            if (b < 5){
                a = a + 1;
                if (b < 3){
                    a = a - 1;                  //02 14 36 48
                }
            }
            b = b + 2;
            System.out.print(a + "" + b + " ");
            a = a + 1;
        }
        System.out.println("\tWhile 1 is subtracted from \'a\'");

        int c = 0;
        int d = 0;
        while (c < 5){
            if (d < 5){
                c = c + 1;
                if (d < 3){
                    c = c - 2;                  //-12 -14 16 28 310 412
                }
            }
            d = d + 2;
            System.out.print(c + "" + d + " ");
            c = c + 1;
        }
        System.out.println("\tWhile 2 is subtracted from \'c\'");

        int e = 0;
        int f = 0;
        while (e < 5){
            if (f < 5){
                e = e + 1;
                if (f < 3){
                    e = e - 3;                  //-22 -34 -16 08 110 212 314 416
                }
            }
            f = f + 2;
            System.out.print(e + "" + f + " ");
            e = e + 1;
        }
        System.out.println("\tWhile 3 is subtracted from \'e\'");

        int g = 0;
        int h = 0;
        while (g < 5){
            if (h < 5){
                g = g + 1;
                if (h < 3){
                    g = g - 4;              //-32 -54 -36 -28 -110 012 114 216 318 420
                }
            }
            h = h + 2;
            System.out.print(g + "" + h + " ");
            g = g + 1;
        }
        System.out.println("\tWhile 4 is subtracted from \'g\'");

        int i = 0;
        int j = 0;
        while (i < 5){
            if (j < 5){
                i = i + 1;
                if (j < 3){
                    i = i - 5;              //-42 -74 -56 -48 -310 -212 -114 016 118 220 322 424
                }
            }
            j = j + 2;
            System.out.print(i + "" + j + " ");
            i = i + 1;
        }
        System.out.println("\tWhile 5 is subtracted from \'i\'");

        int k = 0;
        int l = 0;
        while (k < 5){
            if (l < 5){
                k = k + 1;
                if (l < 3){
                    k = k - 6;              //-52 -94 -76 -68 -510 -412 -314 -216 -118 020 122 224 326 428
                }
            }
            l = l + 2;
            System.out.print(k + "" + l + " ");
            k = k + 1;
        }
        System.out.println("\tWhile 6 is subtracted from \'k\'");

        int m = 0;
        int n = 0;
        while (m < 5){
            if (n < 5){
                m = m + 1;
                if (n < 3){
                    m = m - 7;              //-62 -114 -96 -88 -710 -612 -514 -416 -318 -220 -122 024 126 228 330 432
                }
            }
            n = n + 2;
            System.out.print(m + "" + n + " ");
            m = m + 1;
        }
        System.out.println("\tWhile 7 is subtracted from \'m\'");

        int o = 0;
        int p = 0;
        while (o < 5){
            if (p < 5){
                o = o + 1;
                if (p < 3){
                    o = o - 8;      //-72 -134 -116 -108 -910 -812 -714 -616 -518 -420 -322 -224 -126 028 130 232 334 436
                }
            }
            p = p + 2;
            System.out.print(o + "" + p + " ");
            o = o + 1;
        }
        System.out.println("\tWhile 8 is subtracted from \'o\'");
    }
}
