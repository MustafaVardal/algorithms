package com.algorithms.day16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      /*  int a, tradeValue, b;

        System.out.println("Enter the number: ");
        a = scanner.nextInt();
        tradeValue = 0;
        while (a != 0) {
            b = a - a / 10 * 10;
            if (tradeValue < b){
                tradeValue =b;
            }
            a = a / 10;
        }
        System.out.println(tradeValue);*/

        // 2. WAY
        /*for (int  i = 0;  i <= a;  i++) {
            if (a ==0){
                b = a -a / 10 *10;
                if (tradeValue < b){
                    tradeValue = b;
                }
                a = a /10;
            }
        }

        System.out.println(tradeValue);*/


        //ANOTHER QUESTION

        /*int number, fac=1,i=1;
        System.out.println("Enter the number: ");
        number = scanner.nextInt();


            if (number >= 5 && number <= 10){
                System.out.println(number * number);
            }   else if (number <5) {
               while (i <= number){
                fac = fac *i;
                i++;
            }
                System.out.println(fac);
        } else if (number > 10) {
                System.out.println((number/2)-1);
            }*/


        //ANOTHER QUESTION

      /*  double degree, radian, grad, pi = 3.14;
        System.out.println("Enter the degree: ");
        degree = scanner.nextDouble();

        radian = (degree*pi) /180;
        grad = (radian * 200) /pi;

        System.out.println("Radian : " + radian + "\nGrad: " + grad);*/

        //ANOTHER QUESTION

        /*int a, lowerValue, upperValue, temp, i, avg, diff, b;
        System.out.println("Enter compareable value: ");
        a = scanner.nextInt();
        lowerValue = a;
        upperValue = a;
        temp = a;
        i = 2;
        for (int j = 1; j < 10; j++) {
            System.out.println("Enter the "+ j +". value: ");
            a = scanner.nextInt();
            if (lowerValue > a) {
                lowerValue = a;
            } else if (upperValue < a) {
                upperValue = a;
            }
            temp = temp + a;
        }

        b = (upperValue + lowerValue) /2;
        avg = temp /10;
        diff = avg -b;
        System.out.println(diff);*/


        //ANOTHER QUESTION

        int k, count = 0, max = 0, div = 0;
        System.out.println("Enter the number: ");
        k = scanner.nextInt();
        while (k != 1) {
            count++;
            if (k % 2 == 1) {
                k = (k * 3) + 1;
                count++;
                div = 0;
            } else {
                if (div < k) {
                    div = k;
                } else {
                    k = k / 2;
                }
                if (max < k) {
                    max = k;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Calculation step: " + count);
        System.out.println("Last even number: " + div);


    }
}
