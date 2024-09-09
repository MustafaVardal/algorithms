package com.algorithms.day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* for (int i = 1; i <=100 ; i++) {
            if (i % 3==0 || i % 5 ==0){
                System.out.println(i);
            }
        }*/

        Scanner scanner = new Scanner(System.in);
        /*int a = scanner.nextInt();
        int onesPlace = a %10;
        System.out.println(onesPlace);*/

        int firstNo= scanner.nextInt();
        int secondNo = scanner.nextInt();
       /*  int result = firstNo % secondNo;
        System.out.println(result);*/
/*
*
*   Girilen bir sayinin kac basamakli oldugunu bulalim.
*
*
* */

        for (int i = 0; firstNo >=secondNo ; i++) {
            firstNo = firstNo - secondNo;

        }
        System.out.println("Result " + firstNo);



    }
}
