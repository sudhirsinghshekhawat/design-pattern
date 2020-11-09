package com.patterns.decorator;

public class StarBuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage = new Esspresso();
        System.out.println("Beverage description = " + beverage.getDescription() +
                ", beverage cost = $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        System.out.println("Beverage description = " + beverage1.getDescription() +
                ", beverage cost = $" + beverage1.cost());

        System.out.println("-------------------");

        Beverage beverage2 = new Mocha(beverage);
        System.out.println("Beverage description = " + beverage2.getDescription() +
                ", beverage cost = $" + beverage2.cost());

        Beverage beverage3 = new Mocha(beverage1);
        System.out.println("Beverage description = " + beverage3.getDescription() +
                ", beverage cost = $" + beverage3.cost());










    }
}
