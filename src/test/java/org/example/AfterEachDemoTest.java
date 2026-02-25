package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Implementation of AfterEach Annotation. (After each Test method....this method will run where we will use @AfterEach annotation.
public class AfterEachDemoTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("setup method calling...");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("tearDown method is calling...");
    }

    @Test
    void addTest() {
        int addition = calculator.add(4,2);
        assertEquals(6, addition);
        System.out.println("addTest method calling...");
    }


    @Test
    void subtractTest() {
        int substraction = calculator.substract(6,1);
        assertEquals(5, substraction);
        System.out.println("subtractTest method is calling...");
    }


    @Test
    void multiplyTest() {
        int multiplication = calculator.multiply(5,3);
        assertEquals(15, multiplication);
        System.out.println("multiplyTest method is calling...");
    }


    @Test
    void divideTest() {
        int division = calculator.divide(15,3);
        assertEquals(5, division);
        System.out.println("divideTest method is calling...");
    }
}
