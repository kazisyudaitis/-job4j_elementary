package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int source;
        for (int index = 0; index < array.length; index++) {
           source = array[index];
           if (index == 0) {
               array[index] = array[array.length - 1];
               array[array.length - 1] = source;
           } else if (index < array.length / 2) {
               array[index] = array[array.length - (1 + index)];
               array[array.length - (1 + index)] = source;
           }
        }
        return array;
    }
}
