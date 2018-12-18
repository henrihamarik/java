package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompeted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//
//        }
//        else {
//            System.out.println("Got here");
//        }

        if (gameOver) {

            int finalScore = score + (levelCompeted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

//        boolean secondLevelGameOver = true;
//        int secondScore = 10000;
//        int secondLevelBonus = 8;
//        int secondBonus = 200;
//
//        if (secondLevelGameOver) {
//            int finalScore = secondScore + (secondLevelBonus * secondBonus);
//            System.out.println("Your level 2 final score was " + finalScore);
//        }
        score = 10000;
        levelCompeted = 8;
        bonus = 200;

        if (gameOver) {

            int finalScore = score + (levelCompeted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
