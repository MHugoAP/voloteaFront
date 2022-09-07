package com.speedup.qa.models;

public class DataOutline {
    private int adult;
    private int child;
    private int baby;

    public DataOutline(int adult, int child, int baby) {
        this.adult = adult;
        this.child = child;
        this.baby = baby;
    }

    public int getAdult() {
        return adult;
    }

    public int getChild() {
        return child;
    }

    public int getBaby() {
        return baby;
    }
}
