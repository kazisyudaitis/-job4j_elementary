package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort5Numbers() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[] {9, 7, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort9Numbers() {
        int[] data = new int[] {9, 7, 8, 1, 5, 4, 6, 2, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }
}