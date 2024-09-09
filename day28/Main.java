package com.algorithms.day28;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // SEQUENTIAL SEARCH ALGORITHM
       /* int[] arr ={11,34,4,7,3,20};
        System.out.println("Please enter the searching number: ");

        int search = scanner.nextInt();
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i] == search){
                System.out.println((i+1) + ". element ");
                if (arr[i] != search) {
                    System.out.println("Not Found");
                }
            }
            if (arr[i] != search) {
                System.out.println("Not Found");
            }
        }*/

        // Another way

       /* if (Arrays.stream(arr).noneMatch(i -> i == search)){
            System.out.println("Not Found");
        }*/

        // Another way.

        /*boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search){
                found = true;
                System.out.println("Location: " + i);
                break;
            }
        }
        if (!found){
            System.out.println("Not Found.");
        }*/

        //BINARY SEARCH ALGORITHMS

        int search;
        int[] arr = {1, 3, 5, 7, 9};
        int first = 0;
        int last = arr.length;

        System.out.println("Please enter the search number : ");
        search = scanner.nextInt();

        while (true) {
            int i = (first + last) / 2;
            if (arr[i] == search) {
                System.out.println((i + 1) + " . element");
                break;
            } else if (arr[i] > search) {
                last = i;
            } else {
                first = i;
            }

            System.out.println("Not found.");
            break;
        }

    }
}

