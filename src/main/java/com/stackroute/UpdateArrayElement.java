package com.stackroute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* 1. Write a Java program to update specific array element by given element and empty the array list.

Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []

*/


public class UpdateArrayElement {
    public ArrayList<String> updateArrayElement(ArrayList<String> input, Map<String,String> updateElement)
    {
        Iterator<Map.Entry<String,String>> iter=updateElement.entrySet().iterator();

        while (iter.hasNext()){
            Map.Entry<String,String> nextElement=iter.next();
            String key=nextElement.getKey();
//            System.out.println(key);

            int index=input.indexOf(key);
//            System.out.println(nextElement.getValue());
            input.set(index,nextElement.getValue());
        }

//        System.out.println("\n");
//        for(String str:input){
//            System.out.println(str);
//        }
        return input;
    }
    public ArrayList<String> removeAll(ArrayList<String> input){
        input.removeAll(input);
        return input;
    }
}

