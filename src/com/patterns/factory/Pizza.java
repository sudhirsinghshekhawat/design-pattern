package com.patterns.factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing : " + name);
        System.out.println("Tossing dough .... " + dough);
        System.out.println("Adding sauce .... " + sauce);
        System.out.println("Adding topics .... ");
        toppings.forEach(System.out::println);
    }

    void bake() {
        System.out.println("baking for 25 min at 350");
    }

    void cut() {
        System.out.println("Cutting Pizza in Diagnal slices");
    }

    void box() {
        System.out.println("place pizza in official store box");
    }

    public String getName() {
        return name;
    }
}
