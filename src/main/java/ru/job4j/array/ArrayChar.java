package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int j = i; j < pref.length; j++) {
                if (word[i] != pref[j]) {
                    result = false;
                    break;
                }
                break;
            }
        }
        return result;
    }
}
