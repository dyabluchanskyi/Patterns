package observer;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/12/13
 * Time: 11:40 PM
 */
public class Starter {
    public static void main(String[] args) {
        StatusChecker subject = new StatusChecker();
        subject.registerObserver(new StatusDisplay());
        subject.registerObserver(new StatusAnalyzier());
        subject.setStatus("First status");
        subject.setStatus("Second status");
        subject.setStatus("Third status");
    }
}
