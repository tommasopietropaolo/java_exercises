package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("tommaso", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
       calcFeetAndInchsToCentimeters(7,-10);
       calcFeetAndInchsToCentimeters(100);

           }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("Unnamed player scored no player score");
    }


    //Create a method called calcFeetAndInchsToCentimeters
    //It needs to have two parameters.
    //feet is the first parameter, inches is the 2nd parameter
    //
    //You should validate that the first parameter feet is >=0
    //You should validate that the 2nd parameter inches is >=0 and <=12
    //return -1 from the method if either of the above is not true
    //
    //If the parameters are valid, then calculate how many centimetres
    //comprise the feet and inches passed to this method and return that value.
    //
    //Create a 2nd method of the same name but with only one parameter
    //inches is the parameter
    //validate that its >=0
    //return -1 if it is not true
    //but if its valid, then calculate how many feet are in the inches
    //and then here is the tricky part
    //call the other overloaded method passing the correct feet and inches
    //calculated so that it can calculate correctly.
    //hints:use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm and one foot = 12inch
    //
    public static double calcFeetAndInchsToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid parameter");
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches*2.54;
            System.out.println(feet + " feet, "+ inches + " inchese = " + centimeters +"cm");
            return centimeters;
        }
    }
    public static double calcFeetAndInchsToCentimeters(double inches) {
        if (inches < 0 ) {
            return -1;
        } else {
            double feet = (int)inches/12;
            double remainingInches = (int) inches%12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchsToCentimeters(feet, remainingInches);
        }

}
}

