package headfirst.patterns.factory.store;

import headfirst.patterns.factory.SimplePizzaFactory;
import headfirst.patterns.factory.pizza.*;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-24
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("greek")) {
            return new NYStyleGreekPizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
