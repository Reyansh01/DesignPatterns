package AdapterDeisgnPattern;

public class MacBook {

    private AppleCharger appleCharger;

    public MacBook(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeMacBook() {
        appleCharger.chargeApple();
    }
    
}
