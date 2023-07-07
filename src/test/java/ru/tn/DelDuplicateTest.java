package ru.tn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class DelDuplicateTest {

    @ParameterizedTest
    @MethodSource("provideIntegerArrays")
    void testRemoveDuplicates(Integer[] input, Integer[] expectedOutput) {
        Integer[] output = DelDuplicate.removeDuplicates(input);
        assertArrayEquals(expectedOutput, output);
    }

    static Stream<Arguments> provideIntegerArrays() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 4, 5}, new Integer[]{1, 2, 3, 4, 5}),
                Arguments.of(new Integer[]{1, 2, 2, 3, 3, 3, 4, 5, 5}, new Integer[]{1, 2, 3, 4, 5}),
                Arguments.of(new Integer[]{}, new Integer[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("provideDoubleArrays")
    void testRemoveDuplicates(Double[] input, Double[] expectedOutput) {
        Double[] output = DelDuplicate.removeDuplicates(input);
        assertArrayEquals(expectedOutput, output);
    }

    static Stream<Arguments> provideDoubleArrays() {
        return Stream.of(
                Arguments.of(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}),
                Arguments.of(new Double[]{1.0, 2.0, 2.0, 3.0, 3.0, 3.0, 4.0, 5.0, 5.0}, new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}),
                Arguments.of(new Double[]{5.0, 5.0, 4.0, 3.0, 3.0, 3.0, 2.0, 2.0, 1.0}, new Double[]{5.0, 4.0, 3.0, 2.0, 1.0}),
                Arguments.of(new Double[]{4.0, 3.0, 3.0, 3.0, 5.0, 2.0, 5.0, 2.0, 1.0}, new Double[]{4.0, 3.0, 5.0, 2.0, 1.0}),
                Arguments.of(new Double[]{}, new Double[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("provideFloatArrays")
    void testRemoveDuplicates(Float[] input, Float[] expectedOutput) {
        Float[] output = DelDuplicate.removeDuplicates(input);
        assertArrayEquals(expectedOutput, output);
    }

    static Stream<Arguments> provideFloatArrays() {
        return Stream.of(
                Arguments.of(new Float[]{1.1f, 2.0f, 3.0f, 4.0f, 5.0f}, new Float[]{1.1f, 2.0f, 3.0f, 4.0f, 5.0f}),
                Arguments.of(new Float[]{1.1f, 2.0f, 2.0f, 3.0f, 3.0f, 3.0f, 4.0f, 5.0f, 5.0f}, new Float[]{1.1f, 2.0f, 3.0f, 4.0f, 5.0f}),
                Arguments.of(new Float[]{}, new Float[]{})
        );
    }
}