package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl = rsl + array[i][j];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {10}, {5, 7}, {3, 7, 9}};
        System.out.println(sum(array));
    }
}
