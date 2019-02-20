package com.stackroute.practice3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkConsecutive() {
       assertTrue(ConsecutiveNum.checkConsecutive("56 55 54"));
       assertTrue(ConsecutiveNum.checkConsecutive("54 55 56"));
       assertFalse(ConsecutiveNum.checkConsecutive("56 55 56 55 56"));
    }
}