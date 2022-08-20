package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAndDevide(double first, double second) {
        return difference(first, second) + devide(first, second);
    }

    public static double sumAndMultiplyAndDifferenceAndDevide(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second)
                + devide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма операций: разности двух чисел и деление двух чисел " + differenceAndDevide(10, 20));
        System.out.println("Сумма операций: сумма двух чисел, умножение двух чисел, разность двух чисел, деление двух чисел " + sumAndMultiplyAndDifferenceAndDevide(10, 20));
    }

}
