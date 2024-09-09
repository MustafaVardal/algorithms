package com.algorithms.day20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int i;
        int n;
        System.out.println("How many characters long would you like to enter? ");
        n = scanner.nextInt();
        String[] arr = new String[n + 1];
        for (i = 1; i <= n; i++) {
            System.out.print(i + ". character enter: ");
            arr[i] = scanner.next();
        }
        System.out.println("Exist word now: ");

        for (i = 1; i <= n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Here is the reverse side of word: ");

        for (i = n; i >=1 ; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();*/


        // NEW QUESTION

/*
        int[] arr = new int[8];
        int number, i;
        System.out.println("Enter which number you want to convert from decimal to binary: ");
        number = scanner.nextInt();
        for (i = 0; i < 8; i++) {
            arr[i] = number % 2;
            number = number / 2;
            if (number < 2) {
                i = i + 1;
                arr[i] = number;
                break;
            }
        }
        while (i > -1) {

            System.out.println(arr[i]);
            i--;
            System.out.println();
        }*/


        // NEW QUESTION:

       /* int [] arr = new int[11];
        int x=0;
        int i=1;
        int lowest;

        System.out.println(i+ " . element : ");
        arr[1] = scanner.nextInt();
        lowest = arr[1];

        for (i = 2; i <= 10 ; i++) {
            System.out.println(i + ". element: ");
            arr[i] = scanner.nextInt();
            if (lowest > arr[i]){
                lowest = arr[i];
                x = i +1;
            }
        }
        System.out.println("Lowest element " + x +" order line.");*/


        int n = 6;
        int[] arr = new int[6];
        int i;

        for ( i = 1; i < n; i++) {
            System.out.println("Enter the number: ");
            arr[i] = scanner.nextInt();

            if ((n-1) != i){
                System.out.println("Sayiyi giriniz: ");
                arr[n-1] = scanner.nextInt();
                n = n -1;
            }
        }
        n =6;
        for (i = 1; i < n; i++) {
            System.out.println(arr[i]);
        }



    }
}
