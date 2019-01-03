package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NoOfCountsTest {
    private NoOfCounts noOfCounts;
    @Before
    public void setUp() throws Exception {
        noOfCounts=new NoOfCounts();
    }

    @After
    public void tearDown() throws Exception {
        noOfCounts=null;
    }

    @Test
    public void countOfOccurences() {
        //arrange
        Map<String,Integer> expected=new HashMap<String,Integer>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        //act
        String input="one one -one___two,,three,one @three*one?two";
        Map<String,Integer> actual=noOfCounts.countOfOccurences(input);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void TestForInputIsEmpty() {
        //arrange

        //act
        String input="";
        Map<String,Integer> actual=noOfCounts.countOfOccurences(input);
        //assert
        assertNull(actual);
    }

    @Test
    public void TestForRandomInput() {
        //arrange
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("hello", 1);
        expected.put("you", 2);
        expected.put("are", 2);
        expected.put("very", 1);
        expected.put("good", 2);
        expected.put("morning", 1);
        expected.put("there", 1);
        expected.put("yo", 2);
        expected.put("honey", 1);
        expected.put("singh", 1);
        //act
        String input = "hello@123.you,are,very,good...good morning! are you there? yo yo^honey+singh";
        Map<String, Integer> actual = noOfCounts.countOfOccurences(input);
        //assert
        assertEquals(expected, actual);
    }



}