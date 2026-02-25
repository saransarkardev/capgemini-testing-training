package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisabledCalculatorTest {

//    @Disabled or @Disabled("msg") --> It is used to disable any test method...

    @Disabled
    @Test
    void addTest() {
        Calculator calculator = new Calculator();
        int addition = calculator.add(4,2);
        assertEquals(6, addition);
    }

    @Disabled
    @DisplayName("Test Substraction of two Numbers")
    @Test
    void substractTest() {
        Calculator calculator = new Calculator();
        int substraction = calculator.substract(6,1);
        assertEquals(5, substraction);
    }

    @Disabled("This method will be disabled until #40 bug is fixed.")
    @Test
    void multiplyTest() {
        Calculator calculator = new Calculator();
        int multiplication = calculator.multiply(5,3);
        assertEquals(15, multiplication);
    }


    @Test
    void divideTest() {
        Calculator calculator = new Calculator();
        int division = calculator.divide(15,3);
        assertEquals(5, division);
    }

}
