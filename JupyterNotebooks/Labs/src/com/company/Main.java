package com.company;


import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String args[]) {


        LinkedList list = new LinkedList();


        list.add(5);
        list.add(3);
        list.add(10);
        list.add(2);
        list.add(1);


        System.out.println("The list is:" + list);


        list.add(7);
        list.add(4);
        list.remove(2);
        Collections.sort(list);



        System.out.println("The new List is:" + list);
    }
}





