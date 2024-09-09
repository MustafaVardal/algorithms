package com.algorithms.day29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Bubble Sort  O(n^2)

        /*int[] array = new int[10];
        int number;
        int temp;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number: ");
            array[i]= scanner.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }*/



        // Selection Sort O(n^2)


        int[] numbers = {10,1,9,2,8,3};
        int min, temp, n=6, index;

        for (int i = 0; i < n-1; i++) {
            min = numbers[i];
            index =i;
            for (int j = i+1; j <n ; j++) {
                if (numbers[j]<min){
                    min= numbers[j];
                    index = j;
                }
            }

            temp = numbers[i];
            numbers[i] = min;
            numbers[index] = temp;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }
    }
}
