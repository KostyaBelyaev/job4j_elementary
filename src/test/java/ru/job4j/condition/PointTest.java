package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2025to40017then380dot08() {
        double expected = 380.084;
        Point a = new Point(20, 25);
        Point b = new Point(400, 17);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when218to3143then125dot00() {
        double expected = 125.0;
        Point a = new Point(2, 18);
        Point b = new Point(3, 143);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}
