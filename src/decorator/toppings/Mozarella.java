package decorator.toppings;

import decorator.baseproduct.Product;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/23/13
 * Time: 11:30 PM
 */
public class Mozarella extends ToppingDecorator {

    private Product product;

    public Mozarella(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", mozarella";
    }

    @Override
    public double cost() {
        return product.cost() + 0.39;
    }
}
