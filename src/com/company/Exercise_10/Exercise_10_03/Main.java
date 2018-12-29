package com.company.Exercise_10.Exercise_10_03;

import com.company.Exercise_10.Topic.Abstract_Classes.GeometricObject;

public class Main {
    public static void main(String[] args) {
        // Create an array of five GeometricObjects
        GeometricObject[] squares = {new Square(4.5), new Square(14),
                new Square(8.2), new Square(12), new Square(10)};

        // Display the area and invoke the howToColor
        // method for each GeometricObject
        for (int i = 0; i < squares.length; i++) {
            System.out.println("\nSquare #" + (i + 1));
            System.out.println("Area: " + squares[i].getArea());
            // TODO: 2018-12-28 Fix this
//            System.out.println("How to color: " + ((GeometricObject)squares).howToColor());
        }
    }
}
