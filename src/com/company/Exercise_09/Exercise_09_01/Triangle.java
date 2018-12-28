package com.company.Exercise_09.Exercise_09_01;

/***
 * Programming Exericises: 9.1
 * Author: Ayobami Adewale <aadewale123@gmail.com>
 * Purpose: To practice inheritance
 */

import com.company.Exercise_09.inhertance.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return s * (s - side1) * (s - side2) * (s - side3);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 +
                " side2 = " + side2 +
                " side3 = " + side3;
    }

}

class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 2, 3);
        System.out.println("A Triangle " + triangle.toString());
        System.out.println("The triangle area " + triangle.getArea());
        System.out.println("The triangle perimeter " + triangle.getPerimeter());
    }
}

