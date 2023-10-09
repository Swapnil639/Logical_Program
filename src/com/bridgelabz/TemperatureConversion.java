package com.bridgelabz;

public class TemperatureConversion {
    public static double temperatureConversion(double temperature, String unit) {
        if (unit.equals("C")) {
            return (temperature * 9/5) + 32;
        } else if (unit.equals("F")) {
            return (temperature - 32) * 5/9;
        }
        return 0;
    }

    public static void main(String[] args) {
        double temperatureInCelsius = TemperatureConversion.temperatureConversion(100, "F");
        System.out.println(temperatureInCelsius);
    }
}
