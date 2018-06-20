package com.company;

public class SwitchLogic {

    public static String doSwitch(int a,int b){

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return a + " " + b;
    }
}
