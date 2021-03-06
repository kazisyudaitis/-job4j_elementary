package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

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
    public void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To3Then4() {
        int left = 1;
        int right = 2;
        int top = 4;
        int result = Max.max(left, right, top);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To4Then7() {
        int left = 1;
        int right = 2;
        int top = 5;
        int bottom = 7;
        int result = Max.max(left, right, top, bottom);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}