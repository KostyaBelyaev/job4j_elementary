package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPossitive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !(num % 2 == 0);
    }

    public static boolean notPossitive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPossitive(int num) {
        return !(num % 2 == 0) & num > 0;
    }

    public static boolean evenOrNotPossitive(int num) {
        return num % 2 == 0 | !(num > 0);
    }

    public static void main(String[] args) {
        boolean rsl = LogicNot.isEven(4);
        System.out.println(rsl);
        rsl = LogicNot.isPossitive(-6);
        System.out.println(rsl);
        rsl = LogicNot.notEven(5);
        System.out.println(rsl);
        rsl = LogicNot.notPossitive(-3);
        System.out.println(rsl);
        rsl = LogicNot.notEvenAndPossitive(-7);
        System.out.println(rsl);
        rsl = LogicNot.evenOrNotPossitive(9);
        System.out.println(rsl);
    }
}

