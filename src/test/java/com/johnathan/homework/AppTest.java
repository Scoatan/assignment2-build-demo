package com.johnathan.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testBuildMessage() {
        assertEquals(
            "Assignment 5: Docker container rebuild test is working - updated by Johnathan G Baez.",
            App.getBuildMessage()
        );
    }

    @Test
    public void testAddNumbers() {
        assertEquals(5, App.addNumbers(2, 3));
    }
}
