package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1Then1() {
        int first = 1;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int first = 2;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1And3Then3() {
        int first = 2;
        int second = 1;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1And3And5Then5() {
        int first = 2;
        int second = 1;
        int third = 3;
        int four = 5;
        int result = Max.max(first, second, third, four);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}