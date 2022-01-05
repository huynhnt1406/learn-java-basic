package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int luckyNumber = 10;
        int numOfGuessing = 3;
        int guessingNum;
        int timeOfGuessing = 1;
        boolean isAccept = true;
        String namePlayer;
        String method;
        Scanner gamePlay = new Scanner(System.in);
        System.out.println("GUESSING LUCKY NUMBER!");
        System.out.println("Enter your  name");
        namePlayer = gamePlay.nextLine();
        System.out.println("Wellcome you to play this game " + namePlayer);
        System.out.println("Helo " + namePlayer + " . You have three time to "
                + "guess the lucky number");
        System.out.println("Plz accept play the game by typing 'yes' : ");
        method = gamePlay.nextLine();
        switch(method){
            case "yes":
                System.out.println("You accepted");
                break;
            default:
                System.out.println("You disargeed");
                isAccept = false;
                break;
        }
        if(isAccept == true){
                System.out.println("Guessing...");
                guessingNum = gamePlay.nextInt();
                while(timeOfGuessing <= numOfGuessing ) {
                    if (guessingNum == luckyNumber) {
                        System.out.println("You won ^^ !");
                        break;
                    } else {
                        timeOfGuessing++;
                        if(timeOfGuessing <= numOfGuessing){
                            System.out.println("Guessing again...");
                            guessingNum = gamePlay.nextInt();
                        }
                    }
                }
                if(guessingNum != luckyNumber) {
                    System.out.println("You Lose ! Run out of guessing times :))  ");
                    System.out.println("The lucky number is " + luckyNumber + ".");
                    System.out.println("May be next time ^^");
                }
            }
    }
}
