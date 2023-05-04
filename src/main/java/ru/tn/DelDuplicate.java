package ru.tn;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;


public class DelDuplicate {
    public static <T extends Number> T[] removeDuplicates(T[] arr) {
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[uniqueCount++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, uniqueCount);
    }
}