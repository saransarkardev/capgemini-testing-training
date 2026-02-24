package org.example;

import java.text.NumberFormat;

public class Calc {
    int add (int a, int b) {
        return a + b;
    }

//    public <T extends Number> double add(T a, T b) {
//        return a.doubleValue() + b.doubleValue();
//    }

    public double addParseToDouble(Object a, Object b) {
        double num1 = parseToDouble(a);
        double num2 = parseToDouble(b);

        return num1+num2;
    }

    public double parseToDouble(Object value) {
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        }

        if (value instanceof String) {
            try{
                return Double.parseDouble((String) value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Enter numbers only");
            }
        }

        throw new IllegalArgumentException("Enter numbers only");
    }
}
