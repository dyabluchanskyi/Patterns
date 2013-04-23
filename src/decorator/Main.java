package decorator;

import decorator.baseproduct.Product;
import decorator.baseproduct.RyeBread;
import decorator.toppings.Mozarella;
import decorator.toppings.Salad;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/23/13
 * Time: 11:32 PM
 */
public class Main {

    public static void main(String[] args) {
        Product product = new Mozarella(new Salad(new RyeBread()));

        System.out.println(product.cost());
    }
}
