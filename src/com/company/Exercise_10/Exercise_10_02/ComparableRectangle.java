package com.company.Exercise_10.Exercise_10_02;

import com.company.Exercise_10.Topic.Abstract_Classes.Rectangle;

public class ComparableRectangle extends Rectangle
        implements Comparable<ComparableRectangle> {

    public ComparableRectangle(){ }

    public ComparableRectangle(double weight, double height) {
        super(weight, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}
