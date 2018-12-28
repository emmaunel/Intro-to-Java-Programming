package com.company.Exercise_09.Exercise_09_02;

/***
 * Programming Exericises: 9.5-9.9
 * Author: Ayobami Adewale <aadewale123@gmail.com>
 * Purpose: To practice inheritance
 */


public class Person {
    private String name;
    private String address;
    private String  phone_number;
    private String email;

    public Person(){}

    public Person(String name, String address, String phone_number, String email) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Address: " + address + " Phone Number: " + phone_number
                + " Email: " + email;
    }
}
