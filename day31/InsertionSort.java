package com.algorithms.day31;

public class InsertionSort {
    public void quick(int[] a, int x, int y) {

        int i, j, temp, pivot, mid;
        i = x;
        j = y;

        mid = (i + j) / 2;
        pivot = a[mid];

        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        if (j > x) {
            quick(a, x, j);
        }
        if (i < y) {
            quick(a, i, y);
        }
    }
}
