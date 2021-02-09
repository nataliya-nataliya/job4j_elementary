package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(7, 5, 6);
        assertThat(result, is(7));
    }

    @Test
    public void whenSecond1Max() {
        int result = MultiMax.max(0, 3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(2, 8, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenEqualMax() {
        int result = MultiMax.max(7, 7, 7);
        assertThat(result, is(7));
    }
}