package com.company;

public class SequenceLogic {

    public static boolean checkSequence(int number) {
        int eds = number % 10;
        int ten = number / 10;
        int hundred = ten / 10;
        int thousand = hundred / 10;

        return eds > ten % 10 && ten > hundred % 10 && hundred % 10 > thousand % 10;
    }
}
