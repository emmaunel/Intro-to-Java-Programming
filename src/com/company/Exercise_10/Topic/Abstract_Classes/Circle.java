package com.company.Exercise_10.Topic.Abstract_Classes;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){ return radius + radius ; }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 *radius * Math.PI;
    }
}
