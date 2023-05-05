package ru.tn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StrReverserTest {

    @ParameterizedTest
    @CsvSource({"qwer, rewq", "qweewq, qweewq", "Hello world!, !dlrow olleH",
            "abc, cba", "12345, 54321"})
    void Revers_Str_ReversStr(String input, String expectedOutput) {
        var reversStr = StrReverser.reverse(input);

        assertEquals(expectedOutput, reversStr);
    }


    @Test
    void Revers_BlancStr_ReversStr() {
        String input = "";

        var reversStr = StrReverser.reverse(input);

        assertEquals(input, reversStr);
    }

    @Test
    void Revers_NullStr_ReversStr() {
        String input = null;

        var reversStr = StrReverser.reverse(input);

        assertEquals(input, reversStr);
    }
}