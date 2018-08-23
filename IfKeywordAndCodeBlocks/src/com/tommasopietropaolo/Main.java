package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleated = 5;
        int bonus = 100;


        int scoreEx= 10000;
        int levelCompleatedEx=8;
        int bonusEx = 200;

//        if (score < 5000 && score >1000) {
//            System.out.println("your score was less 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("your score is less than 1000");
//
//        } else {
//            System.out.println("got here");
//        }


        if(gameOver==true ){
            //possiamo scrivere if(gameOver) al posto di == true è la stessa cosa.
            int finalScore = score + (levelCompleated * bonus);
            System.out.println("your final score is " + finalScore);
            int finalScoreEx = scoreEx + (levelCompleatedEx * bonusEx);
            System.out.println("your final score is " + finalScoreEx);
        }
        //you cannot acces outside to the code block to the variable that was createxd inside of that.
        //in this case we cannot access to the variable "finalScore" outside


        //Exercise:
        //Print out a second score on the screen with the following
        //score set 10000
        //level completed set to 8
        //bonus set to 200
        //but make sure the first printout above still displays as well


    }
}
