package com.algorithms.day15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*double a, b, c, x, y, delta = 0;

        System.out.println("Enter the number coefficient of x^2: ");
        a = scanner.nextDouble();
        System.out.println("Enter the number coefficient of x: ");
        b = scanner.nextDouble();
        System.out.println("Enter the number constant c: ");
        c = scanner.nextDouble();
        System.out.println("Our Equation: " + a + "x^2+ " + b + "x+ " + c);

        delta = Math.pow(b, 2) - (4 * (a * c));

        if (delta == 0) {
            x = -b / 2 * a;
            System.out.println("Equation has only 1 root." + x);
        } else {
            if (delta < 0) {
                System.out.println("There is no reel root.");
            } else {
                x = ((-b) - Math.sqrt(delta)) / (2 * a);
                y = ((-b) + Math.sqrt(delta)) / (2 * a);
                System.out.println("There are two root:\nFirst root: " + x
                        + "\nSecond root: " + y);
            }
        }*/


        // Another Example:




        /*int count = 4;

        for (int number = 1; number <= 100; number++) {
            if (number % 2 != 0) {
                if (number % 3 != 0) {
                    if (number % 5 != 0) {
                        if (number % 7 != 0) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("Count of prime numbers: "+count);*/


        // Another Example:


       /* for (int number = 10; number <= 100; number++) {
            if (number % 2 != 0) {
                if (number % 3 != 0) {
                    if (number % 5 != 0) {
                        if (number % 7 != 0) {
                            System.out.println(number);
                        }
                    }
                }
            }
        }*/


        // Another Example:


/*
        int num, temp, sum =0, sum1=0, i=2, temp1;
        System.out.println("Enter the number: ");
        num = scanner.nextInt();
        temp = num;
        while(num > 10){
            sum = sum + num%10;
            num = num /10;
        }
        sum = sum + num;

        while (temp>1){
            if (temp%i ==0){
                if (i ==2 || i==3 || i ==5 || i==7){
                    sum1 =sum1 +i;
                    temp = temp/i;
                } else {
                    temp1=i;

                    while (temp1 >10){
                        sum1 = sum1+ temp1%10;
                        temp1 = temp1/10;
                    }
                    sum1 = sum1 + temp1;
                    temp = temp /i;
                }
            }
            else {
                i++;
            }

        }
        if(sum ==sum1){
            System.out.println("Smith number. ");
        } else {
            System.out.println("Not a smith number. ");
        }
*/


        // Another Example:

      /*  int a, b, c;
        System.out.println("Enter the corner value: ");
        a = scanner.nextInt();
        System.out.println("Enter the corner value: ");
        b = scanner.nextInt();
        c = (int) Math.sqrt((int) Math.pow(a, 2) + (int) Math.pow(b, 2));
        System.out.println("Hypotenuse: " + c);*/


        // Another Example:

        // area-> 1/2*a*b*sin(alpha);


       /* int a,b;
        double alpha;
        double area=0;
        System.out.println("Enter the corner value: ");
        a = scanner.nextInt();
        System.out.println("Enter the corner value: ");
        b = scanner.nextInt();
        System.out.println("Enter the alpha value for angle: ");
        alpha = scanner.nextDouble();
        double angle = Math.sin(alpha)/2;
        area = ( a * b * angle);
        System.out.println("Result of area: "+ area);*/

        // Another Example:

        //AREA = 4 * pi * r*r;
        //VOL = 4/3 *pi* r^3;

       /* int r;
        final double PI = 3.14;
        double area, vol;

        System.out.println("Enter the value of R: ");
        r = scanner.nextInt();
        System.out.println("Please select what you want to have calculation: \n1- Area:\n2- Volume:");
        int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    area = 4 * PI * r * r;
                    System.out.println("Result of Area: " + area);
                    break;
                case 2:
                    vol = (double) 4 / 3 * PI * Math.pow(r, 3);
                    System.out.println("Result of Volume: " + vol);
                    break;
            }*/


        /*String Class Practice!*/
            /*String y = "4da";
            String x = new StringBuffer(4).append("d").append(4).append("a").append(5).reverse().toString();
            String a = new StringBuffer(1).append("a").toString();
            int d = new StringBuffer(2).append(1).capacity();
            String b = new StringBuffer(33).toString();
            String w = "1234";
            char t= x.charAt(x.length()-1);
            System.out.println("x [0]: "+t);

            System.out.println(d);
            System.out.println(a.length());
            int z = x.compareTo(y);
            System.out.println(z);
            System.out.println(x);*/
    }
}
