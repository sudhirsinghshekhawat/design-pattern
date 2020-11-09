package com.patterns.strategy;

public class DuckSimulator {
    public static void main(String[] args) {

        Duck duck = new MalardDuck();
        duck.performFly();
        duck.performQuack();
        duck.swim();


    }
}
