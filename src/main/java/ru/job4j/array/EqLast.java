package ru.job4j.array;

public class EqLast {
    public static boolean chek(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        int[] left = new int[] {1, 3, 5};
        int[] right = new int[] {4, 6, 5};
        System.out.println(chek(left, right));
        System.out.println();
        left = new int[] {5, 5, 8};
        right = new int[] {5, 7, 9};
        System.out.println(chek(left, right));
    }
}


