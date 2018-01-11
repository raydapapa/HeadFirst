package headfirst.patterns.simuduck;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-10
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
