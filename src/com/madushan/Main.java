package com.madushan;

import com.madushan.exercise.CarsAssemble;
import com.madushan.exercise.Dart;
import com.madushan.exercise.LogLevels;

public class Main {

    public static void main(String[] args) {
        LogLevels logLevels = new LogLevels();
//        System.out.println(logLevels.message("[ERROR]: Invalid operation"));
//        System.out.println(logLevels.logLevel("[ERROR]: Invalid operation"));
//        System.out.println(logLevels.reformat("[ERROR]: Invalid operation"));

//        CarsAssemble carsAssemble = new CarsAssemble();
//        double rate = carsAssemble.productionRatePerHour(6);
//        System.out.println(rate);

//        System.out.println(carsAssemble.workingItemsPerMinute(6));

        Dart dart = new Dart();
        int score = dart.score(7.1,-7.1);
        System.out.println(score);
    }
}
