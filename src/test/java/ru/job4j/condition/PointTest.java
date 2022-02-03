package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        /*double out = Point.distance(x1, y1, x2, y2);*/
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to20then2dot23() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 0);
        double expected = 2.2360;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when53to27then5dot38() {
        Point a = new Point(5, 2);
        Point b = new Point(3, 7);
        double expected = 5.38;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to21then2dot23() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 1);
        double expected = 2.23;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to31to00then2dot23() {
        Point c = new Point(0, 3, 0);
        Point d = new Point(1, 1, 0);
        double expected = 2.23;
        double out = c.distance3d(d);
        Assert.assertEquals(expected, out, 0.01);
    }
}