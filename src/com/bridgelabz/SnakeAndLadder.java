package com.bridgelabz;

import java.util.Scanner;

public class SnakeAndLadder {

    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Name of First Player : ");          // get the name for first player
        String firstPlayerName = scanner.next();
        System.out.print("Enter The Name of Second Player : ");         // get the name for second player
        String secondPlayerName = scanner.next();
        scanner.close();
        int firstPlayerPosition = 0;
        int secondPlayerPosition = 0;

        while (firstPlayerPosition <= WINNING_POSITION && secondPlayerPosition <= WINNING_POSITION) {
            if (firstPlayerPosition == WINNING_POSITION) {
                System.out.println(firstPlayerName + " Won The Game");
                break;
            } else if (secondPlayerPosition == WINNING_POSITION) {
                System.out.println(secondPlayerName + " Won The Game");
                break;
            } else {
                firstPlayerPosition = getFirstPlayer(firstPlayerPosition, firstPlayerName);
                secondPlayerPosition = getSecondPlayer(secondPlayerPosition, secondPlayerName);
            }
        }
    }


    private static int getFirstPlayer(int firstPlayerPosition, String firstPlayerName) {

        //constants for option
        int noPlay = 0;
        int ladder = 1;
        int snake = 2;
        int PLAYER_POSITION = 0;

        int diceroll = (int) (Math.random() * 6 + 1);   // For Generating random 1 to 6 Number
        int forWinGame = PLAYER_POSITION - firstPlayerPosition;
        System.out.println("Diceroll You Got: " + diceroll);
        int optionCheck = (int) (Math.random() * 3);    // To check for options
        if (forWinGame >= diceroll)
            // Condition checking
            switch (optionCheck) {
                case 0:
                    break;
                case 1:
                    firstPlayerPosition += diceroll;
                    if (firstPlayerPosition == WINNING_POSITION)
                        break;
                    else
                        getFirstPlayer(firstPlayerPosition, firstPlayerName);
                    break;
                default:
                    firstPlayerPosition -= diceroll;
                    if (firstPlayerPosition < 0)
                        firstPlayerPosition = 0;
            }
        System.out.println(firstPlayerName + "'s Position is: " + firstPlayerPosition);
        return firstPlayerPosition;
    }


    private static int getSecondPlayer(int secondPlayerPosition, String secondPlayerName) {
        int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int needToWin = WINNING_POSITION - secondPlayerPosition;
        int checkOption  = (int) (Math.floor(Math.random() * 10) % 3);
        if (needToWin >= dieRoll) {
            switch (checkOption ) {
                case 0:
                    break;
                case 1:
                    secondPlayerPosition += dieRoll;
                    if (secondPlayerPosition == WINNING_POSITION)
                        break;
                    else
                        getSecondPlayer(secondPlayerPosition, secondPlayerName);
                    break;
                default:
                    secondPlayerPosition -= dieRoll;
                    if (secondPlayerPosition < 0)
                        secondPlayerPosition = 0;
            }
        }
        System.out.println(secondPlayerName + "'s Position is: " + secondPlayerPosition);
        return secondPlayerPosition;
    }
}





















