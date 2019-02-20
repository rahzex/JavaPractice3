package com.stackroute.practice3;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void remove() {
        String[] places = {"India","United States","Germany","czechoslovakia","1337x"};
        assertArrayEquals(new String[] {"nd","ntd Stts","Grmny","czchslvk","1337x"}, RemoveVowel.remove(places));
    }
}