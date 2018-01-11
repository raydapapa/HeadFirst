package headfirst.patterns.simuduck;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-10
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
