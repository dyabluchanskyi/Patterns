package observer;

import observer.api.Observer;
import observer.api.Subject;

import java.util.ArrayList;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/9/13
 * Time: 12:33 AM
 */
public class StatusChecker implements Subject {

    private ArrayList<Observer> observers;

    private String status;

    public StatusChecker() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int position = observers.indexOf(observer);
        if(position >= 0){
            observers.remove(position);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i<observers.size();i++){
            observers.get(i).update(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
