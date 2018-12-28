package com.company.Exercise_09.ArrayList;

import java.util.ArrayList;

public class MyStack {
    private ArrayList list = new ArrayList();

    //Return true if the stack is empty
    public boolean isEmpty(){
        return list.isEmpty();
    }

    //Return the number of elements in the stack
    public int getSize(){
        return list.size();
    }

    //Returns the top element in this stack
    public Object peek(){
        return list.get(getSize() - 1);
    }

    //Returns and removes the top element in this stack
    public Object pop(){
        Object o = list.get(getSize() - 1);
        System.out.println("The top number was " + o);
        list.remove(getSize() - 1);
        return o;
    }

    //Adds a new element to the top of the stack
    public Object push(Object o){
        list.add(o);
        return o;
    }

    //Returns the position of the first element in the stack form the top that matches
    //the specified element
    public int search(Object o){
        return list.lastIndexOf(o);
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}
