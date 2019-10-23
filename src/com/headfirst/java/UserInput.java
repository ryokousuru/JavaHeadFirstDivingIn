package com.headfirst.java;

import java.util.Scanner;
import java.lang.String;

public class UserInput {
    public void inputNumber() {
    int number;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a number, would you please? :");
    number = in.nextInt();

    System.out.println("The number is " + number);

    char zee;
    Scanner it = new Scanner(System.in);

    System.out.println("Enter a single character : ");
    zee = it.next().charAt(0);

    System.out.println("So that character is : " + zee);

    float rootbeer;
    Scanner slurp = new Scanner(System.in);

    System.out.println("A floating point number, please : ");
    rootbeer = slurp.nextFloat();

    System.out.println("The floating point number is : " + rootbeer);

    String sentence;
    Scanner st = new Scanner(System.in);

    System.out.println("Enter some kind of a string : ");
    sentence = st.nextLine();

    System.out.println("The string is : " + sentence);

    }
}
