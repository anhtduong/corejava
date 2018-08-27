package com.example.javacore;

import java.util.ArrayList;

public class MyArrayList {
    public void ArrayListSyntax(){
        ArrayList<String> obj = new ArrayList<String>();
//      add new item to array list
        for (int i = 0; i <5 ; i++) {
            obj.add("Item " + i);
        }
//      print the list of new array
        System.out.println("new array list " + obj);
//      add item at index 1, over-write the item 1
        obj.add(1,"Item at index 1");
        System.out.println("add new item at index 1 "+ obj);
        obj.remove("Item 2");
        System.out.println("remove item 2 from the list " + obj);
        obj.remove(3);
        System.out.println("remove item at index 3 "+ obj);
        obj.set(1,"replaced item at index 1");
        System.out.println("replace item at index 1" + obj);
        System.out.println(obj.get(3));
        obj.clear();
        System.out.println("last array list is "+ obj);
    }


}
