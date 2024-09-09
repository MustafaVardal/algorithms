package com.algorithms.day7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int square;

        for (int i = 0; i <=1000 ; i++) {
            square = i*i;
            if (square <10 || square >1000){

            } else{
                System.out.println("number: "+i + " result of square: "+square);

            }
        }*/

        Scanner scanner= new Scanner(System.in);

        int negative=0, even=1, count =0;

        for(int i =1; i <6; i++){
            System.out.println("Please enter "+ i+ ". number: ");
            int number = scanner.nextInt();

            if (number <0){
                negative += number;
            } else if (number %2 ==0 && number >0) {
                even *=number;
            } else if (number==7) {
                count ++;

            }

        }
        System.out.println("Negative number rule is working now. Value of total negative numbers: "+ negative);
        System.out.println("Even number rules is working now. Value of multiple of even numbers: "+ even);
        System.out.println("Count rule is working now. value of this number of count: "+ count);





    }
}
