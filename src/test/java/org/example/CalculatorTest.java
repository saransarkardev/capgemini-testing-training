package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Operations Test")
class CalculatorTest {

    @DisplayName("Test Addition of two Numbers")
    @Test
    void addTest() {
        Calculator calculator = new Calculator();
        int addition = calculator.add(4,2);
        assertEquals(6, addition);
    }

    @DisplayName("Test Substraction of two Numbers")
    @Test
    void substractTest() {
        Calculator calculator = new Calculator();
        int substraction = calculator.substract(6,1);
        assertEquals(5, substraction);
    }

    @DisplayName("Test Multiplication of two Numbers")
    @Test
    void multiplyTest() {
        Calculator calculator = new Calculator();
        int multiplication = calculator.multiply(5,3);
        assertEquals(15, multiplication);
    }

    @DisplayName("Test Division of two Numbers")
    @Test
    void divideTest() {
        Calculator calculator = new Calculator();
        int division = calculator.divide(15,3);
        assertEquals(5, division);
    }

}