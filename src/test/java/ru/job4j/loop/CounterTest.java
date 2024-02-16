package ru.job4j.loop;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStar1Finish3Then6() {
        int expected = 6;
        int result = Counter.sum(1, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTestStar10Finish3Then0() {
        int expected = 0;
        int result = Counter.sum(10, 3);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStar1Finish10Then30() {
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Disabled
    @Test
    void whenStarMinus2Finish4Then() {
        int result = Counter.sumByEven(-2, 4);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}
