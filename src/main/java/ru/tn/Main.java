package ru.tn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        ArrReverser.revers(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"apple", "banana", "cherry", "kiwi"};
        ArrReverser.revers(arr2);
        System.out.println(Arrays.toString(arr2));

        Character[] arr3 = {'a', 'b', 'c', 'd', 'e'};
        ArrReverser.revers(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
