package com.Sameer.day44;

import java.util.Arrays;
public class diagonalproduct {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 48, 3},
                {8, 2, 9},
                {96, 6, 74}
        };
        int product=1;
        for (int i = 0; i < matrix.length; i++) {
            product *= matrix[i][i];
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = product;
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}


