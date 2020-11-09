package com.patterns.state;

public class StatePattern {
    public static void main(String[] args) {


        Vibration vibration = new Vibration();
        AlertStateContext alertStateContext = new AlertStateContext(vibration);
        alertStateContext.alert();
        alertStateContext.setMobileAlertState(new Silent());
        alertStateContext.alert();

    }


}
