package headfirst.patterns.simuduck;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-10
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
