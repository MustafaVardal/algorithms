package com.algorithms.day24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int num1, num2, nNum;
        int sum;
        int atHand = 0;
        System.out.println("Please enter how many binary decimal numbers are you working on it: ");
        nNum = scanner.nextInt();
        int[] numbers1 = new int[nNum];
        int[] numbers2 = new int[nNum];
        int[] atHandNumber = new int[nNum + 2];
        for (int i = 0; i < nNum; i++) {
            System.out.println("Please enter the first number of " + (i + 1) + ". number: ");
            num1 = scanner.nextInt();
            numbers1[i] = num1;
        }
        for (int i = 0; i < nNum; i++) {
            System.out.println("Please enter the second number of " + (i + 1) + ". number: ");
            num2 = scanner.nextInt();
            numbers2[i] = num2;
        }

        for (int i = nNum - 1; i >= 0; i--) {
            sum = numbers1[i] + numbers2[i] + atHand;
            atHand = sum / 2;
            atHandNumber[i + 1] = sum % 2;
        }
        System.out.println();
        int i = 0;
        atHandNumber[i] = atHand;

        for (i = 0; i <= nNum; i++) {
            System.out.println(atHandNumber[i]);
        }*/


        // ANOTHER QUESTION

       /* int biggestNum, lowestNum, bigLoc = 1, lowLoc = 1;
        int i=0;
        int[] numbers = new int[10];

        System.out.println("Please enter "+(i+1)+". number: ");
        numbers[i] = scanner.nextInt();
        biggestNum = numbers[i];
        lowestNum = numbers[i];

        for ( i = 1; i < 10; i++) {
            System.out.println("Please enter "+(i+1)+". number: ");
            numbers[i] = scanner.nextInt();

            if (numbers[i]> biggestNum){
                biggestNum = numbers[i];
                bigLoc = i+1;
            }
            if (numbers[i]< lowestNum){
                lowestNum = numbers[i];
                lowLoc = i +1;
            }
        }
        System.out.println();
        System.out.println(bigLoc + ". element the biggest value: " + biggestNum);
        System.out.println();
        System.out.println(lowLoc + ". element the lowest value: " + lowestNum);*/


        // ANOTHER QUESTION

        /*int first, second, i =0;
        int[] arr = new int[15];

        for ( i = 0; i < 15; i++) {
            System.out.println((i+1) +". number : ");
            arr[i] = scanner.nextInt();
        }

        if (arr[0] > arr[1])
        {
            first  = arr[0];
            second = arr[1];
        } else {
            first  = arr[1];
            second = arr[0];
        }

        for (i=2; i<15; i++){
            if (arr[i]> second){
                if (arr[i] > first){
                    second = first;
                    first = arr[i];
                } else {
                    second = arr[i];
                }
            }
        }

        System.out.println("Second biggest element is: " + second);*/


        // ANOTHER QUESTION


        int n = 7, i = 0, j = 1, k;

        int[] arr = new int[]{3, 1, 3, 4, 5, 4, 7};

        while ((n - 1) != i) {
            while (j <= (n - 1)) {
               if (arr[i] == arr[j]){
                   for (k = j; k<n-1; k++){
                       arr[k] = arr[k+1];
                   }
                   n--;
               }
               else {
                   j++;
               }
            }
            i++;
            j =i+1;
        }

        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }
}
