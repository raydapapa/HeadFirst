package headfirst.patterns.observer;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
