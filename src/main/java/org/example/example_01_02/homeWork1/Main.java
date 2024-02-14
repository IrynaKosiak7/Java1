package org.example.example_01_02.homeWork1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibon = new FibonacciSequence();
        fibon.setNumber(9);
        System.out.println(Arrays.toString(fibon.fibonacciSequenceFor()));
        System.out.println();
        fibon.setNumber(5);
        System.out.println(Arrays.toString(fibon.fibonacciSequenceWhile()));
        System.out.println();
        fibon.setNumber(9);
        System.out.println(Arrays.toString(fibon.fibonacciSequenceDoWhile()));

        Factorial factor = new Factorial();
        factor.setNumber(5);
        factor.factorialFor();
        System.out.println();
        factor.setNumber(9);
        factor.factorialDoWhile();
        System.out.println();
        factor.setNumber(3);
        factor.factorialWhile();
    }
}
