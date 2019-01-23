package com.company.Exercise_12.topic;

import javax.swing.*;

public class MyFrameWithComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrameWithComponents");

        // Add a button into the frame
        JButton ok = new JButton("OK");
        frame.add(ok);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
