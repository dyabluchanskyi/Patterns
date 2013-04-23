package decorator.toppings;

import decorator.baseproduct.Product;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/23/13
 * Time: 11:28 PM
 */
public class Salami extends ToppingDecorator {

    private Product product;

    public Salami(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", salami";
    }

    @Override
    public double cost() {
        return product.cost() + 0.53;
    }
}
