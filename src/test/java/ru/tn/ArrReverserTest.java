package ru.tn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
class ArrReverserTest {

    @ParameterizedTest
    @MethodSource("provideDoubleArrays")
    void revers_ObjectArr_ReversObjectArr(Object[] input, Object[] expectedOutput) {
        var reversArr = ArrReverser.revers(input);

        assertArrayEquals(expectedOutput, reversArr);
    }


    static Stream<Arguments> provideDoubleArrays() {
        var objAar = new Object[] {new StringBuilder("1"), new ArrayList<>(), 3, "4", 5.0};

        return Stream.of(
                Arguments.of(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, new Double[]{5.0, 4.0, 3.0, 2.0, 1.0}),
                Arguments.of(objAar, new Object[] { objAar[4], objAar[3], objAar[2], objAar[1], objAar[0]}),
                Arguments.of(new Double[]{}, new Double[]{})
        );
    }

}