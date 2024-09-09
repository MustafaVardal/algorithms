package com.algorithms.day14;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int a, b, c;
        System.out.println("Enter the corner of triangle:");
        a = scanner.nextInt();
        System.out.println("Enter the corner of triangle:");
        b = scanner.nextInt();
        System.out.println("Enter the corner of triangle:");
        c = scanner.nextInt();

        if (a == b) {
            if (b == c) {
                System.out.println("Equilateral triangle");

            } else {
                System.out.println("Isosceles triangle");
            }
        } else {
            if (a == c) {
                System.out.println("Isosceles triangle");
            }
            if (b == c) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        }*/

        // ANOTHER QUESTION

        /*double x, a, b;
        double i=0;
        x = scanner.nextDouble();

        while (true) {
            if (i * i > x) {
                b = i * i;
                a = (i - 1) * (i - 1);
                break;

            } else {
                i++;
            }
        }
        x = (i - 1) + ((x - a) / (b - x));
        System.out.println(x);*/

        // ANOTHER QUESTION
        /*
        int n1, n2, x, y, lcm;
        System.out.println("Enter the first value of numbers: ");
        n1 = scanner.nextInt();
        System.out.println("Enter the second value of numbers: ");
        n2 = scanner.nextInt();


       x = n1;
        y = n2;
        while (n1 != n2) {
            if ((n1 > n2)) {
                n1 = n1 - n2;
                break;
            } else if (n2 > n1) {
                n2 = n2 - n1;
                break;
            }
        }
        System.out.println("Gcd: " + n1);
        lcm = (x * y) / n1;
        System.out.println("Lcm: " + lcm);
        */


        // ANOTHER QUESTION

       /* long mult = 1;

        for (long j = 1; j <26 ; j++) {
            System.out.println(j);
            mult = mult * (j*j);


        }
        System.out.println("Multiplation: " +mult);*/

        BigInteger mult = BigInteger.ONE;

        for (long j = 1; j<=25; j++){
            System.out.println();
            mult = mult.multiply(BigInteger.valueOf(j*j));

            System.out.println("Multiplication: " + mult );
        }


    }
}

