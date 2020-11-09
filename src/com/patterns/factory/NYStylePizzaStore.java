package com.patterns.factory;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            pizza = new NYStyleCheesePizza();
        else
            pizza = null;

        return pizza;

    }
}
