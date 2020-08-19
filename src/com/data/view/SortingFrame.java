/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data.view;

import com.data.model.sort.BubbleSorting;
import com.data.model.sort.InsertionSorting;
import com.data.model.sort.SelectionSorting;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author omkar
 */
public class SortingFrame extends javax.swing.JFrame {

    /**
     * Creates new form SortingFrame
     */
    public SortingFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SortInnerPanel = new javax.swing.JPanel();
        selectLabel = new javax.swing.JLabel();
        BubbleRadioButton = new javax.swing.JRadioButton();
        InsertionRadioButton = new javax.swing.JRadioButton();
        SelectionRadioButton = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        EnterArrayLabel = new javax.swing.JLabel();
        elementOne = new javax.swing.JTextField();
        elementTwo = new javax.swing.JTextField();
        elementThree = new javax.swing.JTextField();
        elementFour = new javax.swing.JTextField();
        elementFive = new javax.swing.JTextField();
        elementSix = new javax.swing.JTextField();
        elementSeven = new javax.swing.JTextField();
        elementEight = new javax.swing.JTextField();
        elementNine = new javax.swing.JTextField();
        elementTen = new javax.swing.JTextField();
        elementEleven = new javax.swing.JTextField();
        VisualizeButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        arrayElementOne = new javax.swing.JLabel();
        arrayElementTwo = new javax.swing.JLabel();
        arrayElementThree = new javax.swing.JLabel();
        arrayElementFour = new javax.swing.JLabel();
        arrayElementFive = new javax.swing.JLabel();
        arrayElementSix = new javax.swing.JLabel();
        arrayElementSeven = new javax.swing.JLabel();
        arrayElementEight = new javax.swing.JLabel();
        arrayElementNine = new javax.swing.JLabel();
        arrayElementTen = new javax.swing.JLabel();
        arrayElementEleven = new javax.swing.JLabel();
        BackToDashButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(234, 234, 129));
        setResizable(false);

        SortInnerPanel.setBackground(new java.awt.Color(201, 201, 182));

        selectLabel.setBackground(new java.awt.Color(205, 154, 114));
        selectLabel.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        selectLabel.setText("Select Sorting Algorithm");

        BubbleRadioButton.setText("Bubble Sort");
        BubbleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BubbleRadioButtonActionPerformed(evt);
            }
        });

        InsertionRadioButton.setText("Insertion Sort");

        SelectionRadioButton.setText("Selection Sort");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        EnterArrayLabel.setBackground(new java.awt.Color(205, 154, 114));
        EnterArrayLabel.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        EnterArrayLabel.setText("Enter Array Elements :");

        elementOne.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementOne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementOneKeyTyped(evt);
            }
        });

        elementTwo.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementTwo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementTwoKeyTyped(evt);
            }
        });

        elementThree.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementThree.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementThreeKeyTyped(evt);
            }
        });

        elementFour.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementFour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementFourKeyTyped(evt);
            }
        });

        elementFive.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementFive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementFiveKeyTyped(evt);
            }
        });

        elementSix.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementSix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementSixKeyTyped(evt);
            }
        });

        elementSeven.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementSeven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementSevenKeyTyped(evt);
            }
        });

        elementEight.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementEight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementEightKeyTyped(evt);
            }
        });

        elementNine.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementNine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementNineKeyTyped(evt);
            }
        });

        elementTen.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementTenKeyTyped(evt);
            }
        });

        elementEleven.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        elementEleven.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                elementElevenKeyTyped(evt);
            }
        });

        VisualizeButton.setText("Visualize");
        VisualizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        arrayElementOne.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementTwo.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementTwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementThree.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementThree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementFour.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementFour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementFive.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementFive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementSix.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementSix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementSeven.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementSeven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementEight.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementEight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementNine.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementNine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementTen.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        arrayElementEleven.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        arrayElementEleven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout SortInnerPanelLayout = new javax.swing.GroupLayout(SortInnerPanel);
        SortInnerPanel.setLayout(SortInnerPanelLayout);
        SortInnerPanelLayout.setHorizontalGroup(
            SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SortInnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SortInnerPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(elementOne, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(elementTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(elementThree, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(elementFour, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(elementFive, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(elementSix, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(elementSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(elementEight, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(elementNine, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(elementTen, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(elementEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(SortInnerPanelLayout.createSequentialGroup()
                        .addGroup(SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SortInnerPanelLayout.createSequentialGroup()
                                .addComponent(BubbleRadioButton)
                                .addGap(48, 48, 48)
                                .addComponent(InsertionRadioButton)
                                .addGap(47, 47, 47)
                                .addComponent(SelectionRadioButton))
                            .addComponent(EnterArrayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SortInnerPanelLayout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(VisualizeButton)))
                        .addContainerGap(508, Short.MAX_VALUE))))
            .addGroup(SortInnerPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(arrayElementOne, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(arrayElementTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(arrayElementThree, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(arrayElementFour, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(arrayElementFive, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(arrayElementSix, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(arrayElementSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(arrayElementEight, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(arrayElementNine, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(arrayElementTen, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(arrayElementEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        SortInnerPanelLayout.setVerticalGroup(
            SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SortInnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SortInnerPanelLayout.createSequentialGroup()
                        .addComponent(selectLabel)
                        .addGap(18, 18, 18)
                        .addGroup(SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BubbleRadioButton)
                            .addComponent(InsertionRadioButton)
                            .addComponent(SelectionRadioButton))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnterArrayLabel)
                        .addGap(18, 18, 18)
                        .addComponent(elementEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SortInnerPanelLayout.createSequentialGroup()
                        .addGroup(SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elementOne, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementThree, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementFour, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementFive, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementSix, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementEight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementNine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementTen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGroup(SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(arrayElementTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrayElementSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrayElementEight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrayElementNine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrayElementTen, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrayElementEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SortInnerPanelLayout.createSequentialGroup()
                        .addComponent(VisualizeButton)
                        .addGap(18, 18, 18)
                        .addGroup(SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SortInnerPanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(SortInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(arrayElementOne, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arrayElementFive, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arrayElementSix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(arrayElementThree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrayElementFour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        BackToDashButton.setText("Back To DashBoard");
        BackToDashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToDashButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SortInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackToDashButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(BackToDashButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SortInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashButtonActionPerformed
        this.setVisible(false);
        new DashBoard().setVisible(true);
    }//GEN-LAST:event_BackToDashButtonActionPerformed

    private void BubbleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BubbleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BubbleRadioButtonActionPerformed

    private void elementOneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementOneKeyTyped
        if ((elementOne.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementOneKeyTyped

    private void elementTwoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementTwoKeyTyped
        if ((elementTwo.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementTwoKeyTyped

    private void elementThreeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementThreeKeyTyped
        if ((elementThree.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementThreeKeyTyped

    private void elementFourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementFourKeyTyped
        if ((elementFour.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementFourKeyTyped

    private void elementFiveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementFiveKeyTyped
        if ((elementFive.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementFiveKeyTyped

    private void elementSixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementSixKeyTyped
        if ((elementSix.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementSixKeyTyped

    private void elementSevenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementSevenKeyTyped
        if ((elementSeven.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementSevenKeyTyped

    private void elementEightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementEightKeyTyped
        if ((elementEight.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementEightKeyTyped

    private void elementNineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementNineKeyTyped
        if ((elementNine.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementNineKeyTyped

    private void elementTenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementTenKeyTyped
        if ((elementTen.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementTenKeyTyped

    private void elementElevenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementElevenKeyTyped
        if ((elementEleven.getText() + evt.getKeyChar()).length() > 2) {
            evt.consume();
        }
    }//GEN-LAST:event_elementElevenKeyTyped
    
    public void setValue(int elements[]){
            arrayElementOne.setText(Integer.toString(elements[0]));
            arrayElementTwo.setText(Integer.toString(elements[1]));
            arrayElementThree.setText(Integer.toString(elements[2]));
            arrayElementFour.setText(Integer.toString(elements[3]));
            arrayElementFive.setText(Integer.toString(elements[4]));
            arrayElementSix.setText(Integer.toString(elements[5]));
            arrayElementSeven.setText(Integer.toString(elements[6]));
            arrayElementEight.setText(Integer.toString(elements[7]));
            arrayElementNine.setText(Integer.toString(elements[8]));
            arrayElementTen.setText(Integer.toString(elements[9]));
            arrayElementEleven.setText(Integer.toString(elements[10]));        
    }
    public  int[] putValue(){
            int virtualArray[]=new int[11];
            virtualArray[0]=Integer.parseInt(elementOne.getText());
            virtualArray[1]=Integer.parseInt(elementTwo.getText());
            virtualArray[2]=Integer.parseInt(elementThree.getText());
            virtualArray[3]=Integer.parseInt(elementFour.getText());
            virtualArray[4]=Integer.parseInt(elementFive.getText());
            virtualArray[5]=Integer.parseInt(elementSix.getText());
            virtualArray[6]=Integer.parseInt(elementSeven.getText());
            virtualArray[7]=Integer.parseInt(elementEight.getText());
            virtualArray[8]=Integer.parseInt(elementNine.getText());
            virtualArray[9]=Integer.parseInt(elementTen.getText());
            virtualArray[10]=Integer.parseInt(elementEleven.getText());
            return virtualArray;
    }
    
    
    private void VisualizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizeButtonActionPerformed
        try {
                    if(true){
            try {
                boolean a1=BubbleRadioButton.isSelected();
                boolean a2=InsertionRadioButton.isSelected();
                boolean a3=SelectionRadioButton.isSelected();
                int cnt=0;
                int check=0;
                if(a1){ check=1;cnt++; }
                if(a2){ check=2;cnt++; }
                if(a3){ check=3;cnt++; }
                if(cnt>1){
                    JOptionPane.showMessageDialog(this, "More than two algorithm selected",  
                                   "Error", JOptionPane.DEFAULT_OPTION);
                }
                switch(check){
                    case 1:
                        BubbleSorting a=new BubbleSorting();
                        a.BubbleSort(this);
                        break;                        
                    case 2:
                        InsertionSorting b=new InsertionSorting();
                        b.InsertionSort(this);
                        break;
                    case 3:
                        SelectionSorting c=new SelectionSorting();
                        c.SelectionSort(this);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Select the Sorting Algorithm",  
                                   "Error", JOptionPane.DEFAULT_OPTION);
                        break;
                    
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(SortingFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter  all the array Elements or Select the sorting Algorithm",  
                                   "ERROR", JOptionPane.ERROR_MESSAGE); 
        }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter  all the array Elements or Select the sorting Algorithm",  
                                   "ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        
    }//GEN-LAST:event_VisualizeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToDashButton;
    private javax.swing.JRadioButton BubbleRadioButton;
    private javax.swing.JLabel EnterArrayLabel;
    private javax.swing.JRadioButton InsertionRadioButton;
    private javax.swing.JRadioButton SelectionRadioButton;
    private javax.swing.JPanel SortInnerPanel;
    private javax.swing.JButton VisualizeButton;
    private javax.swing.JLabel arrayElementEight;
    private javax.swing.JLabel arrayElementEleven;
    private javax.swing.JLabel arrayElementFive;
    private javax.swing.JLabel arrayElementFour;
    private javax.swing.JLabel arrayElementNine;
    private javax.swing.JLabel arrayElementOne;
    private javax.swing.JLabel arrayElementSeven;
    private javax.swing.JLabel arrayElementSix;
    private javax.swing.JLabel arrayElementTen;
    private javax.swing.JLabel arrayElementThree;
    private javax.swing.JLabel arrayElementTwo;
    private javax.swing.JTextField elementEight;
    private javax.swing.JTextField elementEleven;
    private javax.swing.JTextField elementFive;
    private javax.swing.JTextField elementFour;
    private javax.swing.JTextField elementNine;
    private javax.swing.JTextField elementOne;
    private javax.swing.JTextField elementSeven;
    private javax.swing.JTextField elementSix;
    private javax.swing.JTextField elementTen;
    private javax.swing.JTextField elementThree;
    private javax.swing.JTextField elementTwo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel selectLabel;
    // End of variables declaration//GEN-END:variables
}