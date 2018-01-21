package headfirst.patterns.decorator;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
