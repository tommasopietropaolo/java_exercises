package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
        System.out.println("the sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("the sum of the digits in number 12 is " + sumDigits(12));
        System.out.println("the sum of the digits in number 690 is " + sumDigits(690));
        System.out.println("the sum of the digits in number 10 is " + sumDigits(10));
    }
    public static int sumDigits(int number){
        if (number< 10){
            return -1;
        }
        int sum=0;
        // 125 -> 125/10 = 12 -> 12*10= 120 -> 125-120=5
        while(number>0){
            int digit=number%10;
            sum +=digit;
            number/=10;


        }


        return sum;

    }
}
