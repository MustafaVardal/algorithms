package com.algorithms.day12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        /*double pi= 3.14, area, circumference;
        System.out.println("Please enter the r value: ");
        double r = scanner.nextDouble();
        area = pi* Math.pow(r,2);
        circumference = 2*pi*r;
        System.out.println("Area of Circle: " + area + " \tPerimeter of Circle: "+circumference);*/

        /*int a, b, c, d;
        System.out.println("Enter the first corner: ");
        a = scanner.nextInt();
        System.out.println("Enter the second corner: ");
        b = scanner.nextInt();
        System.out.println("Enter the third corner: ");
        c = scanner.nextInt();
        System.out.println("Enter the fourth corner: ");
        d = scanner.nextInt();

        if ((a+c) == (b+d)){
            System.out.println("The shape is square. " );
        } else {
            System.out.println("The shape is not square." );
        }*/

        //ANOTHER QUESTION

       /* double t, v;
        System.out.println("Enter the value of time: ");
        t = scanner.nextDouble();
        if (t < 15){
            v = t * 32;
            System.out.println(v);
        }else {
            if (t > 35) {
                v = 1600 - t * 32;
                System.out.println(v);

            }
            else {
                v = 480;
                System.out.println(v);
            }
        }*/
/*
        //ANOTHER QUESTION
        int number, sum=0, temp=0, hold;
        System.out.println("Enter the number: ");
        number = scanner.nextInt();

        hold = number; // Keep entered number in a hold variable.


        temp = number %100;

        sum = sum + temp;

        number = number /100;
        System.out.println(number);
        sum = sum + number;
        System.out.println(sum);
        // sum = sum*sum;

        sum = (int) Math.pow(sum,2);
        System.out.println(sum);

        if (hold == sum){
            System.out.println("The number is original.");
        } else {
            System.out.println("The number is not original.");
        }*/


        //ANOTHER QUESTION
        /*int odd =0,  even=0;
        for (int i = 0; i <=500 ; i++) {
            odd = odd + i + 1;
            even= even + i;
        }
        if (odd - even <0 ){
            System.out.println("Diff negative.");
        }
        else{
            System.out.println("Diff positive."+ even +" "+ odd);
        }*/

        //ANOTHER QUESTION

    }
}
