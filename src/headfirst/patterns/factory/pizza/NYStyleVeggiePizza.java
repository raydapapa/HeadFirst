package headfirst.patterns.factory.pizza;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-24
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Vegetable Pizza";
        dough = "Thin Crust Dough";
        sauce = "Salsa Sauce";

        toppings.add("Grated Cheddar Cheese");
    }
}
