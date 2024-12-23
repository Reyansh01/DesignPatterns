package ObserverDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        
        Observer observer = new ObserverImpl();
        Observer observer3 = new ObserverImpl(); // not pasing in the listeners list..

        Listener listener = new Listener();
        listener.addListeners(observer);
        listener.setNotify("Reyansh");

        Observer observer2 = new ObserverImpl();
        listener.addListeners(observer2);
        listener.setNotify("Mishra");

        listener.removeListeners(observer);
        listener.setNotify("Me"); // 'Mishra' and 'Me' are in the list till now.

    }

}
