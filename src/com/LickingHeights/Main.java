package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int pickedNumber;
        pickedNumber = (int) (Math.random() * 100);

        int guessedNumber;
        guessedNumber = keyboard.nextInt();

       


    }

    public static void printNumberHigh(){System.out.println("You guessed too high, try again.");}

    public static void printNumberLow (){System.out.println("You guessed too low, try again.");}
}

