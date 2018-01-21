package headfirst.patterns.decorator;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
