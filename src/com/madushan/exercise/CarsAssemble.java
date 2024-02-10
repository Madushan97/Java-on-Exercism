package com.madushan.exercise;

public class CarsAssemble {

    double productionRate;
    int carsPerHour = 221;
    public double productionRatePerHour(int lineSpeed) {

        if (lineSpeed > 0 && lineSpeed < 11) {

            if (lineSpeed >= 1 && lineSpeed <= 4) {
                productionRate = lineSpeed * carsPerHour;
                return productionRate;
            } else if (lineSpeed >= 5 && lineSpeed <= 8) {
                productionRate = lineSpeed * carsPerHour;
                productionRate = (productionRate * 90) / 100;
                return productionRate;
            } else if (lineSpeed == 9) {
                productionRate = lineSpeed * carsPerHour;
                productionRate = (productionRate * 80) / 100;
                return productionRate;
            } else if (lineSpeed == 10) {
                productionRate = lineSpeed * carsPerHour;
                productionRate = (productionRate * 77) / 100;
                return productionRate;
            }
        }
        return 0;
    }

    public int workingItemsPerMinute(Integer lineSpeed) {
        return (int) productionRatePerHour(lineSpeed)/60;
    }
}
