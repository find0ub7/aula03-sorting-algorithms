package com.letscode.fibonacci;

public class TestaFibonacci { //0 1 1 2 3 5 8 13 ... f(n) = f(n-1) + f(n-2)
    // f(0) = 0
    // f(1) = 1
    // f(2) = f(1) + f(0) = 1 + 0 = 1
    // f(3) = f(2) + f(1) = 1 + 1 = 2
    // f(4) = f(3) + f(2) = 2 + 1 = 3
    // f(n) = f(n-1) + f(n-2)

    public static void main(String[] args) {
        Fibonacci fibonacci = new FibonacciRecursive();
        //        Fibonacci fibonacci = new FibonacciIterative();

        System.out.println("Inicio");
        System.out.println(fibonacci.calculate(0)); //0
        System.out.println(fibonacci.calculate(1)); //1
        System.out.println(fibonacci.calculate(2)); //1
        System.out.println(fibonacci.calculate(3)); //2
        System.out.println(fibonacci.calculate(4)); //3
        System.out.println(fibonacci.calculate(10)); //55
        System.out.println(fibonacci.calculate(36)); //14930352
        System.out.println("Fim");
    }
}
