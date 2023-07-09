package ru.tn;


public class Main {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String reversedStr1 = StrReverser.reverse(str1);
        System.out.println(reversedStr1);

        String str2 = "";
        String reversedStr2 = StrReverser.reverse(str2);
        System.out.println(reversedStr2);

        String str3 = "!@#$%^&*";
        String reversedStr3 = StrReverser.reverse(str3);
        System.out.println(reversedStr3);
    }
}
