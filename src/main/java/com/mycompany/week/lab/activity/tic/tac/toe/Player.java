/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week.lab.activity.tic.tac.toe;

/**
 *
 * @author Sophia Golden
 */
public class Player {

    //name and symbol instance fields 
    private String name;
    private String symbol;

    //constructor (in later code we can read the name as an input and an object might look like Player(nameVar, "X"))
    public Player(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    
    //Getters
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    
    

}
