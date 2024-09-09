package com.algorithms.day13;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

       /* int number, x, y, z, t, temp;
        System.out.println("Enter the number which should be 1000's: ");
        number = scanner.nextInt();
        temp = number % 1000;
        z = (number % 100) / 10;
        y = temp / 100;
        x = number / 1000;
        t = number - (x * 1000) - (y * 100) - (z * 10);
        System.out.println(x + " " + y + " " + z + " " + t);*/

        // OTHER QUESTION
       /* int number, negative = 0, positive = 0;
        for (int i = 1; i <= 50; i++) {
            System.out.println("Please enter " + i + " . number:");
            number = scanner.nextInt();

            if (number < 0) {
                negative = negative + 1;
            } else {
                positive = positive + 1;
            }

        }
        System.out.println("Count of negative numbers: " + negative);
        System.out.println("Count of positive numbers: " + positive);*/


        // OTHER QUESTION
       /* Random random = new Random();
        int hold = (random.nextInt(99) + 1);
        System.out.println(hold);
        int number;


        for (int i = 1; i <=10; i++) {
            System.out.println("Please Enter the number: ");
            number = scanner.nextInt();

            if (number == hold ) {
                System.out.println("Congrats! You won with " + i + " times guess.");
                break;
            } else if (number < hold && i !=10) {
                System.out.println("Try again. Increase your guessing number of variable: ");

            } else if (number > hold && i !=10) {
                System.out.println("Try again. Decrease your guessing number of variable: ");
            } else  {
                System.out.println("Sorry! Please play again. You lost. ");
                break;
            }

        }*/

        // OTHER QUESTION

        int k, a, temp=0;
        for (int i = 10; i <=200 ; i++) {
            k = i * 3 +2;

            a = (k/5)*5; // this is for getting rid of decimal points.
            if (k ==a){
                //temp = temp + a; total of these numbers.
                System.out.println( "Number :  "+ a + " | Number of iternator: " + i );
            }

        }
        //System.out.println(temp); total of these numbers.



    }
}
