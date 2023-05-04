package ru.tn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @ParameterizedTest
    @ValueSource(strings = { "assa", "qqnqq", "q", "йййцййй", "", "1234a5a4321", "aaAA", ".AsAsA ASASA." })
    void IsPalindrome_StrIsPalindrome_True(String input) {
        boolean actualOutput = PalindromeChecker.isPalindrome(input);

        assertTrue(actualOutput);
    }

    @ParameterizedTest
    @ValueSource(strings = { "122", "qw", "qwertyuiop", "йцукенгш", "12", "фщшкоцдаык", "KJGkglHJGjhv" })
    void IsPalindrome_StrIsNotPalindrome_False(String input) {
        boolean actualOutput = PalindromeChecker.isPalindrome(input);

        assertFalse(actualOutput);
    }

    @Test
    void IsPalindrome_StrIsNull_False() {
        String input = null;

        boolean actualOutput = PalindromeChecker.isPalindrome(input);

        assertFalse(actualOutput);
    }

}