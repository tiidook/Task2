package com.company;

public class ReverseLLogic {

    public static int getReverse(int number){
        final int Des = 10;
        final int Hundred = 100;
        final int Thousand = 1000;
        final int TenThousand = 10000;
        final int HundredThousand = 100000;
        final int Million = 1000000;

        int eds = number % 10;
        int ten = number / 10;
        int hundred = ten / 10;
        int thousand = hundred / 10;
        int tenThousand = thousand / 10;
        int hundredThousand = tenThousand / 10;
        int million = hundredThousand / 10;

        return (eds * Million + ten % 10 * HundredThousand + hundred % 10 * TenThousand + thousand % 10
                * Thousand + tenThousand % 10 * Hundred + hundredThousand % 10 * Des + million % 10);

    }
}
