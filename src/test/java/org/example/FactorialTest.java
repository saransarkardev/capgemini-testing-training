package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//We can make the test class as public, default. --> Visibility
public class FactorialTest {

    // We can make the test methods as public, protected and default. --> Visibility
    @Test
    void calculateFactorialTest() {
        Factorial obj = new Factorial();
        int actualResult = obj.calculateFactorial(4);
        assertEquals(24, actualResult);
    }
}
