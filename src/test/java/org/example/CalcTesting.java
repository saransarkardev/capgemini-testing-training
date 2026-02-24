package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcTesting {
    @ParameterizedTest
    @CsvSource (
        {
            "10, 20, 30",
            "5, 7, 12",
                "4, 1, 2"
        }
    )

    void addTestParameterized(int a, int b, int expected) {
        Calc c = new Calc();
        assertEquals(expected, c.add(a,b));
    }


    @Test
    void addTest() {
        Calc calc = new Calc();
        double result = calc.add(10,20);
//        Assertions.assertEquals(30, result);
        assertEquals(30, result);
    }

    @Test
    void addParseToDoubleTest() {
        Calc c = new Calc();
        assertEquals(50.0, c.addParseToDouble("40", 10));
    }

    @ParameterizedTest
    @CsvSource({
            "'120', 44, 164",
            "2, '21', 23",
            "'10', 44, 64"
    })
    void addParseToDoubleTest1(Object a, Object b, double expected) {
        Calc c = new Calc();
        assertTrue(c.addParseToDouble(a, b) == expected);
    }


}

