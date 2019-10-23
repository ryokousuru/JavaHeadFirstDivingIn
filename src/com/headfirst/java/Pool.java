package com.headfirst.java;

public class Pool {

    int a = 0;

    public void jumpIn() {
        while (a < 4){
            System.out.print("a");
            if (a < 1){
                System.out.print(" ");
            }
            System.out.print("n");
            if (a > 1){
                System.out.print(" oyster");
                a = a + 2;
            }
            if (a == 1){
                System.out.print("noys");
            }
            if (a < 1){
                System.out.print("oise");
            }
            System.out.println("");
            a = a + 1;
        }
    }

    public void jumpOnIn(){
            while(a < 8){
                if (a < 2) {
                    System.out.print("jump into");
                }
                if (a == 0) {
                    System.out.print(" ");
                }
                if (a > 2){
                    System.out.print("jump onto");
                }
                if (a > 4){
                    System.out.print(" the airplane");
                }
                if (a == 4){
                    System.out.print(" the trampoline");
                }
                if (a < 1){
                    System.out.print("the pool");
                }
                if (a > 0){
                    System.out.println("");
                }
                a = a + 2;
            }
    }
}
