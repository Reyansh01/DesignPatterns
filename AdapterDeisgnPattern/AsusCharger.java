package AdapterDeisgnPattern;

public class AsusCharger implements WindowsCharger {
    
    @Override
    public void chargeWindows() {
        System.out.println("Charging Asus with this charger..");
    }

}
