package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number > 1) {
            for (int index = 2; index <= number - 1; index++) {
                if (number % index == 0) {
                    prime = false;
                    break;
                }
            }
        } else {
            prime = false;
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(1));
        System.out.println(check(4));
        System.out.println(check(5));
    }
}
