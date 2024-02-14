package org.example;

import java.util.Arrays;

public class Example {
    //дано 2 массива уникальных значений, вывести третий в котором
    // будут храниться только уникальные совпадения с первых двух массивов.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getIntersections(new int[]{1,3, 5, 8, 8, 4,6}, new int[]{2,5,6,8,1,9,2,0})));

    }

    public static int[] getIntersections(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    result[count] = array1[i];
                    count++;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }

}
