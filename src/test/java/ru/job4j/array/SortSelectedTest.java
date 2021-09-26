package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5element() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3element() {
        int[] data = new int[] {55, 98, 21};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {21, 55, 98};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf10element() {
        int[] data = new int[] {76, 1, 45, -21, 90, 123, 53, 1, 89, 34};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-21, 1, 1, 34, 45, 53, 76, 89, 90, 123};
        Assert.assertArrayEquals(expected, result);
    }
}