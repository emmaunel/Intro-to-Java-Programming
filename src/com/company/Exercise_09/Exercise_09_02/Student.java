package com.company.Exercise_09.Exercise_09_02;

public class Student extends Person {
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 3;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 4;

    public Student(String name, String address,
                   String phone_number, String email, int status){
        super(name, address, phone_number, email);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
            default : return "Unknown";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status: " + status;
    }
}
