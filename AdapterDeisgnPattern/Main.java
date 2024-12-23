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

    /*
     * 1. It is a structural design pattern.
     * 
     * ADVANTAGES:
     * 1. Allows compatible interfaces to work together by acting as a bridge.
     * 2. Reuses the existing functionality without modifying the original code.
     * 3. Easily adapts an old system to work with new requirements or API.
     * 4. Helps integrate third-party libraries or legacy systems into exisiting applications.
     * 
     * DISADVANTAGES:
     * 1. Introduces an extra layer of abstraction making the code harder to follow.
     * 2. May slightly slow down operations due to additional layer.
     * 3. Only fixes specific incompatibility issues.
     * 4. Changes in the adapted class or interface may requires updates in the adapter.
     */

}
