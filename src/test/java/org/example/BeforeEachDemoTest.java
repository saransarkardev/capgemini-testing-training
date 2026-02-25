package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Implementation of BeforeEach Annotation. (Before each Test method....this method will run where we will use @BeforeEach annotation.
public class BeforeEachDemoTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addTest() {
        int addition = calculator.add(4,2);
        assertEquals(6, addition);
    }


    @Test
    void substractTest() {
        int substraction = calculator.substract(6,1);
        assertEquals(5, substraction);
    }


    @Test
    void multiplyTest() {

        int multiplication = calculator.multiply(5,3);
        assertEquals(15, multiplication);
    }


    @Test
    void divideTest() {
        int division = calculator.divide(15,3);
        assertEquals(5, division);
    }
}
