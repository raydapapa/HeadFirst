package headfirst.patterns.decorator;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
