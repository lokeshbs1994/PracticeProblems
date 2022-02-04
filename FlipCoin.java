package com.company;

import java.util.Scanner;

//1. Flip Coin and print percentage of Heads and Tails
//a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
//c. O/P -> Percentage of Head vs Tails
public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Give a number: ");
        Scanner sc = new Scanner(System.in);//console
        int headCount = 0;
        int tailCount = 0;
        int count = sc.nextInt();//5
        for (int i = 0; i < count; i++) {//6
            double random = Math.random(); //0 to
            if (random < 0.5)
                tailCount++;
            else
                headCount++;
        }
        //  System.out.println(11f/2);//5.5
        System.out.println("percentage of tails("+ tailCount +"):"+(tailCount*100f/(headCount+tailCount)));
        System.out.println("percentage of tails("+ headCount +"):"+(headCount*100f/(headCount+tailCount)));
    }
}
