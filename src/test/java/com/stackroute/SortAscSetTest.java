package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortAscSetTest {
    private SortAscSet sortAscSet;
    @Before
    public void setUp() throws Exception {
        sortAscSet=new SortAscSet();
    }

    @After
    public void tearDown() throws Exception {
        sortAscSet=null;
    }

    @Test
    public void sortSet() {
        //arrange
        TreeSet<String> expected=new TreeSet<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        //act
        HashSet<String> input=new HashSet<>();
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");
        input.add("Harry");
        input.add("Olive");
        TreeSet<String> actual=sortAscSet.sortSet(input);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void sortSetforNull() {
        //arrange

        //act
        HashSet<String> input=new HashSet<>();

        TreeSet<String> actual=sortAscSet.sortSet(input);
        //assert
        assertNull(actual);
    }

    @Test
    public void sortSet1() {
        //arrange
        TreeSet<String> expected=new TreeSet<>();
        expected.add("Aaae");
        expected.add("Aaamir");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        //act
        HashSet<String> input=new HashSet<>();
        input.add("Aaae");
        input.add("Harry");
        input.add("Eugene");
        input.add("Aaamir");
        input.add("Olive");
        TreeSet<String> actual=sortAscSet.sortSet(input);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void setToList() {
        //arrange
        ArrayList<String> expected=new ArrayList<>(Arrays.asList(new String[]{"Alice", "Bluto", "Eugene", "Harry", "Olive"}));
        //act
        TreeSet<String> input=new TreeSet<>();
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");
        input.add("Harry");
        input.add("Olive");
        ArrayList<String> actual=sortAscSet.setToList(input);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void setToListForInputNull() {
        //arrange
        //act
        TreeSet<String> input=new TreeSet<>();

        ArrayList<String> actual=sortAscSet.setToList(input);
        //assert
        assertNull(actual);
    }
}