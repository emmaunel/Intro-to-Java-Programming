package com.company.Exercise_12.Exercise_12_01;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExercise  extends JFrame{
    public FlowLayoutExercise(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel p1 = new JPanel();
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));

        JPanel p2 = new JPanel();
        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));

        add(p1);
        add(p2);
    }

    public static void main(String[] args) {
        FlowLayoutExercise frame = new FlowLayoutExercise();
        frame.setTitle("TestSwingCommonFeatures");
        frame.setSize(600, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
