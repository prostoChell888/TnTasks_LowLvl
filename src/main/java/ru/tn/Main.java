package ru.tn;



public class Main {
    public static void main(String[] args) {

        String str1 = "level";
        boolean isPalindromeStr1 = PalindromeChecker.isPalindrome(str1);
        System.out.println(str1 + " is a palindrome: " + isPalindromeStr1);


        int num1 = 12321;
        boolean isPalindromeNum1 = PalindromeChecker.isPalindrome(num1);
        System.out.println(num1 + " is a palindrome: " + isPalindromeNum1);


        String str2 = "hello";
        boolean isPalindromeStr2 = PalindromeChecker.isPalindrome(str2);
        System.out.println(str2 + " is a palindrome: " + isPalindromeStr2);

        int num2 = 12345;
        boolean isPalindromeNum2 = PalindromeChecker.isPalindrome(num2);
        System.out.println(num2 + " is a palindrome: " + isPalindromeNum2);
    }
}
