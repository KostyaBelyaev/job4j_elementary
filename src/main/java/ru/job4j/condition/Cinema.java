package ru.job4j.condition;

public class Cinema {

    public static void acsess(int age) {
        System.out.println("The age of the costumer: " + age);
            if (age >= 18) {
                System.out.println("Welcome to the cinema");
            } else {
                System.out.println("It is not for you");
            }
        }

    public static void main(String[] args) {
        Cinema.acsess(34);
        Cinema.acsess(12);
    }
}

