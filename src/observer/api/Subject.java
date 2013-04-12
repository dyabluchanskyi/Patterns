package observer.api;

import observer.api.Observer;

/**
 * Subject is a class which has an information,
 * which will sent to the observers.
 * User: Dmytro Iabluchanskyi
 * Date: 4/9/13
 * Time: 12:29 AM
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
