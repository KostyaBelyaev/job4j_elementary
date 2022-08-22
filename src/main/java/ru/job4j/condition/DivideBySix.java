package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl = "";
        if (number % 2 == 0 && number % 3 == 0) {
            rsl = "Ishodnoe chislo delitsya na 6.";
        } else if (number % 3 == 0 && number % 2 != 2) {
            rsl = "Ishodnoe chislo delitsya na 3, no ne yavlyaetsya chetnym.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "Ishodnoe chislo ne delitsya na 3, no yavlyaetsya chetnym.";
        } else if (number % 3 != 0 && number % 2 != 0) {
            rsl = "Ishodnoe chislo ne delitsya na 3 i  ne yavlyaetsya chetnym.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(18));
        System.out.println(checkNumber(27));
        System.out.println(checkNumber(10));
        System.out.println(checkNumber(11));
    }
}

