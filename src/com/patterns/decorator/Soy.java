package com.patterns.decorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
