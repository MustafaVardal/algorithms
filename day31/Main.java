package com.algorithms.day31;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unsorted: ");
        int[] arr = {10,4,1,6,11,2};
        for (int i = 0; i < 6; i++) {
            System.out.print(" "+arr[i]);
        }

        System.out.println("\nSorted: ");
        InsertionSort insertionSort = new InsertionSort();

       insertionSort.quick(arr,0,5);

        for (int i = 0; i < 6; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
