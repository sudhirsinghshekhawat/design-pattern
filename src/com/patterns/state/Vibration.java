package com.patterns.state;

public class Vibration implements MobileAlertState
{

    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Vibrating ..........");
    }
}
