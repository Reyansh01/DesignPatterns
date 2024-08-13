package BridgeDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        testTV(new SonyTV());
        testTV(new LGTV());
    }

    private static void testTV(TV tv) {
        System.out.println("BasicRemote..");
        BasicRemote basicRemote = new BasicRemote();
        basicRemote.startTv();
        tv.watching();

        System.out.println("AdvancedRemote..");
        AdvancedRemote advancedRemote = new AdvancedRemote();
        advancedRemote.startTv();
        tv.watching();
    }

}
