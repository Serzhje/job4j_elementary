package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3To6() {
        int[] input = {2, 45, 67, 12, 89, 1, 72, 99};
        int source = 3;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 45, 67, 72, 89, 1, 12, 99};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2To7() {
        int[] input = {23, 5, 7, 123, 29, 11, 732, 999, 85, 21};
        int source = 2;
        int dest = 7;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {23, 5, 999, 123, 29, 11, 732, 7, 85, 21};
        Assert.assertArrayEquals(expected, result);
    }
}