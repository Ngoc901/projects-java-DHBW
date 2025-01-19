package Matrices;

import java.util.Scanner;

public class MatrixShapes {

    // Method to print a rectangle based on user input
    public static void square(Scanner scanner){
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        String[][] matrix = new String[rows][columns];
        // Filling matrix
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< columns; j++){
                matrix[i][j] = "*";
            }
        }
        // Printing
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to print a simple triangle of stars
    public static void triangle() {
        for(int i = 0; i< 3; i++){
            for(int j = 0; j<= i; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }

    // Method to print a diamond pattern of stars
    public static void diamond() {
        int n = 5; //size of diamond

        // Top half of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i) ; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= 2*i ; j++) {
                System.out.print(" "); // Print spaces
            }

            for (int j = 0; j < (n-i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half of the diamond
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j <= 2*(n-i) ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Method to print a Christmas tree based on user input
    public static void christmasTree(Scanner scanner) {
        System.out.print("Enter the height of the tree: "); // Get height of the tree
        int height = scanner.nextInt();

        // Print the tree
        for(int i = 0; i< height-1; i++){
            for(int j = 0; j< height - i -1; j++){
                System.err.print(" "); // Print spaces
            }
            for(int j = 0; j< 2*i+1; j++){
                System.out.print("*"); // Print stars
            }
            System.out.println();
        }
        // Print the tree trunk
        for(int i = 0; i<2; i++){
            for(int j = 0; j< height -1; j++){
                System.err.print(" ");
            }
            System.out.println("*");
        }
    }
}
