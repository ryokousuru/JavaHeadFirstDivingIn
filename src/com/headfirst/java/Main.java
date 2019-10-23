package com.headfirst.java;

public class Main {

    public static void main(String[] args) {

        /*
        * A modification of the "Phrase-o-matic"
        * on pages 16 & 17; a program that picks
        * random words from three different arrays.
        * */

        //randomExample();

        /*Experimenting with changing around the variables
        * for the "Mixed Messages" exercise on page 23
        * */

        //whileLoopExample1();
        //whileLoopExample2();
        //whileLoopExample3a();
        //whileLoopExample3b();
        //whileLoopExample3c();
        //whileLoopExample3d();
        //whileLoopExample4();
        //whileLoopExample5a();
        //whileLoopExample5b();
        //whileLoopExample5c();
        //whileLoopExample5d();
        //whileLoopExample5e();

        /*
        * magnetExample is about the same as the "Code Magnets" example
        * on page 20; magnetNewExample is a variation of it.
        * */

        //magnetExample();
        //magnetNewExample();

        /*
        * poolExample is the same as the  "Pool Puzzle Exercise
         * on page 24; poolNewExample is patterned after it
        * */

        //poolExample();
        poolNewExample();


        /*
        * illustrating how to get user input
        * for various date types
        * */

        //userInputExample();
    }

    public static void randomExample() {
        Random rn = new Random();
        rn.Length();
        rn.TotalLength();
        rn.Display();
    }

    public static void whileLoopExample1() {
        TestWhileLoop1 tw = new TestWhileLoop1();
        tw.firstCand1Through8();
    }

    public static void whileLoopExample2() {
        TestWhileLoop2 te = new TestWhileLoop2();
        te.secondCand1Through8();
    }

    public static void whileLoopExample3a() {
        TestWhileLoop3a ts = new TestWhileLoop3a();
        ts.thirdCand1();
    }

    public static void whileLoopExample3b() {
        TestWhileLoop3b tt = new TestWhileLoop3b();
        tt.thirdCand2();
    }

    public static void userInputExample() {
        UserInput ts = new UserInput();
        ts.inputNumber();
    }

    public static void whileLoopExample3c() {
        TestWhileLoop3c th = new TestWhileLoop3c();
        th.thirdCand3();
    }

    public static void whileLoopExample3d() {
        TestWhileLoop3d ti = new TestWhileLoop3d();
        ti.thirdCand4();
    }

    public static void whileLoopExample4() {
        TestWhileLoop4 t4 = new TestWhileLoop4();
        t4.fourthCand();
    }

    public static void whileLoopExample5a() {
        TestWhileLoop5a t5a = new TestWhileLoop5a();
        t5a.fifthCand1();
    }

    public static void whileLoopExample5b() {
        TestWhileLoop5b t5b = new TestWhileLoop5b();
        t5b.fifthCand2();
    }

    public static void whileLoopExample5c() {
        TestWhileLoop5c t5c = new TestWhileLoop5c();
        t5c.fifthCand3();
    }

    public static void whileLoopExample5d() {
        TestWhileLoop5d t5d = new TestWhileLoop5d();
        t5d.fifthCand4();
    }

    public static void whileLoopExample5e() {
        TestWhileLoop5e t5e = new TestWhileLoop5e();
        t5e.fifthCand5();
    }
    public static void magnetExample() {
        Magnets mg = new Magnets();
        mg.magnetize();
    }
    public static void magnetNewExample(){
        Magnets mn = new Magnets();
        mn.magnetizeAgain();
    }
    public static void poolExample(){
        Pool pool = new Pool();
        pool.jumpIn();
    }
    public static void poolNewExample(){
        Pool pool2 = new Pool();
        pool2.jumpOnIn();
    }
}
