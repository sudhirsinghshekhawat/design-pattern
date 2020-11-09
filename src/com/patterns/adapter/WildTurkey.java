package com.patterns.adapter;

public class WildTurkey implements Turkey {

    @Override
    public void gobbe() {
        System.out.println("Turkey is Gobbe .....");
    }

    @Override
    public void fly() {
        System.out.println("Turkey is flying .....");

    }
}
