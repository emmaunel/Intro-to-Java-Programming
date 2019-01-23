package com.company.Exercise_09.GUI;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

    public CustomFrame(){
        //Set FlowLayoutExercise for the frame
        FlowLayout layout = new FlowLayout();
        setLayout(layout);

        //Add two buttons to frame
        JButton jbOK = new JButton("OK");
        JButton jbCan = new JButton("Cancel");
        add(jbOK);
        add(jbCan);
    }

    public static void main(String[] args){
        JFrame frame = new CustomFrame();
        frame.setTitle("Window 1");
        frame.setSize(200, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
