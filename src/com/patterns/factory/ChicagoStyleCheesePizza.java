package com.patterns.factory;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style cheese pizza";
        dough = "Extra thin crust";
        sauce = "Plum tomato sauce";

        toppings.add("Sharded mozerrila cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting Pizza into Square slices");
    }
}
