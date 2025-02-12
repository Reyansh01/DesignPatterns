package AdapterDeisgnPattern;

public class Asus {
    
    private WindowsCharger windowsCharger;

    public Asus(WindowsCharger windowsCharger) {
        this.windowsCharger = windowsCharger;
    }

    public void chargeAsus() {
        windowsCharger.chargeWindows();
    }

}
