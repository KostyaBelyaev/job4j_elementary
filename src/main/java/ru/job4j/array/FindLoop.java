package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
           if (data[index] == el) {
               rst = index;
           }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] data = new int[] {4, 7, 8, 34, 67, 88, 12, 34};
        System.out.println(indexOf(data, 4));
        System.out.println();
        System.out.println(indexInRange(data, 88, 0, 5));
    }
}

