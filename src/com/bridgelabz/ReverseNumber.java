package com.bridgelabz;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        int num=Utility.scannerInt();
        findReverseNumber(num);
    }

    public static void findReverseNumber(int num) {
        int rem,rev=0;
        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
