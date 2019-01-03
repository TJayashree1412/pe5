
package com.stackroute;

/*3. Write a program where an array of strings is input and output is a Map<String,boolean> where each different string is a key
 and its value is true if that string appears 2 or more times in the array
 import java.util.Map;Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
  */

import java.util.HashMap;
import java.util.Map;

public class ArrayOfStringsToMap {
    public Map<String,Boolean> oneOrMoreOccurenceMap(String[] arr){
        Map<String,Boolean> result=new HashMap<>();
        if(arr.length<1){
            return null;
        }
            for(String str:arr){
                if(result.containsKey(str)){
                    result.put(str,true);
                }
                else
                {
                    result.put(str,false);
                }
            }

        return result;
    }
}
