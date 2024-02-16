package ru.job4j.loop;

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
}
