package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double rsl = Math.sqrt(fifth);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 100, 10);
        System.out.println("result(0, 0) to (100, 0) " + result);
        result = Point.distance(20, 25, 400, 17);
        System.out.println("result(20, 25) to (400, 17) " + result);
        result = Point.distance(2, 18, 3, 143);
        System.out.println("result(2, 18) to (3, 143) " + result);
    }
}
