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

    /*
     * 1. It is a structural design pattern.
     * 
     * ADVANTAGES:
     * 1. It allows abstractions and implementation to evolve independently.
     * 2. Supports Open/Closed principle by adding new abstractions and implementations without modifying exisiting code.
     * 3. Enables switiching between different implementations at runtime.
     * 4. Avoids redundant code by sharaing common logic between abstractions.
     * 
     * DISADVANTAGES:
     * 1. Introduces an additional layer which may not be necessary for simple applications.
     * 2. The seperation between abstraction and implementation can create confusions.
     * 3. It can give a slight overhead.
     */

}
