package com.company.Exercise_12.Exercise_12_05;

import javax.swing.*;
import java.awt.*;

public class DisplayLabels extends JFrame {

    public DisplayLabels(){
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        add(new JTextField("Department of Computer Science"));
        add(new JTextField("School of Computing"));
        add(new JTextField("Armstrong Atlantic State University"));
        add(new JTextField("Tel: 912-921-6440"));
    }

    public static void main(String[] args) {
        DisplayLabels frame = new DisplayLabels();
        frame.setTitle("Displaying Labels");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
