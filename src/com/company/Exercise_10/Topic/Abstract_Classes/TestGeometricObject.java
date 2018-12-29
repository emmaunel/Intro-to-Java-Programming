package com.company.Exercise_10.Topic.Abstract_Classes;


public class TestGeometricObject {
    public static void main(String[] args){
        GeometricObject object1 = new Circle(5);
        GeometricObject object2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " +
                equalArea(object1, object2));


        displayGeoObj(object1);
        displayGeoObj(object2);
    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }


    public static void displayGeoObj(GeometricObject object){
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The Perimeter is " + object.getPerimeter());
    }
}
