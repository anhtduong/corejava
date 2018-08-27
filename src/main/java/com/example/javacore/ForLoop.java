package com.example.javacore;

import java.util.Scanner;

public class ForLoop {
    public void ForLoop() {
        String[] arg = {"WHILE", "DO WHILE", "FOR", "BREAK", "CONTINUE"};
        for (int i = 0; i < arg.length; i++) {
            System.out.println("for loop " + arg[i]);
        }
        for (String s : arg) {
            System.out.println("for each loop " + s);
        }
    }

    public void ForSum(int number) {
        int sum = 0;
        for (int j = 0; j <= number; j++) {
            sum = sum + j;
        }
        System.out.println("Sum of " + number + " natural numbers is " + sum);
    }

    public void ForFactorial(int number) {
        int factorial = 1;
        /*System.out.println("Enter a positive number from 1-10: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();*/
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of number is " + factorial);

    }

}
