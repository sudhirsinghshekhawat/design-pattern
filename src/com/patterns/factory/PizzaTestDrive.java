package com.patterns.factory;

public class PizzaTestDrive
{
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore cyPizzaStore = new ChicagoStylePizzaStore();

        System.out.println("--------------------------");

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ordered pizza 1 = "+pizza.name);

        System.out.println("--------------------------");

        pizza = cyPizzaStore.orderPizza("cheese");
        System.out.println("Ordered pizza 2 = "+pizza.name);

    }
}
