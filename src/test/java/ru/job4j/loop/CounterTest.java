package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.loop.Counter.sumByEven;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromOneToFiveThenSix() {
        int start = 1;
        int finish = 5;
        int result = sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}