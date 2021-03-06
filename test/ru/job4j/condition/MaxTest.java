package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To10Then10() {
        int result = Max.max(3, 10);
        assertThat(result, is(10));
    }
    @Test
    public void whenMax5To2Then5() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax7To7Then7() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax0To3To2Then3() {
        int result = Max.max(0, 3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax0To1To7To2Then7() {
        int result = Max.max(0, 1, 7, 2);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax0To1To2To7Then7() {
        int result = Max.max(0, 1, 2, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax7To0To1To2Then7() {
        int result = Max.max(7, 0, 1, 2);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax0To7To1To2Then7() {
        int result = Max.max(0, 7, 1, 2);
        assertThat(result, is(7));
    }
}