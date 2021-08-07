package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int startPosition = 0;                           // initialize startPosition to zero
        int diceroll = (int) (Math.floor(Math.random() * 6) + 1);
        System.out.println("WELCOME TO SNAKE AND LADDER GAME");
        System.out.println("Diceroll You Got: " + diceroll);

          //constants for option
        int noPlay = 0;
        int ladder = 1;
        int snake = 2;
        int newPositionofPlayer = 0;

        int optionCheck = (int) (Math.floor(Math.random() * 10) % 3);

        switch (optionCheck) {
            case 0:
                System.out.println("No PLAY");
                newPositionofPlayer = 0;
                break;
            case 1:
                System.out.println("The Player got Ladder and moves ahead by the no of Position:" + diceroll);
                newPositionofPlayer = startPosition + diceroll;
                break;
            case 2:
                System.out.println("The Player got Snake and moves behind by the no of Position: " + diceroll);
                newPositionofPlayer = startPosition + diceroll;
                System.out.println("Player position: " + newPositionofPlayer);
                break;
        }
    }
}



