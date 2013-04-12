package observer;

import observer.api.Observer;
import observer.api.ViewElement;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/12/13
 * Time: 11:34 PM
 */
public class StatusDisplay implements Observer, ViewElement {

    private String status;

    @Override
    public void update(String status) {
        this.status = status;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current status - " + status);
    }
}
