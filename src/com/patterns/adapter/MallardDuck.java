package com.patterns.adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Duck is Quacking ..... ");
    }

    @Override
    public void fly() {
        System.out.println("Duck is Flying .....");

    }
}
