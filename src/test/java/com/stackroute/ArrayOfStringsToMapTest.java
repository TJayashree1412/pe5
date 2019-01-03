package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayOfStringsToMapTest {
    private ArrayOfStringsToMap arrayOfStringsToMap;
    @Before
    public void setUp() throws Exception {
        arrayOfStringsToMap=new ArrayOfStringsToMap();
    }

    @After
    public void tearDown() throws Exception {
        arrayOfStringsToMap=null;
    }

    @Test
    public void TestForNoInput() {
        //arrange
        //act
        String input[] = {};
        Map<String,Boolean> actual=arrayOfStringsToMap.oneOrMoreOccurenceMap(input);
        //assert
        assertNull(actual);
    }

    @Test
    public void oneOrMoreOccurenceMap() {
        //arrange
        Map<String,Boolean> expected=new HashMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        //act
        String input[] = {"a","b","c","d","a","c","c"};
        Map<String,Boolean> actual=arrayOfStringsToMap.oneOrMoreOccurenceMap(input);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void oneOrMoreOccurenceMap1() {
        //arrange
        Map<String,Boolean> expected=new HashMap<>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        expected.put(" ",false);
        expected.put("v",false);
        //act
        String input[] = {"a","b","c","d","a","c","c"," ","v","c","c","c"};
        Map<String,Boolean> actual=arrayOfStringsToMap.oneOrMoreOccurenceMap(input);
        //assert
        assertEquals(expected,actual);
    }

}