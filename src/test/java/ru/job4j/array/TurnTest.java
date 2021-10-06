package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {6, 9, 8, 22, 45, 89, 76};
        int[] result = Turn.back(input);
        int[] expected = new int[] {76, 89, 45, 22, 8, 9, 6};
        Assert.assertArrayEquals(expected, result);

    }
}