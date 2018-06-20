package com.company;

public class CountingLogic {

    public static final double CountDigits = 6.;

    public static double getArithmetical(int number){
        int eds = number % 10;
        int ten = number / 10;
        int hundred = ten / 10;
        int thousand = hundred / 10;
        int tenThousand = thousand / 10;
        int hundredThousand = tenThousand / 10;

        return (hundredThousand % 10 + tenThousand % 10 + thousand % 10 + hundred % 10 + ten % 10 + eds) / CountDigits;
    }

    public static double getGeometrical(int number){
        int eds = number % 10;
        int ten = number / 10;
        int hundred = ten / 10;
        int thousand = hundred / 10;
        int tenThousand = thousand / 10;
        int hundredThousand = tenThousand / 10;

        return Math.pow((hundredThousand % 10) * (tenThousand % 10) * (thousand % 10) * (hundred % 10)
                * (ten % 10) * eds, 1 / CountDigits);

    }
}
