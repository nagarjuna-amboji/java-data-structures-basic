package io.amigos.ds;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _2DArrays {

    public static void main(String[] args) {

        System.out.println(" Welcome to learning 2D Arrays ... ");

        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println(" Print the elements in a 2D Array: ");
        System.out.println(Arrays.deepToString(board));

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        System.out.println(Arrays.deepToString(board));

        System.out.println("Another way to create and initialize and 2DArray..");

        char[][] boardCopy = new char[][] {
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'}
        };

        System.out.println("Printing the boardCopy variable: ");
        System.out.println(Arrays.deepToString(boardCopy));
    }
}
