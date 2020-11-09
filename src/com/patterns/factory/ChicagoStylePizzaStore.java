package com.patterns.factory;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            pizza = new ChicagoStyleCheesePizza();
        else
            pizza = null;

        return pizza;

    }
}
