package org.example;

public class Factorial {

    public int calculateFactorial(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++)
            fact *= i;

        return fact;
    }
}
