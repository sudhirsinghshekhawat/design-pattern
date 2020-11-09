package com.patterns.adapter;

public class TurkeyAdapterTest
{
    public static void main(String[] args)
    {
        MallardDuck duck = new MallardDuck();
        duck.fly();
        duck.quack();
        System.out.println("------------");

        WildTurkey wildTurkey = new WildTurkey();
        wildTurkey.fly();
        wildTurkey.gobbe();

        System.out.println("------------");

        TurkeyAdapter ta = new TurkeyAdapter(wildTurkey);
        ta.fly();
        ta.quack();







    }
}
