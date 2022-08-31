package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = {
                {2, -2},
                {8, -7, 5},
                {-4, -3, -2, 9},
                {-1, 0, 0, 0, 88}
        };
        int[][] result = skip(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }

        }
    }
}
