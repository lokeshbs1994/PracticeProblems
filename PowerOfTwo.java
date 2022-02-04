package com.company;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Write a number : ");
        Scanner sc = new Scanner(System.in);//console
        int N = sc.nextInt();
        int pwr=1;
        for (int i=1; i<=N; i++){
            pwr*=2;
        }
        System.out.println("2^"+N+" is "+pwr);
    }
}
