package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean can = left > right;
        return can ? left : right;
    }

    public static int max(int left, int right, int top) {

        return max(left,
                max(right, top)
        );
    }

    public static int max(int left, int right, int top, int bottom) {

        return max(left,
                max(right, top, bottom)
        );
    }

    public static void main(String[] args) {
        int rsl = Max.max(13, 5);
       System.out.println(rsl);
    }
}
