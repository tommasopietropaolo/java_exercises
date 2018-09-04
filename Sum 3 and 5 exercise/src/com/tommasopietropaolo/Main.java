package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
        int count= 0;
        int sum=0;
	for (int i=1; i<=1000; i++){

	    int remainingA=i%3;
	    int remainingB=i%5;
	    if (remainingA==0 && remainingB==0){
	        count++;
            sum+=i;
            System.out.println("Found number = " +i);
            if (count==5){
                System.out.println("the sum is " + sum);
                break;

            }

        }
    }
    }
}
