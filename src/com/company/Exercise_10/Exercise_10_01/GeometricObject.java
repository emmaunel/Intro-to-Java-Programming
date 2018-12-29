package com.company.Exercise_10.Exercise_10_01;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>{

    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    /** Abstract method getMax */
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

    //Abstract method getAea
    public abstract double getArea();

    // Abstract method getPerimeter
    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
}

