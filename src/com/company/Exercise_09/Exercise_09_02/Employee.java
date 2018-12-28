package com.company.Exercise_09.Exercise_09_02;

public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate date;

    public Employee(){ }

    public Employee(String name, String address, String phone_number, String email,
                    int office, double salary) {
        super(name, address, phone_number, email);
        this.office = office;
        this.salary = salary;
        this.date = new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public String getSalary() {
        return String.format("%.2f", salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return date.getMonth() + "/" + date.getDay()
                + "/" + date.getYear();
    }

    public void setDateHired() {
        date = new MyDate();
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice: " + office +
                "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }
}
