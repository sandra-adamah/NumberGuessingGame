package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int pickedNumber;
        pickedNumber = (int)(Math.random()*100);
        System.out.println(pickedNumber);

        int guessedNumber;
        guessedNumber = keyboard.nextInt();





    }

    public static String printNumberHigh(){System.out.println("You guessed too high");}
