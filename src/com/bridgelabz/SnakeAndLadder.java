package com.bridgelabz;

public class SnakeAndLadder {

    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        int PLAYER_POSITION = 0;
        int diceroll_counter = 0;
        System.out.println("WELCOME TO SNAKE AND LADDER GAME");

        //constants for option
        int noPlay = 0;
        int ladder = 1;
        int snake = 2;


        while (PLAYER_POSITION < WINNING_POSITION) {
            int diceroll = (int) (Math.random() * 6 + 1);   // For Generating random 1 to 6 Number
            diceroll_counter++;
            int forWinGame = PLAYER_POSITION - diceroll;
            System.out.println("Diceroll You Got: " + diceroll);
            int optionCheck = (int) (Math.random() * 3);    // To check for options
            if (forWinGame >= diceroll)
                // Condition checking
                switch (optionCheck) {
                    case 0:
                        System.out.println("No Play "); // PLAYER_POSITION IS 0
                        break;
                    case 1:
                        System.out.println("You got Ladder");
                        PLAYER_POSITION += diceroll;
                        break;
                    case 2:
                        System.out.println("You got Snake");
                        PLAYER_POSITION -= diceroll;

                        if (PLAYER_POSITION < 0) {
                            System.out.println("You have to start from Zero ");
                            PLAYER_POSITION = 0;
                        }
                        break;
                }

        }
        System.out.println("Your position is :" + PLAYER_POSITION);
        System.out.println("You win the game ");
        System.out.println("Dice rolled " + diceroll_counter + " times.");

    }
}



