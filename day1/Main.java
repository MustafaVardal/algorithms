package com.algorithms.day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SUM OF TWO NUMBERS
        /*Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Please enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        b = scanner.nextInt();

        a = a + b;

        System.out.println("Your calculation total result = " + a);*/
        // NUMBER OF SQUARE
        /*Scanner scanner = new Scanner(System.in);
        int c;
        System.out.println("Please enter a number: ");
        c = scanner.nextInt();
        c *= c;
        System.out.println("Your square of value of number: " + c);*/


        // Average score of student
        /*Scanner scanner = new Scanner(System.in);
        double point1, point2, project;
        System.out.println("Enter the first exam score: ");
        point1 = scanner.nextDouble();
        System.out.println("Enter the second exam score: ");
        point2 = scanner.nextDouble();
        System.out.println("Enter the project score: ");
        project = scanner.nextDouble();

        project = (point1 + point2 + project) /3;
        System.out.println("Your average score is: " + project);*/

        Scanner scanner= new Scanner(System.in);
        int a, b, total;
        System.out.println("First value: ");
        a = scanner.nextInt();
        a *= a;
        System.out.println("First value of square: " + a);
        System.out.println("Second value: ");
        b = scanner.nextInt();
        b *= b;
        System.out.println("Second value of square: " + b);
        total = a+b;
        System.out.println("Total of these values: " + total);
        System.out.println(43.4 *4);

    }
}
