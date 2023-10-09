package com.bridgelabz;

public class Binary {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int number = Utility.scannerInt();

        String binary = toBinaryString(number);
        System.out.println("Binary representation: " + binary);

        String swappedBinary = swapNibbles(binary);
        System.out.println("Number after swapping nibbles: " + Integer.parseInt(swappedBinary, 2));

        boolean isPowerOfTwo = isPowerOfTwo(number);
        System.out.println("Is the number a power of 2? " + isPowerOfTwo);
    }

    public static String toBinaryString(int number) {
        return Integer.toBinaryString(number);
    }

    public static String swapNibbles(String binary) {
        if (binary.length() < 8) {
            binary = "0".repeat(8 - binary.length()) + binary;
        }

        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4, 8);

        return nibble2 + nibble1;
    }

    public static boolean isPowerOfTwo(int number) {
        return (number & (number - 1)) == 0;
    }
}
