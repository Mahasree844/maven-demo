package com.demo.maven_demo;

import javax.swing.*;

public class NumberCheckGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Even Odd Checker");

        JTextField t = new JTextField();
        t.setBounds(50, 50, 150, 30);

        JButton b = new JButton("Check");
        b.setBounds(50, 100, 100, 30);

        JLabel l = new JLabel();
        l.setBounds(50, 150, 200, 30);

        b.addActionListener(e -> {
            int num = Integer.parseInt(t.getText());
            NumberCheck nc = new NumberCheck();
            l.setText(nc.checkEvenOdd(num));
        });

        f.add(t);
        f.add(b);
        f.add(l);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}