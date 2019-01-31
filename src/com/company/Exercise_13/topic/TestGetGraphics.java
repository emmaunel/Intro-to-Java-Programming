package com.company.Exercise_13.topic;

import javax.swing.*;
import java.awt.*;

public class TestGetGraphics extends JFrame {
    private JLabel banner = new JLabel("Banner");

    public TestGetGraphics(){
        add(banner);
        System.out.println(banner.getGraphics());
    }

    public static void main(String[] args) {
        TestGetGraphics frame = new TestGetGraphics();
        frame.setTitle("TestGetGraphics");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(null, "Delay on purpose\n" +
                "Click ok to dismiss the dialog");
        Graphics graphics = frame.banner.getGraphics();
        graphics.drawLine(0,0,50,50);
    }
}
