package com.patterns.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void swim();

    abstract void display();

    abstract void performQuack();

    abstract void performFly();


}
