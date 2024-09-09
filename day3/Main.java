package com.algorithms.day3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Factorial Number starting point loop.

        // Induction method:
        /*int result = 1;

        *//*int number = scanner.nextInt();*//*
        for(int number = scanner.nextInt(); number > 0; number--){

                result = result * number;


        }
        System.out.println(result);*/


        //2. way
       /* int fact=1;

        int number = scanner.nextInt();
        for (int i = number ;i > 0; i--){
            fact = fact * number;
            number--;
        }
        System.out.println(fact);*/

        // No use the *. Calculate 2 entered number with sum.
     /*int number1 = scanner.nextInt();
     int number2 = scanner.nextInt();
     int count =0;
        for (int i = number1; i >0 ; i--) {
            count = count + number2;
        }
        System.out.println(count);*/

        // no use / Calculate 2 value with subs.
        /*int i =0;
        int number1= scanner.nextInt();
        int number2 = scanner.nextInt();
        for(i = 1; number1>number2; i++){
            number1 = number1 - number2;
        }
        System.out.println(i);*/

       /* String city= "Istanbul";
        int count= 5;

        for (int i = count; i >0 ; i--) {
            System.out.println(city);
        }*/



       /* int result=0;

        for (int value = 0; value<=10; value++){
            result+=value;

        }
        System.out.println(result);*/


        // Mod calculation without using mod operator.

        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        while(num1>=num2){
            num1 = num1 - num2;
        }
        System.out.println(num1);



    }
}
