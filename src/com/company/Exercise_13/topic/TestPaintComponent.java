package com.company.Exercise_13.topic;

import javax.swing.*;
import java.awt.*;

public class TestPaintComponent extends JFrame {
    public TestPaintComponent(){
        add(new NewLabel("Banner"));
    }

    public static void main(String[] args) {
        TestGetGraphics frame = new TestGetGraphics();
        frame.setTitle("TestPaintComponent");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}

class NewLabel extends JLabel{
    public NewLabel(String text){
        super(text);
    }

    protected void paintCompnent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0,0,50,50);
    }
}
