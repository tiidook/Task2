package com.company;

public class DinoLogic {

    public static final long Milligrams = 1000000l;
    public static final long Grams = 1000l;
    public static final double Tons = 1 / 1000.;

    public static long getMiligram(int weight){

        return weight * Milligrams;
    }

    public static long getGramm(int weigth){

        return weigth * Grams;
    }

    public static double getTon(int weight){

        return weight * Tons;
    }
}
