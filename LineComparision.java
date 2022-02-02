package com.company;

public class LineComparision {

    public static void main(String[] args) {
        String a = "Hi I AM Lokesh";
        //String a = "Hi I AM";// To get Equal
        String a1 = "Hi I AM";
        //if(a1.equalsIgnoreCase(a.trim())){  // trim() ignores space
        if (a1.equalsIgnoreCase(a)) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
