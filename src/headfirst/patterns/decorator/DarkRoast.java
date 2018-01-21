package headfirst.patterns.decorator;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
