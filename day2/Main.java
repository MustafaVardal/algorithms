package com.algorithms.day2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // NEGATIVE OR POSITIVE

        /*System.out.println("Please enter the number: ");
        int number  = scanner.nextInt();
        if (number> 0){
            System.out.println("Number is : "+ number +" positive value.");
        } else if (number < 0) {
            System.out.println("Number is :" + number + " negative value.");
        } else {
            System.out.println("Number is equals : "+ number );
        }*/

        // BIGGER NUMBER
       /* System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        if (number1>number2){
            System.out.println("First number " + number1 + " is greater than "+ number2);
        } else if (number2 == number1) {
            System.out.println("Second number " + number2 + " is equals  "+ number1);
        } else {
            System.out.println("Second number " + number2 + " is greater than "+ number1);
        }*/

        // From 1 to 100 cube of that numbers of total.

        // DOB covert to age.
        String date;
        LocalDate year = LocalDate.now();
        System.out.println("Please enter your years of birth: ");
        date = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dbo = LocalDate.parse(date,formatter);
        Period age = Period.between(dbo,year);

        System.out.println("Age : " + age.getYears() + " years old.");

    }
}
