package org.example.example_14_02;

import java.util.Arrays;

//Задача
//Дан массив целых чисел и ещё одно целое число.
// Удалите все вхождения этого числа из массива,
// вернув новый массив нужной длинны.
public class ClassWork {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayWitoutNumber(new int[]{16, 27, 14, 8, 11, 5, 96, 27}, 27)));
        System.out.println(searchMinIndexEven(new int[]{1, 20, 14, 5, 30, 7, 9, 6, 14}));
        System.out.println(getSumPositiv(new int[]{1, 20, 0, 14, 5, 30, 7, 9, 6, 14}));
      getArray(new int[] {16, 27, 14, 8, 11, 5, 96, 27, 1, 20, 14, 5, 30, 7, 9, 6, 14, -5, -8,- 4, 0});
    }

    public static int[] getArrayWitoutNumber(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        int[] result = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    //    Задача
//    В массиве из целых чисел найти индекс минимального из четных положительных элементов,
//    при их отсутствии вывести -1.
    public static int searchMinIndexEven(int[] array) {
        int index = -1;
        int minPositivNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0 && array[i] < minPositivNumber) {
                array[i] = minPositivNumber;
                index = i;
            }
        }
        return index;
    }

    //    Задача
//    Вычислить сумму положительных элементов массива А после первого нуля (при наличии нуля).
    public static int getSumPositiv(int[] array) {
        int indexOfZero = -1;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                indexOfZero = i;
                break;
            }
        }
        if (indexOfZero == -1) {
            return -1;
        }
        for (int i = indexOfZero; i < array.length; i++) {
            if (array[i] > 0) {
                sum = array[i] + sum;
            }
        }
        return sum;
    }

    public static void getArray(int[] array) {
        int[] arrayPositive = new int[array.length];
        int[] arrayNegative = new int[array.length];
        int indexPositive = 0;
        int indexNegative = 0;

        for (int i = 0; i < array.length; i++) {
            if (0 < array[i]) {
                arrayPositive[indexPositive] = array[i];
                indexPositive++;
            } else if (0 > array[i]) {
                arrayNegative[indexNegative] = array[i];
                indexNegative++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Arrays.copyOf(arrayPositive,indexPositive)));
        System.out.println(Arrays.toString(Arrays.copyOf(arrayNegative,indexNegative)));
    }

}
