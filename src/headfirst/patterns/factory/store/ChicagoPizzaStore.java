package headfirst.patterns.factory.store;

import headfirst.patterns.factory.SimplePizzaFactory;
import headfirst.patterns.factory.pizza.*;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-24
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("greek")) {
            return new ChicagoStyleGreekPizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
