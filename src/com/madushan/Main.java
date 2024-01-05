package com.madushan;

import com.madushan.exercise.LogLevels;

public class Main {

    public static void main(String[] args) {
        LogLevels logLevels = new LogLevels();
        System.out.println(logLevels.message("[ERROR]: Invalid operation"));
        System.out.println(logLevels.logLevel("[ERROR]: Invalid operation"));
        System.out.println(logLevels.reformat("[ERROR]: Invalid operation"));
    }
}
