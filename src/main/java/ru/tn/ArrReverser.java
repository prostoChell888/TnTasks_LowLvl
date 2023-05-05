package ru.tn;

import java.util.Arrays;

public class ArrReverser {
     public static <T> T[] revers(T[] arr) {
        var newArr = arr.clone();
        int left = 0;
        int right = newArr.length - 1;

        while (left < right) {
            var temp = newArr[left];
            newArr[left] = newArr[right];
            newArr[right] = temp;

            left++;
            right--;
        }

        return newArr;
    }

}