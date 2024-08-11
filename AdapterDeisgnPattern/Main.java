package AdapterDeisgnPattern;

public class Main {
    
    public static void main(String[] args) {
        
        // suppose we dont have the macbook charger..
        // MacBookCharger macBookCharger = new MacBookCharger();
        // MacBook macBook = new MacBook(macBookCharger);
        // macBook.chargeMacBook();

        // now, we will use adapter.
        AppleCharger appleCharger = new AsusToMacBookAdapter(new AsusCharger());
        MacBook macBook = new MacBook(appleCharger);
        macBook.chargeMacBook();
    }

}
