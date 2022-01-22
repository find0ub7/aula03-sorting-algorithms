package com.letscode.fibonacci;

import java.math.BigInteger;

public class FibonacciIterative implements Fibonacci {

    @Override
    public BigInteger calculate(int n) {
        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger fn1 = BigInteger.ZERO;
        BigInteger fn2 = BigInteger.ONE;
        BigInteger fn = BigInteger.ZERO;
        for (int i = 1; i < n; i++) {
            fn = fn1.add(fn2);
            fn1 = fn2;
            fn2 = fn;
        }

        return fn;
    }

}
