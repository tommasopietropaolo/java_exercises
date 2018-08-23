package com.company;

public class Main {

    public static void main(String[] args) {
        //primitive types:
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean


        String myString = "this is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more. ";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00a9 2017";
        System.out.println("myString is equal to " + myString);

        String numbString = "2500.55";
        numbString = numbString + "49.95";
        System.out.println("the result is " + numbString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumb = 120.47;
        lastString = lastString + doubleNumb;
        System.out.println("lastString value: " + lastString);
    }
}
