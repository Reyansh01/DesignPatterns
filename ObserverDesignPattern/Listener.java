package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Listener {
    
    private List<Observer> observers = new ArrayList<>();

    private String notify;

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(Observer observer: observers) {
            observer.notifyNow(notify); // if we want to remove the listner post listen first time then we can remove it.
            // this.removeListeners(observer);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void addListeners(Observer observer) {
        observers.add(observer);
    }

    public void removeListeners(Observer observer) {
        observers.remove(observer);
    }

}
