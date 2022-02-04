package com.company;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        System.out.println("Enter Dividend :");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        System.out.println("Enter Divisor :");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
