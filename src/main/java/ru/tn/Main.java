package ru.tn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 1, 2, 5, 6, 3, 4};
        Integer[] result1 = DelDuplicate.removeDuplicates(arr1);
        System.out.println(Arrays.toString(result1));

        String[] arr2 = {"apple", "banana", "cherry", "apple", "banana", "kiwi"};
        String[] result2 = DelDuplicate.removeDuplicates(arr2);
        System.out.println(Arrays.toString(result2));

        Character[] arr3 = {'a', 'b', 'c', 'a', 'b', 'd', 'e', 'c'};
        Character[] result3 = DelDuplicate.removeDuplicates(arr3);
        System.out.println(Arrays.toString(result3));
    }
}
