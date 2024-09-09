package com.algorithms.day27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*int[][] a = {{0,1,2},{3,6,7}, {8, 9, 6}};
        int[][] b = {{2,5,4},{6,45,8},{1,2,3}};
        int[][] c = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j]+b[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(c[i][j]);
            }
        }*/

        //ANOTHER EXAMPLE

        Scanner scanner = new Scanner(System.in);


        int[][] arr = new int[5][4];

        for (int i = 0; i < 5; i++) {
            System.out.println("Student No: ");
            arr[i][0]= scanner.nextInt();
            System.out.println("Student's visa score: ");
            arr[i][1]= scanner.nextInt();
            System.out.println("Student's final score: ");
            arr[i][2] = scanner.nextInt();
            arr[i][3] = (int) (arr[i][1]*0.3 + (arr[i][2] *0.7));

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(arr[i][j]);
            }
        }




    }
}
