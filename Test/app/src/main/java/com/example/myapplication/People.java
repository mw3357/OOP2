package com.example.myapplication;

import java.io.Serializable;

public class People implements Serializable {
    private String name;
    private int age;
    private boolean stillAlive;

    public People(String name, int age, boolean stillAlive) {
        this.name = name;
        this.age = age;
        this.stillAlive = stillAlive;
    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStillAlive() {
        return stillAlive;
    }

    public void setStillAlive(boolean stillAlive) {
        this.stillAlive = stillAlive;
    }
}
