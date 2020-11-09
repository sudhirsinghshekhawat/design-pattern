package com.patterns.proxy;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting TO : " + serverHost);
    }
}
