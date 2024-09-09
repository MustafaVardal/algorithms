package com.algorithms.day6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int total =0;
        int avg=0;

        for (int i = 0; i <10; i++) {
            System.out.println("Enter the exam score: ");
            int examScore = scanner.nextInt();
            total =total +examScore;
            avg = total /10;
        }

        if (avg >= 70){
            System.out.println("Good "+ avg);
        } else {
            System.out.println("Bad " + avg);
        }*/
/*==========================================================================*/
        /*int number = scanner.nextInt();
        int count = 1;


        while(number > 9){
            number = number /10;
            count++;
        }
        System.out.println("Count of cascade number: "+count);
*/

        /*==========================================================================*/

          /*  int  number,  sum =0, temp;
            System.out.println("Please enter the number: ");
            number = scanner.nextInt();

            temp = number;
            while (temp !=0){
                int digit = temp %10;
                sum+= Math.pow(digit,3);
                temp /=10;
            }

            if (sum == number){
                System.out.println("Equals.");
            }else {
                System.out.println("Not equals.");
            }*/

        /*==========================================================================*/
        float odd=0, even=0, result;

        for (int i = 0; i <3 ; i++) {
            System.out.println("Please enter the number: ");
            int number = scanner.nextInt();
            if (number % 2 == 0){
                even = even + number;
                System.out.println("Your number of even numbers: "+ even);
            } else{
                odd = odd + number;
                System.out.println("Your number of odd numbers: "+ odd);
            }
        }
        result = even/odd;
        System.out.println("Your result of  "+even+" / " + odd +": "+ result);


    }
}
