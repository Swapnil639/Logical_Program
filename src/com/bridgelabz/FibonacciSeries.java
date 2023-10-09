package com.bridgelabz;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        int num=Utility.scannerInt();
        int a=0;
        int b=1;
        generateFibonacciSeries(a,b,num);
    }

    public static void generateFibonacciSeries(int a, int b,int num) {
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i <num; i++) {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
