package com.bridgelabz;

public class SquareRootCalculator {
    public static double sqrt(double c) {
        if (c < 0) {
            System.out.println("Input must be a nonNegative number");
        }

        double t = c;
        double epsilon = 1e-15;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }

        return t;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a nonNegative number as the input.");
            return;
        }

        double c = Double.parseDouble(args[0]);

        double squareRoot = sqrt(c);
        System.out.println("Square root: " + squareRoot);
    }
}
