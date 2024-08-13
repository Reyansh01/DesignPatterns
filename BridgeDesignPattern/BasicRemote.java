package BridgeDesignPattern;

public class BasicRemote implements Remote {

    @Override
    public void startTv() {
        System.out.println("Starting TV using BasicRemote..");
    }
    
}
