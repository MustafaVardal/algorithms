package com.algorithms.day4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int x, y, divided=0;
        x = scanner.nextInt();
        y = scanner.nextInt();

        for (int i = 1; y <= x ; i++) {
            divided = x;
            x = x -y;
            System.out.println( divided + " | " + divided +" - "+ y+" = " + x + " steps "  +i);
        }
    }
}
