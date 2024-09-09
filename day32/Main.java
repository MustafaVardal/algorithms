package com.algorithms.day32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MergeSorted sorted = new MergeSorted();
        int n = 10;
        int[] arr = new int[n];
        int[] temp = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.println(i + ". enter number: ");
            arr[i]= scanner.nextInt();
        }

        sorted.mergeSort(arr, temp, n);
        System.out.println("Sorting process is successfully completed.");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
