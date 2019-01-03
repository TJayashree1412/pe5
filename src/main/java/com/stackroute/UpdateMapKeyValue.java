package com.stackroute;

/*5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2. Modify and return the given map as follows:

        a. If the key `val1` has a value, set the key `val2` to have that value, and
        b. Set the key `val1` to have the value `"  "` (empty string).
        Example 1:
        The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2": "java"}
        Example 2:
        The map {"val1": "mars", "val2": "saturn"}  should return {"val1": " ", "val2": "mars"}
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UpdateMapKeyValue {
    public HashMap<String,String> mapKeyUpdate(HashMap<String,String> input){
        Iterator<Map.Entry<String,String>> iter=input.entrySet().iterator();
        Map.Entry<String,String> firstElement=iter.next();
        Map.Entry<String,String> secondElement=iter.next();
        input.put(firstElement.getKey()," ");
        input.put(secondElement.getKey(),firstElement.getValue());
        return input;
    }
}
