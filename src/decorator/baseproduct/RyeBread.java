package decorator.baseproduct;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/23/13
 * Time: 11:19 PM
 */
public class RyeBread implements Product {


    @Override
    public String getDescription() {
        return "Rye bread with butter";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
