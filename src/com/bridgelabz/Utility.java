package com.bridgelabz;

import java.util.Scanner;

public class Utility {
    public static Scanner scanner=new Scanner(System.in);
    public static String scannerString(){
        String str=scanner.next();
        return str;
    }
    public static int scannerInt(){
        int n=scanner.nextInt();
        return n;
    }
    public static char scannerChar(){
        char ch=scanner.next().charAt(0);
        return ch;
    }
}
