package com.company.Exercise_12.topic;

import javax.swing.*;

public class Gui_Components {
    public static void main(String[] args) {
        // Create a button with text OK
        JButton ok = new JButton("OK");

        //Create a label with txt "Enter your name"
        JLabel name = new JLabel("Enter your name");


        //Create a text field with txt  "Type Name Here"
        JTextField nameField = new JTextField("Type Name Here");

        // Create a check box with text bold
        JCheckBox checkBox = new JCheckBox("Bold");

        //Create a radio button with text red
        JRadioButton radioButton = new JRadioButton("Red");

        //Create a combo box with choices red, green, and blue
        JComboBox jComboBox = new JComboBox(new String[]{"Red", "Green", "Blue"});

        // Create a frame that can hold components like Buttons, text field and so on.
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
