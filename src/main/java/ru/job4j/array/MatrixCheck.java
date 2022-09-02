package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] boart, int row) {
        boolean result = true;
        for (int i = 0; i < boart[row].length; i++) {
            if (boart[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] boart, int column) {
        boolean result = true;
        for (int i = 0; i < boart.length; i++) {
            if (boart[i][column] != 'X') {
                result = false;
                break;
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

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X' && (monoHorizontal(board, index) || monoVertical(board, index))) {
                result = true;
                break;
            }
        }
        return result;
    }

}


