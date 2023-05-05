package ru.tn;

public class StrReverser {
//Данную задачу проще былло бы решить так, но так как решение был бы слишком лехким
//я решил что в данном задании, использование StringBuilder запрещено
//    String reverse(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }

    public static String reverse(String str) {
        if (str == null || str.length() == 0) return str;

        var charArr = str.toCharArray();
        int leftPos = 0;
        int rightPos = str.length() - 1;

        while (leftPos < rightPos) {
            char temp = charArr[leftPos];
            charArr[leftPos] = charArr[rightPos];
            charArr[rightPos] = temp;

            leftPos++;
            rightPos--;
        }

        return new String(charArr);
    }


}