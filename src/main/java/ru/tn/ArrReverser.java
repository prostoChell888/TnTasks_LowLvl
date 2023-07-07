package ru.tn;


public class ArrReverser {

     public static <T> void revers(T[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            var temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

}