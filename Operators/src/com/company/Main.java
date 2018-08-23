package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 =" + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + "  / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result + 1;
        System.out.println("result is now " + result);
        result++;
        System.out.println("result is now " + result);
        result--;
        System.out.println("result is now " + result);

        result +=2;
        System.out.println("result is now " + result);
        result *=10;
        System.out.println("result is now " + result);
        result -=10;
        System.out.println("result is now " + result);
        result /= 10;
        System.out.println("result is now " + result);

        boolean isAlien = false;
        if (isAlien ==false)
            System.out.println("it's not an alien");

        int topScore = 80;
        if (topScore >= 100)
            System.out.println("you got the high score");

        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100)) //&& is "AND"
            System.out.println("Greater than top score and less then 100");

        if ((topScore >90) || (secondTopScore <=90)) // || is "OR"
            System.out.println("One of these tests is true");

        int newValue = 50;
        if( newValue == 50) // for equals you need two = "=="
            System.out.println("this is true");

        boolean isCar = false;
        if(isCar == true) //for boolean only one =
            System.out.println("this isn't supposed to happen");

        isCar = true;
        boolean wasCar= isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal 20 or less.



        double first = 20d;
        double second = 80d;
        double sum = first + second;

        double thirdStep = sum * 25;
        System.out.println("point #3 is " + thirdStep);

        double remainder = sum % 40;
        System.out.println("point #4 is " + remainder);

        if(remainder <=20)
            System.out.println("Total was over the limit");



    }
}
