package ObserverPattern;

public interface Subject { //subject must implement these functions
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}