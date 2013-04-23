package decorator.toppings;

import decorator.baseproduct.Product;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/23/13
 * Time: 11:31 PM
 */
public class Salad extends ToppingDecorator {

    private Product product;

    public Salad(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", salad";
    }

    @Override
    public double cost() {
        return product.cost() + 0.23;
    }
}
