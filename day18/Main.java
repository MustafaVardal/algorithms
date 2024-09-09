package com.algorithms.day18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*double i = 3, sum = 1, n, k;

        System.out.println("Enter the n: ");
        n = scanner.nextInt();

        for (k=1 ; k <n ; k++) {
            if (k %2 ==1){
                sum = sum -1/i;
            }
            else {
                sum = sum +1/i;
            }
            i = i +2;
        }
        System.out.println(sum);*/




        //NEW QUESTION



       /* double x, n, fac, i, j, t = 1;
        System.out.println("Enter the n: ");
        n = scanner.nextDouble();
        System.out.println("Enter the x: ");
        x = scanner.nextDouble();

        for (i = 1; i <= n - 1; i++) { // n-1 means we will get 2 equation per times.
            fac = 1;
            for (j = 1; j <= 2 * i; j++) { // This value of j should be less than or equal 2*i
                fac = fac * j;
                // fac should be independence value instead equation. because if we depend on the equation it will start the more complex structure.

            }
            t = t + Math.pow(-1, i) * Math.pow(x, (2 * i)) / fac;
            // Important part! first loop return this equation for first 2 equation of cos func.

        }
        System.out.println(t);*/


        //NEW QUESTION



        double n, sum = 0, i, j, f1 = 1, f2 = 1;
        System.out.println("Enter the n: ");
        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                f1 = f1 * j;
            }
            for (j = 1; j <= (n - i); j++) {
                f2 = f2 * j;
            }

            sum = sum + ((1 / f1) + (i / f2));
        }
        System.out.println("Sum: " + sum);

    }
}
