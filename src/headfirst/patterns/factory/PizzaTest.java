package headfirst.patterns.factory;

import headfirst.patterns.factory.pizza.Pizza;
import headfirst.patterns.factory.store.ChicagoPizzaStore;
import headfirst.patterns.factory.store.NYPizzaStore;
import headfirst.patterns.factory.store.PizzaStore;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-24
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("veggie");
        System.out.println("BerBer ordered a " + pizza1.getName() + "\n");

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("FerFer ordered a " + pizza2.getName() + "\n");
    }
}
