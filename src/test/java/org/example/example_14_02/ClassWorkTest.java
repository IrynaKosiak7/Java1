package org.example.example_14_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassWorkTest {

    @Test
    void getArrayWitoutNumber() {
        int[] arr = {16, 27, 14, 8, 11, 5, 96, 27};
        int number = 27;

        int[] expected = {16, 14, 8, 11, 5, 96};

        int[] actual = ClassWork.getArrayWitoutNumber(arr, number);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void searchMinIndexEven() {
        int[] array = {1, 20, 14, 5, 30, 7, 9, 6, 14, 0, -5, -8 - 4};
        int expected = 8;
        int actual = ClassWork.searchMinIndexEven(array);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void getSumPositiv(){
        int[] array = {1, 20, 14, 5, 30, 7, 9, 6, 14, -5, -8 - 4};
        int expected =-1 ;
        int actual = ClassWork.getSumPositiv(array);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getSumPositivZeroAt0Index(){
        int[] arr = {16, 27, 14, 8, 11, 5, 96, 27, 1, 20, 14, 5, 30, 7, 9, 6, 14, -5, -8 - 4, 0};
        int expected = 0;
        int actual = ClassWork.getSumPositiv(arr);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void getArray(){
        int[] array = {16, 27, 14, 8, 11, 5, 96, 27, 1, 20, 14, 5, 30, 7, 9, 6, 14, -5, -8 - 4, 0};
        int[] arrayPositive = {16, 27, 14, 8, 11, 5, 96, 27, 1, 20, 14, 5, 30, 7, 9, 6, 14};
        int[] arrayNegative = {-5, -8,-4};
    }
}