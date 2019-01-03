package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UpdateMapKeyValueTest {
    private UpdateMapKeyValue updateMapKeyValue;
    @Before
    public void setUp() throws Exception {
        updateMapKeyValue=new UpdateMapKeyValue();
    }

    @After
    public void tearDown() throws Exception {
        updateMapKeyValue=null;
    }

    @Test
    public void mapKeyUpdate() {
        //arrange
        HashMap<String,String> expected=new HashMap<>();
        expected.put("val1"," ");
        expected.put("val2"," ");
        //act
        HashMap<String,String> input=new HashMap<>();
        input.put("val1"," ");
        input.put("val2"," ");
        HashMap<String,String> actual=updateMapKeyValue.mapKeyUpdate(input);
        //assert
    }

    @Test
    public void mapKeyUpdateExample() {
        //arrange
        HashMap<String,String> expected=new HashMap<>();
        expected.put("val1"," ");
        expected.put("val2","java");
        //act
        HashMap<String,String> input=new HashMap<>();
        input.put("val1","java");
        input.put("val2","c++");
        HashMap<String,String> actual=updateMapKeyValue.mapKeyUpdate(input);
        //assert
    }

    @Test
    public void mapKeyUpdateExample1() {
        //arrange
        HashMap<String,String> expected=new HashMap<>();
        expected.put("val1"," ");
        expected.put("val2","mars");
        //act
        HashMap<String,String> input=new HashMap<>();
        input.put("val1","mars");
        input.put("val2","saturn");
        HashMap<String,String> actual=updateMapKeyValue.mapKeyUpdate(input);
        //assert
    }
}