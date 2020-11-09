package com.patterns.strategy;

public class FlyWithWings implements  FlyBehavior
{

    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
