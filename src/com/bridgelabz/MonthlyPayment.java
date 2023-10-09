package com.bridgelabz;

public class MonthlyPayment {
    public static void main(String[] args) {
                System.out.print("Enter a Value of P where p is  P principal loan amount: ");
                double P= Utility.scannerInt();
                System.out.print("Enter the Value of Y where y is years to pay: ");
                int Y =Utility.scannerInt();
                System.out.print("Enter the valur of R where R  is percent interest compounded monthly: ");
                double R = Utility.scannerInt();
                monthlyPayment(P,Y,R);
            }

            private static void monthlyPayment(double P, int Y, double R) {
                double n = 12*Y;
                System.out.println(n);
                double r = (R/100)/12;
                System.out.println(r);
                double payment= (P*r)/1-(Math.pow(1+r,n*(-1)));
                System.out.println("Payment is : "+payment);
    }
}
