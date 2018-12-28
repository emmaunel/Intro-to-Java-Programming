package com.company.Exercise_09.inhertance;

import java.util.Date;

public class GeometricObject {
    private String color = "yello";
    private boolean filled = true;
    private Date dateCreated;

    public GeometricObject(){
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
}
