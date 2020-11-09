package com.patterns.state;

public class AlertStateContext {

    private MobileAlertState mobileAlertState;

    public AlertStateContext(MobileAlertState mobileAlertState) {
        this.mobileAlertState = mobileAlertState;
    }

    public void setMobileAlertState(MobileAlertState mobileAlertState) {
        this.mobileAlertState = mobileAlertState;
    }

    public void alert() {
        mobileAlertState.alert(this);
    }
}
