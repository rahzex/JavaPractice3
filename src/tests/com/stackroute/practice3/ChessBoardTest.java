package com.stackroute.practice3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void generateChessBoard() {
        String[][] expexted = { {"WW","BB","WW","BB","WW","BB","WW","BB"},
                                {"BB","WW","BB","WW","BB","WW","BB","WW"},
                                {"WW","BB","WW","BB","WW","BB","WW","BB"},
                                {"BB","WW","BB","WW","BB","WW","BB","WW"},
                                {"WW","BB","WW","BB","WW","BB","WW","BB"},
                                {"BB","WW","BB","WW","BB","WW","BB","WW"},
                                {"WW","BB","WW","BB","WW","BB","WW","BB"},
                                {"BB","WW","BB","WW","BB","WW","BB","WW"}};
        assertArrayEquals(expexted, ChessBoard.generateChessBoard());
    }
}