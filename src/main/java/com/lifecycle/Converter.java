package com.lifecycle;

public class Converter {

    public static String convertGrams(double grams) {
        double kilograms = grams / 1000;
        double tonnes = kilograms / 1000;
        if (tonnes >= 1) {
            return String.format("%.2f тон", tonnes);
        } else if (kilograms >= 1) {
            return String.format("%.2f кілограм", kilograms);
        } else {
            return String.format("%.2f грам", grams);
        }
    }
}

