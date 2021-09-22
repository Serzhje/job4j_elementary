package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas99Then5() {
        int[] data = {56, 34, 11, 89, 2, 99, 567, 123};
        int el = 99;
        int result = FindLoop.indexOf(data, el);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayNoHas3ThenNegative1() {
        int[] data = {6, 4, 1, 89, 88, 55, 5, 1156};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}