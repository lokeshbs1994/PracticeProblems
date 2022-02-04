package com.company;

import java.util.Scanner;

//4. Harmonic Number
//a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//b. I/P -> The Harmonic Value N. Ensure N != 0
//c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//d. O/P -> Print the Nth Harmonic Value.
public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Give a number: ");
        Scanner sc = new Scanner(System.in);//console
        int count = sc.nextInt();
        double harmonicSum=0.0;
        for (int i=1; i<=count;i++){
            if(i<count)
                System.out.print("1/"+ i +" + ");
            else
                System.out.println("1/"+ i );
            harmonicSum+=1f/i;
        }
        System.out.println("Haronic number of "+count+" is: "+harmonicSum);
    }
}
