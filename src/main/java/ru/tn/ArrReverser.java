package ru.tn;

import java.util.Arrays;

public class ArrReverser {
     public static <T> T[] revers(T[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            var temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }

}