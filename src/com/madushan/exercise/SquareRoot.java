package com.madushan.exercise;

public class SquareRoot {

    public Integer sqRoot(int radicand) {
        int sqRoot = 0;
        for (int i=0; i <= radicand; i++) {
            if (i * i == radicand)
                sqRoot = i;
        }
        return sqRoot;
    }
}
