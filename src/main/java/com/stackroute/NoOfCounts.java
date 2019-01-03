package com.stackroute;

/*2. Write a program to find the number of counts in the following String. Store the output in Map<String,Integer> as key value pair.

Input :  String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}
*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NoOfCounts {
    public Map<String,Integer> countOfOccurences(String input){
        if(input==""){
            return null;
        }
        Map<String,Integer> count=new HashMap<String,Integer>();

        String array[]=input.split("[^a-z]+");
        for(String string: array)
        {
            if(count.containsKey(string))
                count.put(string,count.get(string)+1);
            else
                count.put(string, 1);
        }
        return count;
    }
}
//        int occurence=0;//=new int[array.length];
//        String string[]=new String[array.length];
//        boolean flag=false;
//        int j=0;
//        for(String str:array){
//            string[j]=str;
//            for(j=0;j<string.length;j++){
//                if(str.equals(string[j])) {
//                    flag=false;
//                    break;
//                }
//                else
//                {
//                    flag=true;
//                }
//            }
//            if(flag==true){
//                j++;
//                System.out.println(string[j]);
//                for(int i=0;i<array.length;i++) {
//                    occurence = 0;
//                    if (string[j].equals(array[i])) {
//                        // flag=true;
//                        occurence++;
//                    }
//                }
//                count.put(str,occurence);
//                System.out.println(str+" "+occurence);
//            }
//            }

