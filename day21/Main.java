package com.algorithms.day21;

import java.util.Scanner;

/*
**
* Dizilerde herhangi bir elemani dolasirken sorun oldugunda buraya bakilicak.
**
 */
public class Main {
    public static void main(String[] args) {

       /* char[] arr = {
                'C',
                'O',
                'M',
                'P',
                'U',
                'T',
                'E',
                'R'
        };
        *//*int n = arr.length;

        for (int i = 0; i < n; i++) {
            char temp = arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[j]=arr[j +1];
            }
            arr[n -1] = temp;
            for(char c : arr){
                System.out.print(c);
            }
            System.out.println();
        }*//*

        /// Inside for loop is used to define for each element of array from starting point of 0.
       *//*
        1. Satır: i=0 olduğunda, iç döngü sadece bir kez döner (j=0) ve sadece arr[0] yazdırılır.
        2. Satır: i=1 olduğunda, iç döngü iki kez döner (j=0 ve j=1), arr[0] ve arr[1] yazdırılır.
        3. Satır: i=2 olduğunda, iç döngü üç kez döner (j=0, j=1 ve j=2), arr[0], arr[1] ve arr[2] yazdırılır.
        *//*
        *//*
        İkinci döngü, dış döngünün her bir iterasyonunda, dizinin başından başlayarak o iterasyona kadar olan
        elemanları sırayla yazdırmamızı sağlar.Bu sayede, bir tür üçgen veya piramit şeklinde bir çıktı elde edilir.
        *//*

        *//*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                // j <= i her bir karakter ifadesinin hangi kurala gore siralanacagini gosterir.
                // Yani esittir ifadesini kaldirir isek o zaman sadece ve sadece siralama ifadelerini goruruz.
                System.out.print(arr[j]);
            }
            System.out.println();
        }*//*

        // Different data type example:
        char[] word;
        word = new char[]{'s', 'a', 'm'};


        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(word[j]);
            }
            System.out.println();
        }
            // Different data type example:
        int[] num;
        num = new int[]{1,2,3,4};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(num[j]);
            }
            System.out.println();
        }
*/
        // Another Example:

         /* int numberOfStudent;
             System.out.println("Please how many student you want to add: ");
             numberOfStudent = scanner.nextInt();
         */

        Scanner scanner = new Scanner(System.in);

     /*   int success = 0, score;
        int student[] = new int[5];

        System.out.println("Please enter 5 student score: ");
        for (int i = 0; i < student.length; i++) {
            System.out.println("Please enter the student's score: " );
            student[i] = scanner.nextInt();
            if (student[i] >= 50) {
                success = success +1;
            }
        }
        System.out.println("Passed the course student count: " + success);*/


        // Another Example:

        int [] arr = new int[10];
        int number, sum=0, avg, count = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the number: ");
            number = scanner.nextInt();
            arr[i] = number;
            sum = sum + number;
        }
        if (sum %10 ==0){
            avg = sum /10;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == avg){
                    count++;
                }
            }
            System.out.println(count + " numbers are avg of Z numbers.");
        }
        else {
            System.out.println("Avg is not a Z numbers.");
        }


    }
}
