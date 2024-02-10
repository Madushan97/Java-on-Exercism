package com.madushan.exercise;

public class Dart {

    public int score(double xOfDart, double yOfDart) {

        double distance = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));
        int points = 0;
        if (distance > -1 && distance <= 10) {
            if (distance <= 10 && distance > 5) {
                points = 1;
            } else if (distance <= 5 && distance > 1) {
                points = 5;
            } else if (distance >= 0 && distance <= 1) {
                points = 10;
            }
        } else {
            points = 0;
        }
        return points;
    }
}
