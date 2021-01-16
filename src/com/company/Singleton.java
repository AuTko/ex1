package com.company;

public class Singleton implements Singl {
    private static Singleton instance;
    public String msg;

    private Singleton() {
        msg = "Hello";
    }

    public static Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{} obj hash " + this.hashCode();
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
