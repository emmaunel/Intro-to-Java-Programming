package com.company.Exercise_09.Exercise_09_02;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone_number,
                 String email, int office, double salary, String title) {
        super(name, address, phone_number, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
