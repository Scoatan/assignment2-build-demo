package com.johnathan.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testBuildMessage() {
        assertEquals(
            "Midterm DevOps Demo: GitHub, Maven, JUnit, Jenkins, and Docker are working together - Johnathan G Baez.",
            App.getBuildMessage()
        );
    }

    @Test
    public void testAddNumbers() {
        assertEquals(5, App.addNumbers(2, 3));
    }
}
