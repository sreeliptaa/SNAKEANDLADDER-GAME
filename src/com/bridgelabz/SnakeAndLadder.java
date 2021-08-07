package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int startPosition = 0;                           // initialize startPosition to zero
        int diceroll = (int)(Math.floor(Math.random() * 6) +1);
        System.out.println("WELCOME TO SNAKE AND LADDER GAME");
        System.out.println("Diceroll You Got: " + diceroll);

    }
}
