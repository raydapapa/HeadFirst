package headfirst.patterns.factory.pizza;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-24
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
