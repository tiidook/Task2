package com.company;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {

        int number = 1234;

        int e = number % 10;
        int a = number / 10;
        int b = a / 10;
        int c = b / 10;

        System.out.println(e + " " + a % 10 + " " + b % 10 + " " + c % 10 + " ");

        System.out.println(123 % 10);
        System.out.println(SequenceLogic.checkSequence(number));

        System.out.println(CountingLogic.getGeometrical(128456));
        System.out.println(CountingLogic.getArithmetical(128456));

        System.out.println(ReverseLLogic.getReverse(1234567));

        System.out.println(LengthLogic.checkLength(2 ,2 ,2));

        int weight = 450;
        System.out.println(DinoLogic.getMiligram(weight));
        System.out.println(DinoLogic.getGramm(weight));
        System.out.println(DinoLogic.getTon(weight));

        System.out.println(SwitchLogic.doSwitch(5,8));
    }
}
