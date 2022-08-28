package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvanAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expected = new int[] {4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {2, 4, 6, 8, 10};
        int[] result = Turn.back(input);
        int[] expected = new int[] {10, 8, 6, 4, 2};
        assertThat(result).containsExactly(expected);
    }
}
