package ObserverDesignPattern;

public class ObserverImpl implements Observer {

    public void notifyNow(String notify) {
        System.out.println("This is to notify: " + notify);
    }

}
