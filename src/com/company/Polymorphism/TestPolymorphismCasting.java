package com.company.Polymorphism;

import com.company.inhertance.Circle;
import com.company.inhertance.Rectangle;

public class TestPolymorphismCasting {

    public static void main(String[] args){
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);

        displayObject(object1);
        displayObject(object2);
    }

    private static void displayObject(Object object) {
        if (object instanceof Circle){
            System.out.println("The Circle area is " + ((Circle)object).getArea());
            System.out.println("The Circle diameter is " + ((Circle)object).getDiameter());
        }
        else if (object instanceof Rectangle){
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
        }
    }
}
