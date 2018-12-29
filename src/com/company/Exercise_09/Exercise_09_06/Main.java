package com.company.Exercise_09.Exercise_09_06;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args){
         ArrayList<Object> objects = new ArrayList<>();
         objects.add(new Loan());
         objects.add(new Date());
         objects.add(new String("Hello"));
         objects.add(new JFrame());
         objects.add(new Circle());

        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i).toString());
        }

    }
}
