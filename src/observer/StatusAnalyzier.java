package observer;

import observer.api.Observer;
import observer.api.ViewElement;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/12/13
 * Time: 11:37 PM
 */
public class StatusAnalyzier implements Observer, ViewElement {

    private String status;

    @Override
    public void update(String status) {
        status += "%CALCULATING_DATA%";
        this.status = status;
        //some analyze logic

        display();

    }

    @Override
    public void display() {
        System.out.println("Analyzer data - " + status);
    }
}
