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
public class TicTacToe {

    //initialize objects
    Player Player1;
    Player Player2;
    int boardSize = 3;
    Board board;
    Player currentPlayer;

    //constructor - we read in 2 strings that we use for the names. 
    //this way we can ask for names in a separate part of the program then make a game object.
    //LATER ON, WE CAN MODIFY THIS to have a parameter to set the boardSize but for now we're not.
    public TicTacToe(String Player1Name, String Player2Name) {

        //create player 1
        Player1 = new Player(Player1Name, "X");

        //create player 2
        Player2 = new Player(Player2Name, "O");

        //create Board
        board = new Board(3);

        //create current player variable
        currentPlayer = new Player("N/A", "N/A");

        //setting the beginning player's default to player 1 (X)
        currentPlayer = Player1;

    }

    //switch player method - if current player is 1, it goes to 2 and vice versa
    public void switchPlayer() {

        //main conditional
        if (currentPlayer == Player1) {

            currentPlayer = Player2;

        } else {

            currentPlayer = Player1;

        }

    }

    //makeMove is going to have to call the board makeMove function and then check for a winner
    public void makeMove(int position) {

        //make the move using the inputted row and column, and the current player's symbol
        //we have this big conditional to say where to move to based on the input 
        if (position == 1) {

            //if we can we make the move
            if (board.makeMove(0, 0, currentPlayer.getSymbol()) == true) {

                board.makeMove(0, 0, currentPlayer.getSymbol());

                //if there's no winner after we check, we switch players
                if (board.checkWinner(currentPlayer.getSymbol()) == false) {

                    //switch player in here so we don't switch if they entered a taken space
                    this.switchPlayer();

                }

            } else {

                //if the spot is taken, tell the user
                System.out.println("\nThat spot is already taken.");

            }

        } else if (position == 2) {

            //if we can we make the move
            if (board.makeMove(0, 1, currentPlayer.getSymbol()) == true) {

                board.makeMove(0, 1, currentPlayer.getSymbol());

                //if there's no winner after we check, we switch players
                if (board.checkWinner(currentPlayer.getSymbol()) == false) {

                    //switch player in here so we don't switch if they entered a taken space
                    this.switchPlayer();

                }

            } else {

                //if the spot is taken, tell the user
                System.out.println("\nThat spot is already taken.");

            }

        } else if (position == 3) {

            //if we can we make the move
            if (board.makeMove(0, 2, currentPlayer.getSymbol()) == true) {

                board.makeMove(0, 2, currentPlayer.getSymbol());

                //if there's no winner after we check, we switch players
                if (board.checkWinner(currentPlayer.getSymbol()) == false) {

                    //switch player in here so we don't switch if they entered a taken space
                    this.switchPlayer();

                }

            } else {

                //if the spot is taken, tell the user
                System.out.println("\nThat spot is already taken.");

            }

        } else if (position == 4) {

            //if we can we make the move
            if (board.makeMove(1, 0, currentPlayer.getSymbol()) == true) {

                board.makeMove(1, 0, currentPlayer.getSymbol());

                //if there's no winner after we check, we switch players
                if (board.checkWinner(currentPlayer.getSymbol()) == false) {

                    //switch player in here so we don't switch if they entered a taken space
                    this.switchPlayer();

                }

            } else {

                //if the spot is taken, tell the user
                System.out.println("\nThat spot is already taken.");

            }

        } else if (position == 5) {

            //if we can we make the move
            if (board.makeMove(1, 1, currentPlayer.getSymbol()) == true) {

                board.makeMove(1, 1, currentPlayer.getSymbol());

                //if there's no winner after we check, we switch players
                if (board.checkWinner(currentPlayer.getSymbol()) == false) {

                    //switch player in here so we don't switch if they entered a taken space
                    this.switchPlayer();

                }

            } else {

                //if the spot is taken, tell the user
                System.out.println("\nThat spot is already taken.");

            }

        } else if (position == 6) {

            //if we can we make the move
            if (board.makeMove(1, 2, currentPlayer.getSymbol()) == true) {

                board.makeMove(1, 2, currentPlayer.getSymbol());

                //if there's no winner after we check, we switch players
                if (board.checkWinner(currentPlayer.getSymbol()) == false) {

                    //switch player in here so we don't switch if they entered a taken space
                    this.switchPlayer();

                }

            } else {

                //if the spot is taken, tell the user
                System.out.println("\nThat spot is already taken.");

            }

        } else if (position == 7) {

            //if we can we make the move
            if (board.makeMove(2, 0, currentPlayer.getSymbol()) == true) {

                board.makeMove(2, 0, currentPlayer.getSymbol());

                //if there's no winner after we check, we switch players
                if (board.checkWinner(currentPlayer.getSymbol()) == false) {

                    //switch player in here so we don't switch if they entered a taken space
                    this.switchPlayer();

                }

            } else {

                //if the spot is taken, tell the user
                System.out.println("\nThat spot is already taken.");

            }

        } else if (position == 8) {

            //if we can we make the move
            if (board.makeMove(2, 1, currentPlayer.getSymbol()) == true) {

                board.makeMove(2, 1, currentPlayer.getSymbol());

                //if there's no winner after we check, we switch players
                if (board.checkWinner(currentPlayer.getSymbol()) == false) {

                    //switch player in here so we don't switch if they entered a taken space
                    this.switchPlayer();

                }

            } else {

                //if the spot is taken, tell the user
                System.out.println("\nThat spot is already taken.");

            }

        } else if (position == 9) {

            //if we can we make the move
            if (board.makeMove(2, 2, currentPlayer.getSymbol()) == true) {

                board.makeMove(2, 2, currentPlayer.getSymbol());

                //if there's no winner after we check, we switch players
                if (board.checkWinner(currentPlayer.getSymbol()) == false) {

                    //switch player in here so we don't switch if they entered a taken space
                    this.switchPlayer();

                }

            } else {

                //if the spot is taken, tell the user
                System.out.println("\nThat spot is already taken.");

            }

        }

        //display the board
        System.out.println("");
        board.display();

        //check for a win
        board.checkWinner(currentPlayer.getSymbol());

    }

    //start game method - the big one that goes till there's a winner or a draw
    public void startGame() {

        //we could technically put something in here to start a new game, but instead
        //i'll use this method and put that in a large while loop in the driver
        //print the initial board 
        System.out.println("");
        board.display();

        //main game loop
        while (true) {

            //make scanner object
            Scanner userInput = new Scanner(System.in);

            //then ask the current player where to move to
            System.out.println("");
            System.out.println(currentPlayer.getName() + ", where would you like to move? (Please enter a number between 1 and 9)");

            //read it in as an integer to keep track of where is where
            int position = userInput.nextInt();

            //if they entered an invalid input to move to
            if (position > 9 || position < 1) {

                //put them in a while loop until they give a valid input
                while (position > 9 || position < 1) {

                    //tell them no
                    System.out.println("\nThat answer is invalid.\n");

                    //then ask the current player where to move to
                    System.out.println(currentPlayer.getName() + ", where would you like to move? (Please enter a number between 1 and 9)");

                    //read it in as an integer to keep track of where is where
                    position = userInput.nextInt();

                }

            }

            this.makeMove(position);

            //check for a winner
            if (board.checkWinner(currentPlayer.getSymbol()) == true) {

                //congratulate them
                System.out.println("\nThere is a winner! Congratulations, " + currentPlayer.getName() + "!");

                break;

            }

            if (board.isFull(boardSize) == true) {

                //if the board is full, tell the user and return true so we can catch it later
                System.out.println("\nThe game is a tie.");

                break;

            }

        }

    }

}
