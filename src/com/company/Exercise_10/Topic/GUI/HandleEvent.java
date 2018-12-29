package com.company.Exercise_10.Topic.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandleEvent extends JFrame {
    public HandleEvent(){
        FlowLayout layout = new FlowLayout();
        setLayout(layout);

        JButton ok = new JButton("OK");
        JButton cancel = new JButton("cancel");
        add(ok);
        add(cancel);

        OKListner listner = new OKListner();
        CancelListner listner1 = new CancelListner();
        ok.addActionListener(listner);
        cancel.addActionListener(listner1);

    }


    public static void main(String[] args){
        JFrame frame = new HandleEvent();
        frame.setTitle("Handle Event");
        frame.setSize(200, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    class OKListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("OK button clicked");
        }
    }

    class CancelListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Cancel button clicked");
        }
    }

}
