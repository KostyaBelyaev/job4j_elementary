package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array.length - 1 - index;
            int currentIndex = index;
            result[currentIndex] = array[lastIndex];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] rsl = rollback(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}
