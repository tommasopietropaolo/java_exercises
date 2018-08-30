package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10.000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10.000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10.000 at 5% interest = " + calculateInterest(10000.0, 5.0));


        // for(init; termination; increment){}
        for (int i = 0; i < 5; i++) {
            System.out.println("loop " + i + " hello");
        }

        //using the for statement, call the calculateInterest method with
        //the amount of 1000 with an interestRate of 2,3,4,5,6,7 and 8
        //and print the result to the console window.

        for (int q = 2; q <= 8; q++) {
            System.out.println("10.000 at " + q + "% interest = " + String.format("%.2f", calculateInterest(10000.0, q)));
        }
        System.out.println("*****************************************");

        //how would you modify the for loop above to do the same thing as
        //shown but to start from 8% and work back to 2%
        for (int q = 8; q >= 2; q--) {
            System.out.println("10.000 at " + q + "% interest = " + String.format("%.2f", calculateInterest(10000.0, q)));
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        int count = 0;
        for (int c = 10; c < 50; c++) {
            if (isPrime(c)) {
                count++;
                System.out.println("number " + c + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    //Create a for statement using any range of numbers
    //determine if the number is a prime number using the isPrime method
    //if it is a prime number, print it out AND increment a count of the
    //number of prime numbers found
    //if that count is 3 exit the for loop
    //hint: use break; statement to exit

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if(n%i == 0){
            return false;
        }}
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

