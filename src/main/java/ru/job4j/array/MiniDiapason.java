package ru.job4j.array;

public class MiniDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {2, 5, 1, 0, 7, 9, 54, 3};
        int start = 4;
        int finish = 6;
        System.out.println(findMin(array, start, finish));
    }
}
