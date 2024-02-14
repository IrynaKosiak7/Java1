package org.example.example_01_02.homeWork1;

import java.util.Arrays;

public class FibonacciSequence {
    private int number;

    public FibonacciSequence() {

    }

    public FibonacciSequence(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number >= 0) {
            this.number = number;
        } else {
            System.out.println("Error!");
        }
    }

    public int[] fibonacciSequenceFor() {
        int[] fibanocci = new int[number];
        if (number > 1) {
            fibanocci[1] = 1;
            for (int i = 2; i < number; i++) {
                fibanocci[i] = fibanocci[i - 2] + fibanocci[i - 1];
            }
        }
        return fibanocci;
    }

    public void calculateFibanacciFor() {
        System.out.println(number + " -> " + Arrays.toString(fibonacciSequenceFor()));
    }

    public int[] fibonacciSequenceWhile() {
        int[] fibanocci = new int[number];
        int i = 2;
        if (number > 1) {
            fibanocci[1] = 1;
            while (i < number) {
                fibanocci[i] = fibanocci[i - 2] + fibanocci[i - 1];
                i++;
            }
        }
        return fibanocci;
    }

    public void calculateFibanacciWhile() {
        System.out.println(number + " -> " + Arrays.toString(fibonacciSequenceWhile()));
    }

    public int[] fibonacciSequenceDoWhile() {
        int[] fibanocci = new int[number];
        int i = 2;
        if (number > 1) {
            fibanocci[1] = 1;
            if (number > 2) {

                do {
                    fibanocci[i] = fibanocci[i - 2] + fibanocci[i - 1];
                    i++;

                } while (i < number);
            }
        }
        return fibanocci;
    }

    public void calculateFibanacciDoWhile() {
        System.out.println(number + " -> " + Arrays.toString(fibonacciSequenceDoWhile()));
    }
}
