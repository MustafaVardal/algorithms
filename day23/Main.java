package com.algorithms.day23;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*int n;
        System.out.println("Enter the length of String:  ");
        n = scanner.nextInt();
        char[] arr = new char[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter character: " + (i + 1) + ": ");
            arr[i] = scanner.next().charAt(0);
        }

        boolean isPolindrome = true;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (arr[left] != arr[right]) {
                isPolindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPolindrome) {
            System.out.println("The string is a polindrome. ");
        } else {
            System.out.println("The string is not a polindrome. ");
        }*/


        // ANOTHER QUESTION

      /*
        int [] numbers = new int[]{1, 2, 3, 4, 5};
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of array numbers : " + sum);*/


        // ANOTHER QUESTION


      /*  int n;
        int[] numbers;
        int number;
        int count = 0;
        System.out.println("Please enter which number you want to add array: ");
        n = scanner.nextInt();
        numbers = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " . number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Please enter what number you want to compare with array's number: ");
        number = scanner.nextInt();

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]< number){
                count = count +1;
            }
        }
        System.out.println(number + " is greater than " + count + " of numbers in the specified array.");
*/

        // ANOTHER QUESTION

        int n;
        int number;
        System.out.println("Please enter how many elements you want to enter: ");
        n = scanner.nextInt();
        int[] numbers = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: ");
            number = scanner.nextInt();
            numbers[i] = number;
        }

        int mid = n / 2;
        int temp;
        for (int i = 0; i <= mid; i++) {
            temp = numbers[i];
            numbers[i] = numbers[n - i];
            numbers[n - i] = temp;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(numbers[i]);
        }


    }
}
