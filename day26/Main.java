package com.algorithms.day26;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int[][] matrix = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("[" + i + "]" + "[" + j + "]");
                int number = scanner.nextInt();
                matrix[i][j] = number;

            }
        }*/


        // ANOTHER QUESTION

        /*int [][] matrix = new int[2][2];
        int [][] transpose = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]");
                int number = scanner.nextInt();
                matrix[i][j] = number;

            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.println(transpose[i][j]);
            }
        }*/

        int row;
        int column;
        int count=0;
        System.out.println("Please enter the row count: ");
        row = scanner.nextInt();
        System.out.println("Please enter the column count: ");
        column = scanner.nextInt();


        int[][] matrix2D=new int[row][column];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]");
                matrix2D[i][j] = scanner.nextInt();
            }
        }

        int n = row * column;
        int[] oneD = new int[n];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                oneD[count] = matrix2D[i][j];
                count++;


            }
        }
        System.out.println(Arrays.toString(oneD));
        //System.out.println(count);

    }
}
