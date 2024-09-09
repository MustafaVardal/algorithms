package com.algorithms.day8;

public class Main {
    public static void main(String[] args) {
        /*for (int i = 1; i <=10 ; i++) {
            System.out.println(i +". Multiplication");
            for (int j =1; j<=10; j++){
                System.out.println(i+" x " +j +" = " +i*j);
            }
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        while (number%5 ==0){
            number = number /5;
        }
       *//* for (int i = number; number %5 ==0;i++) {
            number = number /5;
        }*//*
        if (number ==1){
            System.out.println("Number is power of 5.");
        } else {
            System.out.println("Number is not power of 5.");
        }*/
        /*int xMultiplier = 0, yMultiplier = 0, i;


        System.out.println("Enter the first number : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int second = scanner.nextInt();

        i = (first- (first%2)) /2;
        while (i >0){
            if (first %i == 0){
                xMultiplier += i;
            }
            i--;
        }
        i =1;
        while (i<second){
            if (second%i ==0){
                yMultiplier +=i;
            }
            i++;
        }
        if (xMultiplier == second && yMultiplier ==first){
            System.out.println(first + " and " + second + " are friendly numbers.");
        }
        else {
            System.out.println(first + " and " + second + " are not friendly numbers.");
        }*/
        int first =1,second =2, third, count=2;


        System.out.print(first +" , " + second);
        while(count <11) {
            third = first + second;
            System.out.print(" , " + third);

            first = second;
            second = third;
            count++;
        }
    }
}
