/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.week.lab.activity.tic.tac.toe;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Sophia Golden
 */
public class TicTacToeGUI extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToeGUI
     */
    public TicTacToeGUI() {
        initComponents();

        //disable the restart button:
        ButtonRestart.setVisible(false);

    }

    //variable declaration
    public String currentPlayer = "X";

    //switch player method
    public void switchPlayers() {

        if (currentPlayer.equals("X")) {

            currentPlayer = "O";

            //switch the text
            LabelPlayerTurnWin.setText("Player Two's turn!");

        } else {

            currentPlayer = "X";

            //switch the text
            LabelPlayerTurnWin.setText("Player One's turn!");

        }

    }

    //check winner method
    public boolean checkForWinner() {

        if ((ButtonSpace1.getText() == currentPlayer && ButtonSpace2.getText() == currentPlayer && ButtonSpace3.getText() == currentPlayer) || (ButtonSpace4.getText() == currentPlayer && ButtonSpace5.getText() == currentPlayer && ButtonSpace6.getText() == currentPlayer) || (ButtonSpace7.getText() == currentPlayer && ButtonSpace8.getText() == currentPlayer && ButtonSpace9.getText() == currentPlayer) || (ButtonSpace1.getText() == currentPlayer && ButtonSpace5.getText() == currentPlayer && ButtonSpace9.getText() == currentPlayer) || (ButtonSpace3.getText() == currentPlayer && ButtonSpace5.getText() == currentPlayer && ButtonSpace7.getText() == currentPlayer) || (ButtonSpace1.getText() == currentPlayer && ButtonSpace4.getText() == currentPlayer && ButtonSpace7.getText() == currentPlayer) || (ButtonSpace2.getText() == currentPlayer && ButtonSpace5.getText() == currentPlayer && ButtonSpace8.getText() == currentPlayer) || (ButtonSpace3.getText() == currentPlayer && ButtonSpace6.getText() == currentPlayer && ButtonSpace9.getText() == currentPlayer)) {

            //there is winner
            return true;

        } else {

            //no winner yet
            return false;

        }

    }

    //check for full method
    public boolean checkForFull() {

        //if it's full return true if not return false
        if ((ButtonSpace1.getText() == "X" || ButtonSpace1.getText() == "O") && (ButtonSpace2.getText() == "X" || ButtonSpace2.getText() == "O") && (ButtonSpace3.getText() == "X" || ButtonSpace3.getText() == "O") && (ButtonSpace4.getText() == "X" || ButtonSpace4.getText() == "O") && (ButtonSpace5.getText() == "X" || ButtonSpace5.getText() == "O") && (ButtonSpace6.getText() == "X" || ButtonSpace6.getText() == "O") && (ButtonSpace7.getText() == "X" || ButtonSpace7.getText() == "O") && (ButtonSpace8.getText() == "X" || ButtonSpace8.getText() == "O") && (ButtonSpace9.getText() == "X" || ButtonSpace9.getText() == "O")) {

            return true;

        } else {

            return false;

        }

    }

    //check end condition method - to check if there's a winner at all or if there's a tie
    //is a boolean so we can end the game later
    public boolean checkEndCondition() {

        //if there's a winner
        if (checkForWinner() == true) {

            if (currentPlayer.equals("X")) {

                LabelPlayerTurnWin.setText("Player One has won the game!");
                ButtonRestart.setVisible(true);
                return true;

            } else {

                LabelPlayerTurnWin.setText("Player Two has won the game!");
                ButtonRestart.setVisible(true);
                return true;

            }

        }

        //if no winner and a full board it's a tie
        if (checkForWinner() == false && checkForFull() == true) {

            LabelPlayerTurnWin.setText("The game is a tie!");
            ButtonRestart.setVisible(true);
            return true;

        }

        return false;

    }

    //VARIABLES GO HERE
    //METHODS GO HERE
    //CALL THEM FROM INSIDE BUTTONS
    //getters of text
    public String getButtonSpace1Text() {

        return ButtonSpace1.getText();

    }

    public String getButtonSpace2Text() {

        return ButtonSpace2.getText();

    }

    public String getButtonSpace3Text() {

        return ButtonSpace3.getText();

    }

    public String getButtonSpace4Text() {

        return ButtonSpace4.getText();

    }

    public String getButtonSpace5Text() {

        return ButtonSpace5.getText();

    }

    public String getButtonSpace6Text() {

        return ButtonSpace6.getText();

    }

    public String getButtonSpace7Text() {

        return ButtonSpace7.getText();

    }

    public String getButtonSpace8Text() {

        return ButtonSpace8.getText();

    }

    public String getButtonSpace9Text() {

        return ButtonSpace9.getText();

    }

    //setters of text
    public void setButtonSpace1Text(String text) {

        this.ButtonSpace1.setText(text);

    }

    public void setButtonSpace2Text(String text) {

        this.ButtonSpace2.setText(text);

    }

    public void setButtonSpace3Text(String text) {

        this.ButtonSpace3.setText(text);

    }

    public void setButtonSpace4Text(String text) {

        this.ButtonSpace4.setText(text);

    }

    public void setButtonSpace5Text(String text) {

        this.ButtonSpace5.setText(text);

    }

    public void setButtonSpace6Text(String text) {

        this.ButtonSpace6.setText(text);

    }

    public void setButtonSpace7Text(String text) {

        this.ButtonSpace7.setText(text);

    }

    public void setButtonSpace8Text(String text) {

        this.ButtonSpace8.setText(text);

    }

    public void setButtonSpace9Text(String text) {

        this.ButtonSpace9.setText(text);

    }

    public void setLabelPlayerTurnWinText(String text) {

        this.LabelPlayerTurnWin.setText(text);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ButtonSpace1 = new javax.swing.JButton();
        ButtonSpace2 = new javax.swing.JButton();
        ButtonSpace3 = new javax.swing.JButton();
        ButtonSpace4 = new javax.swing.JButton();
        ButtonSpace5 = new javax.swing.JButton();
        ButtonSpace6 = new javax.swing.JButton();
        ButtonSpace7 = new javax.swing.JButton();
        ButtonSpace8 = new javax.swing.JButton();
        ButtonSpace9 = new javax.swing.JButton();
        ButtonRestart = new javax.swing.JButton();
        LabelPlayerTurnWin = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        ButtonSpace1.setText("          ");
        ButtonSpace1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSpace1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonSpace1MouseEntered(evt);
            }
        });
        ButtonSpace1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSpace1ActionPerformed(evt);
            }
        });

        ButtonSpace2.setText("          ");
        ButtonSpace2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSpace2MouseClicked(evt);
            }
        });

        ButtonSpace3.setText("          ");
        ButtonSpace3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSpace3MouseClicked(evt);
            }
        });
        ButtonSpace3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSpace3ActionPerformed(evt);
            }
        });

        ButtonSpace4.setText("          ");
        ButtonSpace4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSpace4MouseClicked(evt);
            }
        });

        ButtonSpace5.setText("          ");
        ButtonSpace5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSpace5MouseClicked(evt);
            }
        });
        ButtonSpace5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSpace5ActionPerformed(evt);
            }
        });

        ButtonSpace6.setText("          ");
        ButtonSpace6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSpace6MouseClicked(evt);
            }
        });
        ButtonSpace6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSpace6ActionPerformed(evt);
            }
        });

        ButtonSpace7.setText("          ");
        ButtonSpace7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSpace7MouseClicked(evt);
            }
        });

        ButtonSpace8.setText("          ");
        ButtonSpace8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSpace8MouseClicked(evt);
            }
        });

        ButtonSpace9.setText("          ");
        ButtonSpace9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSpace9MouseClicked(evt);
            }
        });
        ButtonSpace9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSpace9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonSpace7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ButtonSpace4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ButtonSpace1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonSpace2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(ButtonSpace5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonSpace3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonSpace6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ButtonSpace8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(ButtonSpace9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonSpace3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSpace1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSpace2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonSpace6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSpace4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSpace5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonSpace9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSpace7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSpace8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        ButtonRestart.setText("Play again?");
        ButtonRestart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonRestartMouseClicked(evt);
            }
        });
        ButtonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRestartActionPerformed(evt);
            }
        });

        LabelPlayerTurnWin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelPlayerTurnWin.setForeground(new java.awt.Color(0, 0, 0));
        LabelPlayerTurnWin.setText("Player 1's turn!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelPlayerTurnWin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122)
                        .addComponent(ButtonRestart)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(288, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPlayerTurnWin)
                    .addComponent(ButtonRestart))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSpace3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSpace3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSpace3ActionPerformed

    private void ButtonSpace6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSpace6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSpace6ActionPerformed

    private void ButtonSpace9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSpace9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSpace9ActionPerformed

    private void ButtonSpace1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSpace1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ButtonSpace1ActionPerformed

    private void ButtonSpace5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSpace5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSpace5ActionPerformed

    //SET CLICK EVENT CONTENTS HERE

    private void ButtonSpace1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace1MouseClicked
        // TODO add your handling code here:

        //if the spot isn't taken set the text to the current player's symbol and switch players
        if (!ButtonSpace1.getText().equals("X") && !ButtonSpace1.getText().equals("O")) {

            //if the game isn't already over we can move
            if (checkEndCondition() == false) {

                ButtonSpace1.setText(currentPlayer);

            }

            //if it's not an end condition we switch players
            //we don't need the string of disabling the buttons !! 
            //the code would work if it were just if checkEndCondition() == false {switchplayers}
            //but it looks cool lol
            if (checkEndCondition() == true) {

                ButtonSpace1.setEnabled(false);
                ButtonSpace2.setEnabled(false);
                ButtonSpace3.setEnabled(false);
                ButtonSpace4.setEnabled(false);
                ButtonSpace5.setEnabled(false);
                ButtonSpace6.setEnabled(false);
                ButtonSpace7.setEnabled(false);
                ButtonSpace8.setEnabled(false);
                ButtonSpace9.setEnabled(false);

            } else {

                switchPlayers();

            }
        }
    }//GEN-LAST:event_ButtonSpace1MouseClicked

    //this isn't necessary
    private void ButtonSpace1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSpace1MouseEntered

    private void ButtonSpace2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace2MouseClicked
        // TODO add your handling code here:

        //if the spot isn't taken set the text to the current player's symbol and switch players
        if (!ButtonSpace2.getText().equals("X") && !ButtonSpace2.getText().equals("O")) {

            //if the game isn't already over we can move
            if (checkEndCondition() == false) {

                ButtonSpace2.setText(currentPlayer);

            }

            //if it's not an end condition we switch players
            if (checkEndCondition() == true) {

                ButtonSpace1.setEnabled(false);
                ButtonSpace2.setEnabled(false);
                ButtonSpace3.setEnabled(false);
                ButtonSpace4.setEnabled(false);
                ButtonSpace5.setEnabled(false);
                ButtonSpace6.setEnabled(false);
                ButtonSpace7.setEnabled(false);
                ButtonSpace8.setEnabled(false);
                ButtonSpace9.setEnabled(false);

            } else {

                switchPlayers();

            }
        }
    }//GEN-LAST:event_ButtonSpace2MouseClicked

    private void ButtonSpace3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace3MouseClicked
        // TODO add your handling code here:

        //if the spot isn't taken set the text to the current player's symbol and switch players
        if (!ButtonSpace3.getText().equals("X") && !ButtonSpace3.getText().equals("O")) {

            //if the game isn't already over we can move
            if (checkEndCondition() == false) {

                ButtonSpace3.setText(currentPlayer);

            }

            //if it's not an end condition we switch players
            if (checkEndCondition() == true) {

                ButtonSpace1.setEnabled(false);
                ButtonSpace2.setEnabled(false);
                ButtonSpace3.setEnabled(false);
                ButtonSpace4.setEnabled(false);
                ButtonSpace5.setEnabled(false);
                ButtonSpace6.setEnabled(false);
                ButtonSpace7.setEnabled(false);
                ButtonSpace8.setEnabled(false);
                ButtonSpace9.setEnabled(false);

            } else {

                switchPlayers();

            }
        }
    }//GEN-LAST:event_ButtonSpace3MouseClicked

    private void ButtonSpace4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace4MouseClicked
        // TODO add your handling code here:

        //if the spot isn't taken set the text to the current player's symbol and switch players
        if (!ButtonSpace4.getText().equals("X") && !ButtonSpace4.getText().equals("O")) {

            //if the game isn't already over we can move
            if (checkEndCondition() == false) {

                ButtonSpace4.setText(currentPlayer);

            }

            //if it's not an end condition we switch players
            if (checkEndCondition() == true) {

                ButtonSpace1.setEnabled(false);
                ButtonSpace2.setEnabled(false);
                ButtonSpace3.setEnabled(false);
                ButtonSpace4.setEnabled(false);
                ButtonSpace5.setEnabled(false);
                ButtonSpace6.setEnabled(false);
                ButtonSpace7.setEnabled(false);
                ButtonSpace8.setEnabled(false);
                ButtonSpace9.setEnabled(false);

            } else {

                switchPlayers();

            }

        }

    }//GEN-LAST:event_ButtonSpace4MouseClicked

    private void ButtonSpace5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace5MouseClicked
        // TODO add your handling code here:

        //if the spot isn't taken set the text to the current player's symbol and switch players
        if (!ButtonSpace5.getText().equals("X") && !ButtonSpace5.getText().equals("O")) {

            //if the game isn't already over we can move
            if (checkEndCondition() == false) {

                ButtonSpace5.setText(currentPlayer);

            }

            //if it's not an end condition we switch players
            if (checkEndCondition() == true) {

                ButtonSpace1.setEnabled(false);
                ButtonSpace2.setEnabled(false);
                ButtonSpace3.setEnabled(false);
                ButtonSpace4.setEnabled(false);
                ButtonSpace5.setEnabled(false);
                ButtonSpace6.setEnabled(false);
                ButtonSpace7.setEnabled(false);
                ButtonSpace8.setEnabled(false);
                ButtonSpace9.setEnabled(false);

            } else {

                switchPlayers();

            }
        }
    }//GEN-LAST:event_ButtonSpace5MouseClicked

    private void ButtonSpace6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace6MouseClicked
        // TODO add your handling code here:

        //if the spot isn't taken set the text to the current player's symbol and switch players
        if (!ButtonSpace6.getText().equals("X") && !ButtonSpace6.getText().equals("O")) {

            //if the game isn't already over we can move
            if (checkEndCondition() == false) {

                ButtonSpace6.setText(currentPlayer);

            }

            //if it's not an end condition we switch players
            if (checkEndCondition() == true) {

                ButtonSpace1.setEnabled(false);
                ButtonSpace2.setEnabled(false);
                ButtonSpace3.setEnabled(false);
                ButtonSpace4.setEnabled(false);
                ButtonSpace5.setEnabled(false);
                ButtonSpace6.setEnabled(false);
                ButtonSpace7.setEnabled(false);
                ButtonSpace8.setEnabled(false);
                ButtonSpace9.setEnabled(false);

            } else {

                switchPlayers();

            }
        }
    }//GEN-LAST:event_ButtonSpace6MouseClicked

    private void ButtonSpace7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace7MouseClicked
        // TODO add your handling code here:

        //if the spot isn't taken set the text to the current player's symbol and switch players
        if (!ButtonSpace7.getText().equals("X") && !ButtonSpace7.getText().equals("O")) {

            //if the game isn't already over we can move
            if (checkEndCondition() == false) {

                ButtonSpace7.setText(currentPlayer);

            }

            //if it's not an end condition we switch players
            if (checkEndCondition() == true) {

                ButtonSpace1.setEnabled(false);
                ButtonSpace2.setEnabled(false);
                ButtonSpace3.setEnabled(false);
                ButtonSpace4.setEnabled(false);
                ButtonSpace5.setEnabled(false);
                ButtonSpace6.setEnabled(false);
                ButtonSpace7.setEnabled(false);
                ButtonSpace8.setEnabled(false);
                ButtonSpace9.setEnabled(false);

            } else {

                switchPlayers();

            }
        }
    }//GEN-LAST:event_ButtonSpace7MouseClicked

    private void ButtonSpace8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace8MouseClicked
        // TODO add your handling code here:

        //if the spot isn't taken set the text to the current player's symbol and switch players
        if (!ButtonSpace8.getText().equals("X") && !ButtonSpace8.getText().equals("O")) {

            //if the game isn't already over we can move
            if (checkEndCondition() == false) {

                ButtonSpace8.setText(currentPlayer);

            }

            //if it's not an end condition we switch players
            if (checkEndCondition() == true) {

                ButtonSpace1.setEnabled(false);
                ButtonSpace2.setEnabled(false);
                ButtonSpace3.setEnabled(false);
                ButtonSpace4.setEnabled(false);
                ButtonSpace5.setEnabled(false);
                ButtonSpace6.setEnabled(false);
                ButtonSpace7.setEnabled(false);
                ButtonSpace8.setEnabled(false);
                ButtonSpace9.setEnabled(false);

            } else {

                switchPlayers();

            }
        }
    }//GEN-LAST:event_ButtonSpace8MouseClicked

    private void ButtonSpace9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSpace9MouseClicked
        // TODO add your handling code here:

        //if the spot isn't taken set the text to the current player's symbol and switch players
        if (!ButtonSpace9.getText().equals("X") && !ButtonSpace9.getText().equals("O")) {

            //if the game isn't already over we can move
            if (checkEndCondition() == false) {

                ButtonSpace9.setText(currentPlayer);

            }

            //if it's not an end condition we switch players
            if (checkEndCondition() == true) {

                ButtonSpace1.setEnabled(false);
                ButtonSpace2.setEnabled(false);
                ButtonSpace3.setEnabled(false);
                ButtonSpace4.setEnabled(false);
                ButtonSpace5.setEnabled(false);
                ButtonSpace6.setEnabled(false);
                ButtonSpace7.setEnabled(false);
                ButtonSpace8.setEnabled(false);
                ButtonSpace9.setEnabled(false);

            } else {

                switchPlayers();

            }

        }
    }//GEN-LAST:event_ButtonSpace9MouseClicked

    private void ButtonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRestartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRestartActionPerformed

    private void ButtonRestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRestartMouseClicked
        // TODO add your handling code here:

        //restart
        currentPlayer = "X";
        ButtonSpace1.setEnabled(true);
        ButtonSpace2.setEnabled(true);
        ButtonSpace3.setEnabled(true);
        ButtonSpace4.setEnabled(true);
        ButtonSpace5.setEnabled(true);
        ButtonSpace6.setEnabled(true);
        ButtonSpace7.setEnabled(true);
        ButtonSpace8.setEnabled(true);
        ButtonSpace9.setEnabled(true);

        ButtonSpace1.setText(" ");
        ButtonSpace2.setText(" ");
        ButtonSpace3.setText(" ");
        ButtonSpace4.setText(" ");
        ButtonSpace5.setText(" ");
        ButtonSpace6.setText(" ");
        ButtonSpace7.setText(" ");
        ButtonSpace8.setText(" ");
        ButtonSpace9.setText(" ");
        
        LabelPlayerTurnWin.setText("Player One's turn!");
        
        //hide the button again
        ButtonRestart.setVisible(false);


    }//GEN-LAST:event_ButtonRestartMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRestart;
    private javax.swing.JButton ButtonSpace1;
    private javax.swing.JButton ButtonSpace2;
    private javax.swing.JButton ButtonSpace3;
    private javax.swing.JButton ButtonSpace4;
    private javax.swing.JButton ButtonSpace5;
    private javax.swing.JButton ButtonSpace6;
    private javax.swing.JButton ButtonSpace7;
    private javax.swing.JButton ButtonSpace8;
    private javax.swing.JButton ButtonSpace9;
    private javax.swing.JLabel LabelPlayerTurnWin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
