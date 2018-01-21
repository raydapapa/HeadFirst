package headfirst.patterns.decorator;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
