package com.company.Exercise_09.Exercise_09_02;

public class Faculty extends Employee{
    private String  office_hours;
    private String rank;


    public Faculty(String name, String address, String phone_number, String email,
                   int office, double salary, String office_hours, String rank) {
        super(name, address, phone_number, email, office, salary);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    public String toString() {
        return super.toString() + "\nOffice hours: " + office_hours +
                "\nRank: " + rank;
    }
}
