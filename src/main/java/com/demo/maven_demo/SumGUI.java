package com.demo.maven_demo;

import javax.swing.*;

public class SumGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sum Calculator");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton btn = new JButton("Add");
        JLabel result = new JLabel("Result: ");

        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(200, 50, 100, 30);
        btn.setBounds(120, 100, 100, 30);
        result.setBounds(120, 150, 200, 30);

        frame.add(t1);
        frame.add(t2);
        frame.add(btn);
        frame.add(result);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        Sum s = new Sum();

        btn.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int res = s.add(a, b);
            result.setText("Result: " + res);
        });
    }
}