package org.apache.maven.homeworks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class TicTac extends JFrame {
    final int size = 3;
    JPanel panel = new JPanel(new GridLayout(size, size));
    JButton[][] buttons = new JButton[size][size];

    public TicTac() {
        super("TicTac");
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        panel.setOpaque(true);
        panel.setBackground(Color.gray);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground(Color.gray);
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, (250 / size )));
                buttons[i][j].setText("");
                panel.add(buttons[i][j]);
            }
        }

        buttons[0][0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (buttons[0][0].getText().equals("") && !checkWin() && isFull()) {
                    buttons[0][0].setText("X");
                    if (!checkWin() && isFull()) aiTurn();
                }
            }
        });
        buttons[0][1].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (buttons[0][1].getText().equals("") && !checkWin() && isFull()) {
                    buttons[0][1].setText("X");
                    if (!checkWin() && isFull()) aiTurn();
                }
            }
        });
        buttons[0][2].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (buttons[0][2].getText().equals("") && !checkWin() && isFull()) {
                    buttons[0][2].setText("X");
                    if (!checkWin() && isFull()) aiTurn();
                }
            }
        });
        buttons[1][0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (buttons[1][0].getText().equals("") && !checkWin() && isFull()) {
                    buttons[1][0].setText("X");
                    if (!checkWin() && isFull()) aiTurn();
                }
            }
        });
        buttons[1][1].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (buttons[1][1].getText().equals("") && !checkWin() && isFull()) {
                    buttons[1][1].setText("X");
                    if (!checkWin() && isFull()) aiTurn();
                }
            }
        });
        buttons[1][2].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (buttons[1][2].getText().equals("") && !checkWin() && isFull()) {
                    buttons[1][2].setText("X");
                    if (!checkWin() && isFull()) aiTurn();
                }
            }
        });
        buttons[2][0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (buttons[2][0].getText().equals("") && !checkWin() && isFull()) {
                    buttons[2][0].setText("X");
                    if (!checkWin() && isFull()) aiTurn();
                }
            }
        });
        buttons[2][1].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (buttons[2][1].getText().equals("") && !checkWin() && isFull()) {
                    buttons[2][1].setText("X");
                    if (!checkWin() && isFull()) aiTurn();
                }
            }
        });
        buttons[2][2].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (buttons[2][2].getText().equals("") && !checkWin() && isFull()) {
                    buttons[2][2].setText("X");
                    if (!checkWin() && isFull()) aiTurn();
                }
            }
        });

        setVisible(true);
    }

    public void startNew() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setBackground(Color.gray);
            }
        }
    }

    boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (buttons[i][j].getText().equals("")) return true;
            }
        }
        int reply = JOptionPane.showConfirmDialog(null, "Ничья. Еще разок?", null, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION){
            startNew();
        } else {
            System.exit(0);
        }

        return false;
    }

    void aiTurn() {
        Random r = new Random();
        int i =  r.nextInt(size);
        int j =  r.nextInt(size);
        while (!isCellValid(i, j)) {
            i = r.nextInt(size);
            j = r.nextInt(size);
        }
        buttons[i][j].setText("O");
        checkWin();
    }

    boolean isCellValid(int i, int j) {
        return buttons[i][j].getText().equals("");
    }

    boolean checkWin() {
        int countXH;
        int countOH;
        int countXV;
        int countOV;
        int countXD1 = 0;
        int countOD1 = 0;
        int countXD2 = 0;
        int countOD2 = 0;
        for (int i = 0; i < size; i++) {
            countXH = 0;
            countOH = 0;
            countXV = 0;
            countOV = 0;
            for (int j = 0; j < size; j++) {
                if (buttons[i][j].getText().equals("X")) {
                    countXH += 1;
                    if (countXH == size) {
                        int reply = JOptionPane.showConfirmDialog(null, "Победил человек! Еще разок?", null, JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION){
                            startNew();
                        } else {
                            System.exit(0);
                        }
                        return true;
                    }
                }
                if (buttons[i][j].getText().equals("O")) {
                    countOH += 1;
                    if (countOH == size) {
                        int reply = JOptionPane.showConfirmDialog(null, "Победил ИИ! Еще разок?", null, JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION){
                            startNew();
                        } else {
                            System.exit(0);
                        }
                        return true;
                    }
                }

                if (buttons[j][i].getText().equals("X")) {
                    countXV += 1;
                    if (countXV == size) {
                        int reply = JOptionPane.showConfirmDialog(null, "Победил человек! Еще разок?", null, JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION){
                            startNew();
                        } else {
                            System.exit(0);
                        }
                        return true;
                    }
                }
                if (buttons[j][i].getText().equals("O")) {
                    countOV += 1;
                    if (countOV == size) {
                        int reply = JOptionPane.showConfirmDialog(null, "Победил ИИ! Еще разок?", null, JOptionPane.YES_NO_OPTION);
                        if (reply == JOptionPane.YES_OPTION){
                            startNew();
                        } else {
                            System.exit(0);
                        }
                        return true;
                    }
                }
            }

            if (buttons[i][i].getText().equals("X")) {
                countXD1 += 1;
                if (countXD1 == size) {
                    int reply = JOptionPane.showConfirmDialog(null, "Победил человек! Еще разок?", null, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION){
                        startNew();
                    } else {
                        System.exit(0);
                    }
                    return true;
                }
            }
            if (buttons[i][i].getText().equals("O")) {
                countOD1 += 1;
                if (countOD1 == size) {
                    int reply = JOptionPane.showConfirmDialog(null, "Победил ИИ! Еще разок?", null, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION){
                        startNew();
                    } else {
                        System.exit(0);
                    }
                    return true;
                }
            }

            if (buttons[i][size - i - 1].getText().equals("X")) {
                countXD2 += 1;
                if (countXD2 == size) {
                    int reply = JOptionPane.showConfirmDialog(null, "Победил человек! Еще разок?", null, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION){
                        startNew();
                    } else {
                        System.exit(0);
                    }
                    return true;
                }
            }
            if (buttons[i][size - i - 1].getText().equals("O")) {
                countOD2 += 1;
                if (countOD2 == size) {
                    int reply = JOptionPane.showConfirmDialog(null, "Победил ИИ! Еще разок?", null, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION){
                        startNew();
                    } else {
                        System.exit(0);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new TicTac();
    }

}
