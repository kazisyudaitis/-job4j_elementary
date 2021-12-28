package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int index = 1; index <= n; index++) {
            if (result <= 1) {
                result = 1;
            }
            result *= index;
        }
        if (n == 0) {
            return 1;
        }
        return result;
    }
}
