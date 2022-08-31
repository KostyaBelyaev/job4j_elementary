package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MiniDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            data = SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] array = new int[] {-3, -1, -5};
        int[] result = sort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

