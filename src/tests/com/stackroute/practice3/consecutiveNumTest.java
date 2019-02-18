package com.stackroute.practice3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class consecutiveNumTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkConsecutive() {
       assertTrue(consecutiveNum.checkConsecutive("56 55 54"));
       assertTrue(consecutiveNum.checkConsecutive("54 55 56"));
       assertFalse(consecutiveNum.checkConsecutive("56 55 56 55 56"));
    }
}