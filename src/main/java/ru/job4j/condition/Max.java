package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean can = left > right;
        return can ? left : right;
    }

    public static void main(String[] args) {
        int rsl = Max.max(13, 5);
       System.out.println(rsl);
    }
}
