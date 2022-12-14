package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[index] != word[word.length - post.length + index]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'o'};
        System.out.println(endsWith(word, post));
    }
}

