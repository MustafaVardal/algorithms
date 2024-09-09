package com.algorithms.day11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*FIRST WAY...*/
        /*int number;
        int power = 0;
        System.out.println("Enter the number: ");
        number= scanner.nextInt();

        while (Math.pow(2,power) <= number){
            power++;
        }
        power--;

        while (power>=0){
            int digit = (number & (1 << power)) != 0? 1:0;
            System.out.print(digit);
            power--;
        }
        System.out.println();*/

        /*SECOND WAY*/

        /*int number,i =0;
        double sum = 0;
        System.out.println("Enter the number: ");
        number =scanner.nextInt();
        while (number>=2){
            sum = sum + (number%2)*Math.pow(10,i);
            number = number /2;
            i++;
        }
        sum = sum + (number)*Math.pow(10,i);
        System.out.println(sum);*/


        /*ANOTHER QUESTION



        /*int number, base = 0, count = 0;
        double sum = 0;

        number = scanner.nextInt();

        while (number > 9) {
            base = number % 10;
            number = number / 10;

            sum = sum + base* Math.pow(2,count);
            count++;
        }

        sum = sum + number * Math.pow(2, count);
        System.out.println(sum);*/


        // ANOTHER QUESTION

        /*int year;
        System.out.println("Please enter just year.");
        year = scanner.nextInt();

        if ( year % 4 ==0){
            System.out.println("This year is February 29 : " + year);
        }
        else {
            System.out.println("This year is February 28: " + year);
        }*/

        // ANOTHER QUESTION

        int weight, height,result;
        System.out.println("Please enter your weight: ");
        weight = scanner.nextInt();
        System.out.println("Please enter your height: ");
        height = scanner.nextInt();
        height = height % 100;
        result =height- weight;
        if (result < 11 ){
            System.out.println("Please lost your weight! You are over-weight.");
        } else if (result == 11) {
            System.out.println("Your weight is good.");
        } else if (result> 11) {
            System.out.println("Please gain more weight. You are so thin.");
        }
    }
}
