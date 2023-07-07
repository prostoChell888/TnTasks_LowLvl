package ru.tn;

import java.util.*;


public class DelDuplicate {

    static class Pair<T extends Comparable<T>> {
        Integer position;
        T element;

        public Pair(int position, T element) {
            this.position = position;
            this.element = element;
        }
    }


    public static <T extends Comparable<T>> T[] removeDuplicates(T[] arr) {
        var newArr = Arrays.copyOf(arr, arr.length);
        if (newArr.length < 2) return newArr;

        Pair<T>[] elementsWithSavedPositions = savePos(newArr);
        Pair<T>[] sortedArrWithUniqueElements = sortArrAndDelDuplicates(elementsWithSavedPositions);
        getArrWithOriginPos(newArr, sortedArrWithUniqueElements);

        return Arrays.copyOf(newArr, sortedArrWithUniqueElements.length);
    }

    private static <T extends Comparable<T>> void getArrWithOriginPos(T[] newArr, Pair<T>[] sortedArrWithUniqueElements) {
        Arrays.sort(sortedArrWithUniqueElements, Comparator.comparing(o -> o.position));
        for (int i = 0; i < sortedArrWithUniqueElements.length; i++) {
            newArr[i] = sortedArrWithUniqueElements[i].element;
        }
    }

    private static <T extends Comparable<T>> Pair<T>[] sortArrAndDelDuplicates(Pair<T>[] elementsWithSavedPositions) {
        Arrays.sort(elementsWithSavedPositions, (o1, o2) -> {
            var resOfCompElComp = o1.element.compareTo(o2.element);
            if (resOfCompElComp == 0) {
                return o1.position.compareTo(o2.position);
            }
            return resOfCompElComp;
        });
        int posOfNewArr = 0;

        return dellDuplicateInSortedArr(elementsWithSavedPositions, posOfNewArr);
    }

    private static <T extends Comparable<T>> Pair<T>[] dellDuplicateInSortedArr(Pair<T>[] elementsWithSavedPositions, int posOfNewArr) {
        for (int i = 0; i < elementsWithSavedPositions.length - 1; i++) {
            if (!elementsWithSavedPositions[i].element.equals(elementsWithSavedPositions[i + 1].element)) {
                elementsWithSavedPositions[posOfNewArr] = elementsWithSavedPositions[i];
                posOfNewArr++;
            }
        }
        elementsWithSavedPositions[posOfNewArr++] = elementsWithSavedPositions[elementsWithSavedPositions.length - 1];

        return Arrays.copyOf(elementsWithSavedPositions, posOfNewArr);
    }

    private static <T extends Comparable<T>> Pair<T>[] savePos(T[] arr) {
        Pair<T>[] elementsWithSavedPositions = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            elementsWithSavedPositions[i] = new Pair<T>(i, arr[i]);
        }
        return elementsWithSavedPositions;
    }
}