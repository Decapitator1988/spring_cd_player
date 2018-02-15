package com.decapitator.classes;

public class stn {
    private static stn ourInstance = new stn();

    public static stn getInstance() {
        return ourInstance;
    }

    private stn() {
    }
}
