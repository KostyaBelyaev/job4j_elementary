package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] boart, int row) {
        boolean result = true;
        for (int i = row; i < row + 1; i++) {
            for (int cell = 0; cell < boart[i].length; cell++) {
                if (boart[i][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] boart, int column) {
        boolean result = true;
        for (int i = 0; i < boart.length; i++) {
            for (int cell = column; cell <= column; cell++) {
                if (boart[i][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static void main(String[]args) {
            char[][] boart = {
                    {'X', ' ', ' '},
                    {'X', 'X', 'X'},
                    {'X', ' ', 'X'},
                    {'X', ' '},
                    {'X', 'X'},
                    {'X', 'X'}
            };
            System.out.println(monoHorizontal(boart, 5));
            System.out.println();
            System.out.println(monoVertical(boart, 1));
        System.out.println();
            char[][] array = {
                    {'X', ' ', ' '},
                    {' ', 'X', ' '},
                    {' ', ' ', 'X'}
            };
            char[] rsl = extractDiagonal(array);
            for (int i = 0; i < rsl.length; i++) {
                System.out.print(rsl[i]);
            }
    }
}

