package org.example.example_06_02.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmidTest {

    @Test
    void getResult() {
        int number = 9;
        int methodNumber = 2;
        int cycleNumber = -3;

        int[] expected = {-1};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

   @Test
   void getNegativResult() {
        int number = -9;
        int methodNumber = 2;
        int cycleNumber = -3;

        int[] expected = {-1};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getFibonacciResult() {
        int number = 5;
        int methodNumber = 2;
        int cycleNumber = 1;

        int[] expected = {0, 1, 1, 2, 3};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getFibonacciNegativeResult() {
        int number = 0;
        int methodNumber = 2;
        int cycleNumber = 1;

        int[] expected = {};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getFibonacciNegativeMethod() {
        int number = 5;
        int methodNumber = 5;
        int cycleNumber = 1;

        int[] expected = {-1};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getFibonacciNegativeCycle() {
        int number = 5;
        int methodNumber = 2;
        int cycleNumber = -3;

        int[] expected = {-1};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getFactorialResult() {
        int number = 3;
        int methodNumber = 1;
        int cycleNumber = 3;

        int[] expected = {6};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getFactorialNegativeResult() {
        int number = 1;
        int methodNumber = 1;
        int cycleNumber = 3;

        int[] expected = {1};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getFactorialNegativeMethod() {
        int number = 3;
        int methodNumber = 4;
        int cycleNumber = 2;

        int[] expected = {-1};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void getFactorialNegativeCycle() {
        int number = 5;
        int methodNumber = 1;
        int cycleNumber = 0;

        int[] expected = {-1};

        Algorithmid algorithmid = new Algorithmid(number, methodNumber, cycleNumber);
        int[] actual = algorithmid.getResult();

        // then
        Assertions.assertArrayEquals(expected, actual);
    }
}