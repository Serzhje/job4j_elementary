package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax9To5Then9() {
        int left = 9;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To8Then8() {
        int left = 4;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}