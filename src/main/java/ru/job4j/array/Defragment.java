package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] != null && point < i) {
                        String swap = array[i];
                        array[i] = array[point];
                        array[point] = swap;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}
