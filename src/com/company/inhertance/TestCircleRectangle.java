package com.company.inhertance;

public class TestCircleRectangle {
    public static void main(String[] args){
        Circle circle = new Circle(1);
        System.out.println("A Circle " + circle.toString());
        System.out.println(circle.getRadius());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The perimeter " + circle.getPerimeter());


        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("the area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
