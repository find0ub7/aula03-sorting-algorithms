package com.letscode.fibonacci;

import java.math.BigInteger;

//Exemplo para entender recursao
public class FibonacciRecursive implements Fibonacci {

    @Override
    public BigInteger calculate(int n) {
        if (n <= 1) return BigInteger.valueOf(n);
        return calculate(n-1).add(calculate(n-2));
    }
}
