package com.company;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Provide a number to find out its factor: ");
        Scanner sc = new Scanner(System.in);//console
        int factorNumber = sc.nextInt();
        for (int i=2; i<=factorNumber; i++){
            if(factorNumber%i == 0)
                System.out.print(i +"\t");
        }
    }
}
