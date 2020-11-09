package com.patterns.singleton;

public class Singleton {
    static Singleton uniqueInstance;

    private Singleton() {

    }

    // Without thread safe
//    public static  Singleton getInstance()
//    {
//        if(uniqueInstance == null)
//            uniqueInstance = new Singleton();
//        return uniqueInstance;
//
//    }


    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null)
                    uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }


}
