package com.company.Exercise_12.topic;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TestSwingCommonFeatures extends JFrame {
    public TestSwingCommonFeatures(){
        // Create a panel to group three buttons
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JButton center = new JButton("Center");
        left.setBackground(Color.WHITE);
        center.setBackground(Color.GREEN);
        // what does this do
        // Doesn't work
        right.setToolTipText("This is the Right Button");
        p1.add(left);
        p1.add(center);
        p1.add(right);
        p1.setBorder(new TitledBorder("Three Buttons"));

        Font large = new Font("TimesRoman", Font.BOLD, 20);
        Border lineBorder = new LineBorder(Color.BLACK, 2);

        // Create a panel to group two labels
        JPanel p2 = new JPanel(new GridLayout(1, 2,5,5));
        JLabel red = new JLabel("Red");
        JLabel orange = new JLabel("Orange");
        red.setForeground(Color.red);
        orange.setForeground(Color.orange);
        red.setFont(large);
        orange.setFont(large);
        red.setBorder(lineBorder);
        orange.setBorder(lineBorder);
        p2.add(red);
        p2.add(orange);
        p2.setBorder(new TitledBorder("Two Labels"));

        setLayout(new GridLayout(2, 1, 5, 5));
        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        JFrame frame = new TestSwingCommonFeatures();
        frame.setTitle("TestSwingCommonFeatures");
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
