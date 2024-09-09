package com.algorithms.day17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* double x, n, t=1, factorial = 1, i=1;
        System.out.println("Enter the number of power: ");
        x = scanner.nextDouble();
        System.out.println("Enter the times of number you want to the function: ");
        n = scanner.nextDouble();*/
        // First WAY
       /* for (i = 1; i <= n ; i++) {
            factorial = factorial * i;
           *//* System.out.println("x: " + x);
            System.out.println("n: " + n);*//*
            t = t + Math.pow(x, i) / factorial;
            *//*System.out.println("i: " + i);
            System.out.println("t: " + t);
            System.out.println("factorial: " + factorial);*//*
        }
        System.out.println(t);*/

        // Second WAY

       /*
       while( i <= n + 1 ){
           factorial = factorial * i;   // factorial because of function will recursion all the time until n times.
           t =  t + (Math.pow(x,i)/factorial); // function of series number of x!
           i++;
       }
       System.out.println("Result of the equation: " + t);
        */

        //NEW QUESTION:
        double n, x, fac = 1, sum = 0, i = 1, j = 1;
        System.out.println("Enter the number of times power and factorial: ");
        n = scanner.nextInt();
        System.out.println("Enter the x constant: ");
        x = scanner.nextInt();

        while (i != n) {
            sum = sum + Math.pow(x, i) / fac;
            for (j = 1; j <= i; j++) {
                fac = fac * j;
            }

            i++;
        }
        System.out.println(sum);

    }
}
