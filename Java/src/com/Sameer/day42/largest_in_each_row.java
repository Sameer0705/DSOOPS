package com.Sameer.day42;

public class largest_in_each_row {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 48, 3},
                {8, 2, 9},
                {96, 6, 74}
        };
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
