package com.tommasopietropaolo;

public class Main {

    public static void main(String[] args) {

        int highScore = calculatescore(true, 4000, 5, 100);
        System.out.println("your final score is " + highScore);

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;


        highScore = calculatescore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score is " + highScore);

        //Create a method called displayHighScorePosition
        //it should a players name as a parameter, and a 2nd parameter as a a position in the high score table
        //you should display a the players name along with a message like " managed to get into position" and the
        //position they got and further message "on the high score table"
        //
        //Create a second method called calculateHighScorePosition
        //it should be sent one argument only, the player score
        //it should return a int
        //the return data should be
        //1 if the score is > 1000
        //2 if the score is >500 and < 1000
        //3 if the score is >100 and <500
        //4 in all other cases
        //call both methods and display the result of the following
        //a score of 1500, 900, 400, and 50

        int highScorePosition = calculateHighScorePositionint(1500);
        displayHighScorePosition("tommy", highScorePosition);

        highScorePosition = calculateHighScorePositionint(900);
        displayHighScorePosition("timmy", highScorePosition);

        highScorePosition = calculateHighScorePositionint(400);
        displayHighScorePosition("tom", highScorePosition);

        highScorePosition = calculateHighScorePositionint(50);
        displayHighScorePosition("aaa", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int higScorePosition) {
        System.out.println(playerName + " managed to get into position " + higScorePosition + " on the high score table");

    }

    public static int calculateHighScorePositionint(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000 ){
            return 2;
        } else if (playerScore >= 100 && playerScore< 500) {
            return 3;
        }
        else {
            return 4;
        }
    }
    //also we can write :
    //if (playerScore >= 1000) {
    // position=1;}
    // else if (playerScore >= 500){
    // position=2;}
    // else if (playerScore >= 100 && playerScore< 500) {
    // position=3;}
    // return position;


    public static int calculatescore(boolean gameOver, int score, int levelCompleted, int bonus) {
        //if u don't want to  return any value back use the word "void"
        //void means nothing-either-empty-don't return anything

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }


        return -1;


    }


}