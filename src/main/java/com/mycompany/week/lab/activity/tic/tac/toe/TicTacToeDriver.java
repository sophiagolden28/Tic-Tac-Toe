/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week.lab.activity.tic.tac.toe;

import java.util.Scanner;

/**
 *
 * @author Sophia Golden
 */
public class TicTacToeDriver {

    //create TTT object
    //Start Game
    //wrap start game in a while loop to call .startGame() again
    //TicTacToe tictactoe = new TicTacToe;
    public static void main(String[] args) {

        //Big while loop to restart the entire process if they want to play again
        while (true) {

            //say hello
            System.out.println("\n-------------------------------------------------------------\nWelcome to Tic Tac Toe! Players 1 & 2 will take turns placing their symbols in spots from 1 to 9.\n");

            //example board:
            System.out.println("Here is how each number corresponds to its place on the board:");
            System.out.println("1" + " | " + "2" + " | " + "3");
            System.out.println("---------");
            System.out.println("4" + " | " + "5" + " | " + "6");
            System.out.println("---------");
            System.out.println("7" + " | " + "8" + " | " + "9");

            //ask for names:
            //make scanner object to take user input
            Scanner userInput = new Scanner(System.in);

            //ask for names so we can create the TTT with the method above
            System.out.println("\nPlayer 1, please enter your name: ");
            String Player1Name = userInput.nextLine();

            System.out.println("\nHello, " + Player1Name + "! You will play as 'X'.\n");

            System.out.println("Player 2, please enter your name: ");
            String Player2Name = userInput.nextLine();

            System.out.println("\nHello, " + Player2Name + "! You will play as 'O'.\n");

            System.out.println("The game is starting....");

            //create game object
            TicTacToe TTT = new TicTacToe(Player1Name, Player2Name);

            //start the game
            TTT.startGame();

            //after it finishes, ask if they want to continue playing
            System.out.println("\nWould you like to play again? (Yes or no)");
            String answer = userInput.nextLine();

            //to track whether they say something valid or not:
            boolean validResponse;

            //if they say yes continue, if they say no break
            if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")) {

                validResponse = true;
                continue;

            } else if ((answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N"))) {

                //say goodbye and break the loop
                validResponse = true;
                System.out.println("\nGoodbye!");
                break;

            } else {

                validResponse = false;

            }

            //if they don't give a valid response stick them in a loop until they do
            while (validResponse == false) {

                //tell them to try again
                System.out.println("\nPlease type yes or no.");
                answer = userInput.nextLine();

                //if they say yes continue, if they say no break
                if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y") || (answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N"))) {

                    //if they answer validly
                    validResponse = true;

                } else {

                    //if they didn't put in a valid response it's still false
                    validResponse = false;

                }

            }

            //after they give a valid answer check what kind of answer it is
            //if they say yes continue, if they say no break
            if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")) {

                continue;

            } else if ((answer.equalsIgnoreCase("No") || answer.equalsIgnoreCase("N"))) {

                //say goodbye and break the loop
                System.out.println("\nGoodbye!");
                break;

            }
        }

    }

}
