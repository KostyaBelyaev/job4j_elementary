package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {90, 4, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 8, 90};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortMinus5() {
        int[] data = new int[] {-5, -4, -8, -12, -1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-12, -8, -5, -4, -1};
        assertThat(result).containsExactly(expected);
    }
}