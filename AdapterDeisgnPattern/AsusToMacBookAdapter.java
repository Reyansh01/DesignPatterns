package AdapterDeisgnPattern;

public class AsusToMacBookAdapter implements AppleCharger {
    
    private AsusCharger asusCharger;

    public AsusToMacBookAdapter(AsusCharger asusCharger) {
        this.asusCharger = asusCharger;
    }

    @Override
    public void chargeApple() {
        asusCharger.chargeWindows();
        System.out.println("Charging via adapter that's why showing charging with Asus..");
    }

}
