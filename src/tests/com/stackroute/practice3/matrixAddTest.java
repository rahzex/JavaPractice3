package com.stackroute.practice3;

import com.stackroute.practice3.matrixAdd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class matrixAddTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addMatrix() {
        int[][] m1 = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};

        int[][] m2 = {{9, 8, 7},
                      {6, 5, 4},
                      {3, 2, 1}};

        int[][] sum = {{10, 10, 10},
                       {10, 10, 10},
                       {10, 10, 10}};

        assertArrayEquals(sum, matrixAdd.addMatrix(m1,m2,3,3));
    }
}