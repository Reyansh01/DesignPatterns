package AdapterDeisgnPattern;

public class MacBookCharger implements AppleCharger {
    
    @Override
    public void chargeApple() {
        System.out.println("Charging Macbook with this charger..");
    }

}
