/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week.lab.activity.tic.tac.toe;

import java.util.Arrays;

/**
 *
 * @author Sophia Golden
 */
public class Board {

    //array
    String[][] grid;

    //constructor (FOR NOW, WHEN INITIALIZING, SIZE IS ALWAYS 3)
    public Board(int SIZE) {

        //initialize grid
        this.grid = new String[SIZE][SIZE];

        //fill it with spaces:
        //outer loop, rows
        for (int i = 0; i < SIZE; i++) {

            //inner loop, columns
            for (int j = 0; j < SIZE; j++) {

                //make each column of each array a space
                this.grid[i][j] = " ";

            }

        }

    }

    //makeMove method - returns a boolean
    public boolean makeMove(int row, int col, String symbol) {

        //if the spot is empty
        if (grid[row][col].equals(" ")) {

            //we put the symbol there
            grid[row][col] = symbol;

            //and return true
            return true;

        } else {

            //and return false
            return false;

        }

    }

    //isFull method - checks to see if the board is full
    public boolean isFull(int SIZE) {

        //outer loop, rows
        for (int i = 0; i < SIZE; i++) {

            //inner loop, columns
            for (int j = 0; j < SIZE; j++) {

                //if there is a spot that is empty, the board is not full
                if (" ".equals(grid[i][j])) {

                    return false;

                }

            }

        }

        return true;

    }

    //checkWinner method - checks to see if a particular player has won the game, or if the board is full (a tie)
    public boolean checkWinner(String symbol) {

        //if win conditions are met (win conditions IN THE IF) ONLY WORKS WITH 3x3
        if (((grid[0][0].equals(symbol) && grid[0][1].equals(symbol) && grid[0][2].equals(symbol)) || (grid[1][0].equals(symbol) && grid[1][1].equals(symbol) && grid[1][2].equals(symbol)) || (grid[2][0].equals(symbol) && grid[2][1].equals(symbol) && grid[2][2].equals(symbol)) || (grid[0][0].equals(symbol) && grid[1][0].equals(symbol) && grid[2][0].equals(symbol)) || (grid[0][1].equals(symbol) && grid[1][1].equals(symbol) && grid[2][1].equals(symbol)) || (grid[0][2].equals(symbol) && grid[1][2].equals(symbol) && grid[2][2].equals(symbol)) || (grid[0][0].equals(symbol) && grid[1][1].equals(symbol) && grid[2][2].equals(symbol)) || (grid[0][2].equals(symbol) && grid[1][1].equals(symbol) && grid[2][0].equals(symbol)))) {

            //we return true.
            return true;

        } else {

            //if no winner return false
            return false;

        }

    }

    //display method - prints the board - FIXME
    public void display() {

        System.out.println(grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2]);
        System.out.println("---------");
        System.out.println(grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2]);
        System.out.println("---------");
        System.out.println(grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2]);

    }

}
