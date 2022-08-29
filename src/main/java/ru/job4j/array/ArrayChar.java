package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'e'};
        System.out.println(startsWith(word, pref));
        System.out.println();
        word = new char[] {'H', 'e', 'l', 'l', 'o'};
        pref = new char[] {'G', 'e'};
        System.out.println(startsWith(word, pref));
    }
}
