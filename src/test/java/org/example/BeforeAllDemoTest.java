package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Implementation of BeforeAll Annotation. (Before all the Test methods....this method will run where we will use @BeforeAll annotation.
public class BeforeAllDemoTest {

    private static Calculator calculator;

    @BeforeAll
    static void setUpBeforeClass() {
        calculator = new Calculator();
        System.out.println("setUpBeforeClassMethod is calling....");
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
