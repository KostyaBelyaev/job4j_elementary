package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2025to40017then380dot08() {
        double expected = 380.084;
        int x1 = 20;
        int y1 = 25;
        int x2 = 400;
        int y2 = 17;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when218to3143then125dot00() {
        double expected = 125.0;
        int x1 = 2;
        int y1 = 18;
        int x2 = 3;
        int y2 = 143;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

}
