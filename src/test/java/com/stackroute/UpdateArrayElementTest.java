package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UpdateArrayElementTest {
    private UpdateArrayElement updateArrayElement;
    @Before
    public void setUp() throws Exception {
        updateArrayElement=new UpdateArrayElement();
    }

    @After
    public void tearDown() throws Exception {
        updateArrayElement=null;
    }

    @Test
    public void UpdateArrayElementForExampleValues() {
        //arrange
        ArrayList<String> expected=new ArrayList<>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
        //act
        ArrayList<String > input=new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        Map<String,String> updateElement=new HashMap<>();
        updateElement.put("Apple","Kiwi");
        updateElement.put("Melon","Mango");
        ArrayList<String> actual=updateArrayElement.updateArrayElement(input,updateElement);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void updateArrayElementForRandomInput() {
        //arrange
        ArrayList<String> expected=new ArrayList<>();
        expected.add("hello");
        expected.add("Everyone");
        expected.add("Welcome");
        expected.add("to");
        expected.add("the");
        expected.add("Universe");
        expected.add("of");
        expected.add("Programming");
        expected.add(":)");
        //act
        ArrayList<String > input=new ArrayList<>();
        input.add("hello");
        input.add("!");
        input.add("Welcome");
        input.add("to");
        input.add("the");
        input.add("world");
        input.add("of");
        input.add("Java");
        input.add(" ");

        Map<String,String> updateElement=new HashMap<>();
        updateElement.put("!","Everyone");
        updateElement.put("world","Universe");
        updateElement.put("Java","Programming");
        updateElement.put(" ",":)");
        ArrayList<String> actual=updateArrayElement.updateArrayElement(input,updateElement);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void updateArrayElementForTestValues() {
        //arrange
        ArrayList<String> expected=new ArrayList<>();
        expected.add("Apple");
        expected.add("Grape");
        expected.add("Melon");
        expected.add("Berry");
        //act
        ArrayList<String > input=new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        Map<String,String> updateElement=new HashMap<>();
        ArrayList<String> actual=updateArrayElement.updateArrayElement(input,updateElement);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void removeAll(){
        //arrange
        ArrayList<String> expected=new ArrayList<>();
        //act
        ArrayList<String > input=new ArrayList<>();
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        ArrayList<String> actual=updateArrayElement.removeAll(input);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void removeAllForNoinput(){
        //arrange
        ArrayList<String> expected=new ArrayList<>();
        //act
        ArrayList<String > input=new ArrayList<>();
        ArrayList<String> actual=updateArrayElement.removeAll(input);
        //assert
        assertEquals(expected,actual);
    }

}