package org.example.example_01_02.homeWork1;

public class Factorial {
    private int number;

    public Factorial() {

    }

    public Factorial(int number) {
        this.number = number;
    }

    public int getNumberFactorial(int number) {
        return number;
    }

    public void setNumber(int number) {
        if (number >= 0) {
            this.number = number;
        } else {
            System.out.println("Error!");
        }
    }

    public int calculateFactorialFor() {
        int a = 1;
        for (int i = 1; i <= number; i++) {
            a = a * i;
        }
        return a;
    }

    public void factorialFor() {
        System.out.println(number + "! -> " + calculateFactorialFor());
    }

    public int calculateFactorialDoWhile() {
        int a = 1;
        int i = 1;
        do {
            a = a * i;
            i++;
        } while (i <= number);
        return a;
    }

    public void factorialDoWhile() {
        System.out.println(number + "! -> " + calculateFactorialDoWhile());
    }

    public int calculateFactorialWhile() {
        int a = 1;
        int i = 1;
        while (i <= number) {
            a = a * i;
            i++;
        }
        return a;
    }

    public void factorialWhile() {
        System.out.println(number + "! -> " + calculateFactorialWhile());
    }
}
