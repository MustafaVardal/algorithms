package com.algorithms.day22;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //int n=0, p=0, sumN=0, sumP=0, avgN=0, avgP=0;

       /* int[] arr = new int[11];
        for (int i = 1; i < arr.length ; i++) {
            System.out.println("Enter "+ i +". number: ");
            arr[i]= scanner.nextInt();

            if (arr[i] >0){
                sumP = sumP+ arr[i];
                p = p + 1;
            } else if (arr[i]< 0) {
                sumN = sumN + arr[i];
                n = n+1;
            }
        }
        System.out.println("Count of Positive numbers: " + p);
        System.out.println("Count of Negative numbers: " + n);*/

        // Another Example:

        /*int[] arr = new int[11];
        for (int i = 1; i < arr.length ; i++) {
            System.out.println("Enter "+ i +". number: ");
            arr[i]= scanner.nextInt();

            if (arr[i] >0){
                sumP = sumP+ arr[i];
                p = p + 1;
            } else if (arr[i]< 0) {
                sumN = sumN + arr[i];
                n = n+1;
            }
        }
        if (p ==0 && n !=0){
            avgN = sumN /n;
        } else if (p!=0 && n==0) {
            avgP = sumP /p;
        } else if (p!=0 && n!=0) {
            avgP = sumP /p;
            avgN = sumN /n;
        }
        System.out.println("Average of Positive Numbers: "+ avgP);
        System.out.println("Average of Negative Numbers: "+ avgN);*/


        // Another Question

        /*int[] numbers = new int[11];
        int n;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the number: ");
            n = scanner.nextInt();
            numbers[i]= n;
            if (numbers[i]%20 ==0){
                System.out.println("This number can divide 4 and 5 exactly(without left number): " + numbers[i]);
            }
            else {
                System.out.println("This number can not able to divide both number: " + numbers[i]);
            }
        }*/


        // Another Question


       /* double[] numbers = new double[11];
        double sum =0, avg=0, number;

        for (int i = 1; i <= numbers.length-1; i++) {
            System.out.println("Enter "+ i + ". number");
            number = scanner.nextDouble();
            numbers[i] = number;
            sum = numbers[i] + sum;
        }
        System.out.println(sum);
        avg = sum / 10;
        System.out.println("Average of these numbers: " + avg);*/



        // Another Question



        int n, count = 0;
        String ch;
        System.out.println("Please enter how many characters you want to do: ");
        n = scanner.nextInt();
        String[] arr = new String[n+1];

        for (int i = 1; i <= n; i++) {

            System.out.println(i + ". character: ");
            arr[i] = scanner.next();


        }
        System.out.println("Please enter the searching character: ");
        ch = scanner.next();

        for (int i = 1; i <= n; i++) {
            if (Objects.equals(arr[i], ch)) {
                count++;
            }
        }
        System.out.println("There are " + count + " times. " +" Character is : "+ ch );

    }
}
