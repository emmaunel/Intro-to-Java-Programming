package com.company.Exercise_10.Topic;

public class GenericSort {
    public static void main(String[] args){
        Integer[] intArray = {2, 4, 3};
        Double[] doubles = {3.4, 1.3, -22.1};
        Character[] characters = {'a', 'J', 'r'};
        String[] strings = {"Tom", "John", "Fred"};

        sort(intArray);
        sort(doubles);
        sort(characters);
        sort(strings);

        System.out.println("Sorted Integer objects: ");
        printList(intArray);
        System.out.println("Sorted Double objects: ");
        printList(doubles);
        System.out.println("Sorted Character objects: ");
        printList(characters);
        System.out.println("Sorted String objects: ");
        printList(strings);
    }

    public static void sort(Object[] list){
        Object currnetMaz;
        int currenIndex;

        for (int i = list.length - 1; i >= 1; i--) {
            //Find the maximum in the list
            currnetMaz = list[i];
            currenIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (((Comparable)currnetMaz).compareTo(list[j]) < 0){
                    currnetMaz = list[j];
                    currenIndex = j;
                }
            }

            if (currenIndex != i){
                list[currenIndex] = list[i];
                list[i] = currnetMaz;
            }
        }
    }


    public static  void printList(Object[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " " );
            System.out.println();
        }
    }
}
