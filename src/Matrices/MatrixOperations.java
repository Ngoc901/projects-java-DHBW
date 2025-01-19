package Matrices;

import java.util.Scanner;

public class MatrixOperations {

    // Method to print a matrix
    public static void printMatrix(int [][] matrix ){

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("[%d] ", anInt);
            }
            System.err.println();
        }
    }

    // Method to add two matrices
    public static void matrixAddition() {
        int [][] matrix1 = {
                {1, 2,},
                {3, 4,}
        };

        int [][] matrix2 = {
                {1, 1,},
                {1, 1,}
        };

        int[][] matrix3 = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length ; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        printMatrix(matrix3);
    }

    // Method to multiply two matrices
    public static void matrixMultiplication() {
        //2x3
        int [][] matrix1 = {
                {2, 4},
                {3, 4}
        };
        //3x2
        int [][] matrix2 = {
                {1, 2,},
                {1, 3,},
        };
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;

        //2x2
        int [][] matrix3 = new int[row1][col2];

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[0].length; j++) {
                for (int k = 0; k < col1; k++) {
                    matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        printMatrix(matrix3);
    }

    // Transpose the matrix
    public static void matrixTranspose() {
        int [][] matrix1 = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };

        int [][] matrix2 = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix2[i][j] = matrix1[j][i];
            }
        }
        printMatrix(matrix2);
    }
}
