package com.company.Exercise_10.Exercise_10_04;

import java.util.Date;

public class House implements Cloneable, Comparable{
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public int whenBuily() {
        return whenBuilt.getDay();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        if (area > ((House) o).area) {
            return 1;
        } else if (area < ((House) o).area) {
            return -1;
        } else {
            return 0;
        }

    }
}
