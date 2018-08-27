package com.example.javacore;

public class WhileLoop {
    public void WhileLoop() {
        int [] number = {1,3,5,7};
        int i = 0;
        while(i < number.length){
            System.out.println("while loop" + number[i]);
            i++;
        }
    }
    public void DoWhileLoop() {
        int [] number ={2,4,6,8};
        int i = number.length-1;
        do {

            System.out.println("do loop " + number[i]);
            i--;
        } while(i >= 0);
    }


    public void WhileSum(int number) {
        int sum = 0;
        int i = 0;
        while (i <= number){
            sum = sum+i;

            i++;
        }
        System.out.println("Sum of " + number + " natural numbers is " + sum);
    }
    public void WhileFibonacci(int number){
        int a=0;int b=1;int count=0; int i = 0;
        while(i <= number){
            count = a+b;
            a = b;
            b = count;
            System.out.println("Fibonacci is " + count);
            i++;
        }
    }
}
