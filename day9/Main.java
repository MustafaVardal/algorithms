package com.algorithms.day9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Please enter the number: ");
        int x  = scanner.nextInt();

        if (x < 0){
            System.out.println(x + " number is negative.");
        } else if ( x > 0 ) {
            System.out.println(x + " number is positive.");
        } else if (x ==0) {
            System.out.println(x + " number is equal to 0.");
        }*/


        /*int count =2, total=1;

        System.out.println("Please enter the number: ");
        int number  = scanner.nextInt();
        while(count <= (number/2)){
            if (number %count ==0){
                total = total + count;
                System.out.println(total);
            }
            count ++;
        }
        if (total == number){
            System.out.println("Perfect number.");
        } else {
            System.out.println("Not a perfect number.");
        }*/


        /*int count, total= 0, y=0;

        for (count = 0; count < 100; count+=2) {
            total = total + (count +2);
        }
        for ( count=1 ; count< (total/2); count++){
            if ((total % count) ==0){
                System.out.println(y);
                y = y + count;

            }
        }
        if (total == y){
            System.out.println(y+ " Perfect! " + total);
        } else {
            System.out.println(y+ " Not Perfect! " + total);
        }*/

        int number, power, total=1; // power is count value;
        System.out.println("Please enter the number: ");
        number = scanner.nextInt();
        System.out.println("Please enter the power of chosen number: ");
        power = scanner.nextInt();

        while (power !=0){
            total = total * number;
            power --;
        }

        System.out.println(total);

    }
}

