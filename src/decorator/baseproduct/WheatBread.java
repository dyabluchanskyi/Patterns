package decorator.baseproduct;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/23/13
 * Time: 11:20 PM
 */
public class WheatBread implements Product {
    @Override
    public String getDescription() {
        return "Wheat Bread with butter";
    }

    @Override
    public double cost() {
        return 0.4;
    }
}
