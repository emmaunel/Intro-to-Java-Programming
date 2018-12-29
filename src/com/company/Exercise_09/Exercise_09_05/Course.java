package com.company.Exercise_09.Exercise_09_05;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<String> students;


    public Course(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(String student){
        students.add(student);
    }

    public String[] getStudents(){
        String[] a = new String[students.size()];
        return students.toArray(a);
    }
    public int getNumberOfStudents(){
        return students.size();
    }

    public String getName() {
        return name;
    }

    public void removeStudent(String student){
        students.remove(student);
    }
}
