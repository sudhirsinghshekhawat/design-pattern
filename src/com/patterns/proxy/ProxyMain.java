package com.patterns.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");
            internet.connectTo("abc.com");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
}
