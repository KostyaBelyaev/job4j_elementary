package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To7Then5() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To4To2Then7() {
        int first = 7;
        int second = 4;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To4To8Then8() {
        int first = 1;
        int second = 4;
        int third = 8;
        int result = Max.max(first, second, third);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To6To12To18Then18() {
        int first = 3;
        int second = 6;
        int third = 12;
        int fourth = 18;
        int result = Max.max(first, second, third, fourth);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To36To12To18Then18() {
        int first = 3;
        int second = 36;
        int third = 12;
        int fourth = 18;
        int result = Max.max(first, second, third, fourth);
        int expected = 36;
        assertThat(result).isEqualTo(expected);
    }

}


