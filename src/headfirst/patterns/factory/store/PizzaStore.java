package headfirst.patterns.factory.store;

import headfirst.patterns.factory.SimplePizzaFactory;
import headfirst.patterns.factory.pizza.Pizza;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-24
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
