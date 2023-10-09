package com.bridgelabz;

public class DateUtils {
        public static int dayWeek(int month, int day, int year) {
            int y0 = year - (14 - month) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = month + 12 * ((14 - month) / 12) - 2;
            int d0 = (day + x + 31 * m0 / 12) % 7;

            return d0;
        }

        public static void main(String[] args) {

            System.out.println("Enter month number:");
            int month = Utility.scannerInt();
            System.out.println("Enter day number:");
            int day = Utility.scannerInt();
            System.out.println("Enter the year:");
            int year = Utility.scannerInt();

            int dayOfWeek = dayWeek(month, day, year);
            System.out.println("Day of the week: " + dayOfWeek);
    }
}
