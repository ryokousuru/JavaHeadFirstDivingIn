package com.headfirst.java;
/*
* Patterned after example on pages 16 & 17
* program chooses 3 random words from each
* array and adds them to the sentence
* */
public class Random {

    //make three sets of words to choose from.  Page 17

    //first array
    String[] wordList1 = {"24/7", "multi-Tier", "とても長いの", "40,000 meter",
            "B-to-B", "win-win", "lose-lose", "front-end", "top-down", "web-based",
            "pervasive", "smart", "somewhat knowledgeable", "critcal-path", "dynamic"};

    //second array
    String[] wordList2 = {"empowered", "sticky", "value-added", "oriental",
            "一般的に", "centrally", "distributive", "clustered", "branded",
            "inside-the-loop", "positional", "networking", "focused", "leverage",
            "aligned", "targeting", "sharing", "cooperation", "accelerate"};

    //third array
    String[] wordlist3 = {"processes", "tipping-point", "solution", "そんなに良くない",
            "architects", "core competency", "strategic", "mindshare", "portal",
            "outer space", "visionary", "paradigm", "mission", "two-toed"};

    //find out how many words are in each list
    int oneLength = wordList1.length;
    int twoLength = wordList2.length;
    int threeLength = wordlist3.length;
    int sum = oneLength + twoLength + threeLength;

    public void Length() {
        System.out.println("The first array has " + this.oneLength + " words.\n");
        System.out.println("The next array has " + this.twoLength + " words.\n");
        System.out.println("The last array has " + this.threeLength + " words.\n");
    }
    public void TotalLength() {
        System.out.println("All three arrays together have a total of " + sum + " words.\n");

    }

    //generate three random numbers
    int r1 = (int) (Math.random() * oneLength);
    int r2 = (int) (Math.random() * twoLength);
    int r3 = (int) (Math.random() * threeLength);
    //now to build a phrase
    String furezu = wordList1[r1] + " " + wordList2[r2] + " " + wordlist3[r3];
//printing the newly made phrase
    public void Display() {
        System.out.println("What we need is a " + furezu);
    }
}
