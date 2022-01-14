package ru.job4j.array;

import com.sun.source.tree.BreakTree;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int i = 0; i < board.length; i++) {
                if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        int index = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != ' ') {
                result = true;
                index = i;
                break;
            }
        }
        if (index > 0) {
            result = monoHorizontal(board, index) || monoVertical(board, index);
        }
        return result;
    }

}
