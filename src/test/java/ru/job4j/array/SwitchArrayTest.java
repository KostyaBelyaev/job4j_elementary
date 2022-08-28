package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2To6() {
        int[] input = {4, 7, 9, 0, 12, 34, 65, 76, 44};
        int source = 2;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 7, 65, 0, 12, 34, 9, 76, 44};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap0To7() {
        int[] input = {4, 7, 9, 0, 12, 34, 65, 76, 44};
        int source = 0;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {76, 7, 9, 0, 12, 34, 65, 4, 44};
        assertThat(result).containsExactly(expected);
    }
}
