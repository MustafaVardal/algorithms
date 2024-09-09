package com.algorithms.day10;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        /*int number, dividing=1, count =2;
        System.out.println("Please enter the number: " );
        number= scanner.nextInt();

        for (int i = count; count < number ; count++) {
            if (number%count ==0){
                dividing += count;
            }
        }
        if (dividing>number){
            System.out.println("Abundant number.");
        } else {
            System.out.println("Deficient number.");
        }*/

        /*======================================================*/
        /*int sum=0;
        for (int i = 1; i <=500 ; i++) {
            sum +=i;
        }
        System.out.println(sum);*/
        /*======================================================*/
       /* int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a>50 && b>50){
            c= a+b;
            System.out.println("Because a and b is greater than 50, c is :" + c);
        } else {
            System.out.println("This number is not allowing the show. Because a or b less than or equals 50.");
        }*/
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 63;
        int guess;
        int attemptCount = 0;
        int targetNumber = random.nextInt(upperBound - lowerBound +1) + lowerBound;

        do {
            guess =(lowerBound + upperBound) /2;
            attemptCount++;

            if (guess == targetNumber){
                System.out.println("Number guessed: "+ targetNumber + " in " + attemptCount +" attempts.");
                break;
            } else {
                if (guess> targetNumber){
                    upperBound = guess;
                } else {
                    lowerBound = guess;
                }
            }
        } while(true);
    }
}
