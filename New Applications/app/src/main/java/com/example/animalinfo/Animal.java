package com.example.animalinfo;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private int legs;
    private boolean hasFur;
    private String moreinfo;

    public Animal(String name, int legs,boolean hasFur, String moreinfo) {
        this.name = name;
        this.legs = legs;
        this.moreinfo = moreinfo;
        this.hasFur = hasFur;
    }

    public String getMoreinfo() {
        return moreinfo;
    }

    public void setMoreinfo(String moreinfo) {
        this.moreinfo = moreinfo;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }
}
