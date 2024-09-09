package com.algorithms.day25;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*String[] arr = new String[20];
        char ch;
        int d = 0, percent, n;
        int i = 0;
        int j = 0;
        int k = 0;
        String[] str = new String[]{String.valueOf('a'), String.valueOf('e'), String.valueOf('i'), String.valueOf('o'), String.valueOf('u')};

        System.out.println("Enter how many character you want to do: ");
        n = scanner.nextInt();
        for ( i = 0; i < n; i++) {
            System.out.println((i+1) + ". letter: ");
            arr[i] = scanner.next();
        }
        for ( j = 0; j <= i; j++) {
            for ( k = 0; k < 5; k++) {
                if (Objects.equals(arr[j], str[k])){
                    d++;
                    break;
                }
            }
        }
        percent = (d *100)/i;
        System.out.println("Percentage of letter: %" + percent);*/


        //ANOTHER QUESTION

       /* int k1 = 0, k2 = 0, k3 = 0, number, n;

        System.out.println("Enter how many number you want to do: ");
        n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". number: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (numbers[i] >= 10) {
                if (numbers[i] >= 100) {
                    if (numbers[i] < 1000) {
                        k3 = k3 + 1;
                    }
                } else {
                    k2 = k2 + 1;
                }
            } else {
                k1 = k1 + 1;
            }
        }

        System.out.println("First(10^0) decimal number of counts: " + k1);
        System.out.println("Second(10^1) decimal number of counts: " + k2);
        System.out.println("Third (10^2)decimal number of counts: " + k3);*/


        //ANOTHER QUESTION


/*
        int n;
        int i =0;
        int j =0;
        int count =0;
        double[] arr = new double[50];
        double[] numbers = new double[50];
        for ( n = 0; n < 2; n++) {
            System.out.println("Enter the numbers: ");
            arr[n] = scanner.nextInt();
        }

        while(i < 2){
            numbers[j] = (arr[i] + arr[i+1])/2;
            j = j+1;
            i = i+2;
            count = count +1;
        }
        for (i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }*/




    }
}
