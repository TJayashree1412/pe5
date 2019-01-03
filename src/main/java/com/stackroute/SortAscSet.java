package com.stackroute;

/*6. Write a program to implement set interface which sorts the given randomly ordered names in ascending order. Convert the sorted set in to an array list

Input : Harry  Olive  Alice  Bluto  Eugene
Output :
Sorted Set :  Alice  Bluto  Eugene  Harry  Olive
Array list from Set :  Alice Bluto Eugene Harry Olive
*/

import java.util.*;

public class SortAscSet {
    public TreeSet<String> sortSet(HashSet<String> input){
        //System.out.println(input.size());
        if(input.size()<1){
            return null;
        }
        TreeSet<String> result=new TreeSet<>(input);
        return result;
    }
    public ArrayList<String> setToList(TreeSet<String> input){
        if(input.size()<1){
            return null;
        }
        int n = input.size();
        ArrayList<String> result = new ArrayList<String>(n);
        for (String str : input) {
            result.add(str);
        }
        return result;
    }
}
