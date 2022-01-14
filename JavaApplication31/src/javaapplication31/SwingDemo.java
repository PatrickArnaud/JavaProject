/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 *
 * @author Patri
 */
public class SwingDemo extends JFrame {

    JProgressBar progressBar;
    int i = 0;

    SwingDemo() {
        progressBar = new JProgressBar(0, 1000);
        progressBar.setBounds(70, 50, 120, 30);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        add(progressBar);
        setSize(550, 150);
        setLayout(null);
    }

    public void inc() {
        while (i <= 1000) {
            progressBar.setValue(i);
            i = i + 50;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        SwingDemo s = new SwingDemo();
        s.setVisible(true);
        s.inc();
    }
}
