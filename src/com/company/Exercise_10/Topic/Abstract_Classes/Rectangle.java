package com.company.Exercise_10.Topic.Abstract_Classes;

public class Rectangle extends GeometricObject{
    private double weight;
    private double height;

    public Rectangle(){}

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return weight * height;
    }

    @Override
    public double getPerimeter(){
        return ((2 * weight) + (2 * height));
    }
}
