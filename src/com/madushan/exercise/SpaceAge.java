package com.madushan.exercise;

public class SpaceAge {

    public String ageInPlanet(double seconds) {
        double onEarth = (((seconds/60)/60)/24)/365.2425;
        double onMercury = onEarth/0.2408467;
        double onVenus = onEarth/0.61529726;
        double onMars = onEarth/1.8808158;
        double onJupiter = onEarth/11.862615;
        double onSaturn = onEarth/29.447498;
        double onUranus = onEarth/84.016846;
        double onNeptune = onEarth/164.79132;

        System.out.println("Earth Days : " + onEarth + " earth days");
        System.out.println("Mercury Days : " + onMercury + " earth days");
        System.out.println("Venus Days : " + onVenus + " earth days");
        System.out.println("Mars Days : " + onMars + " earth days");
        System.out.println("Jupiter Days : " + onJupiter + " earth days");
        System.out.println("Saturn Days : " + onSaturn + " earth days");
        System.out.println("Uranus Days : " + onUranus + " earth days");
        System.out.println("Neptune Days : " + onNeptune + " earth days");

        return null;
    }
}
