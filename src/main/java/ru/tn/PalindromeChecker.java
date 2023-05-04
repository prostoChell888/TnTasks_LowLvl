package ru.tn;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        if(str == null) return false;
        if (str.length() < 2 ) return true;

        str = str.toLowerCase();
        for (int i= 0; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
