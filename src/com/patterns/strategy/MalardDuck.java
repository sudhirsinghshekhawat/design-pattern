package com.patterns.strategy;

public class MalardDuck extends Duck
{
    public MalardDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void swim() {
        System.out.println("All ducks can float and swim ");


    }

    @Override
    void display() {
        System.out.println("I am Malard Duck");

    }

    @Override
    void performQuack() {
        quackBehavior.quack();

    }

    @Override
    void performFly() {
        flyBehavior.fly();

    }
}
