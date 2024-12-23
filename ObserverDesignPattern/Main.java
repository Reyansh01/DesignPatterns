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

    /*
     * 1. It is a behavioral design pattern.
     * 
     * ADVANTAGES:
     * 1. It makes the relation between observers and listeners loosely coupled.
     * 2. New observers can be added without altering the listners code (Support Open/Closed principle).
     * 3. Enables real-time communication between objects.
     * 4. Code is reusable as the listener and observer are seperate.
     * 5. Observers can be added or removed runtime i.e. it supports dynamic relationships.
     * 
     * DISADVANTAGES:
     * 1. Notifying a large number of observers can create a performance overhead.
     * 2. Debugging is complex as tracking the flow of updates is challenging.
     * 3. If observers are not removed properly, then they might create memory leaks.
     * 4. Adds complexity for managing the list of observers.
     */

}
