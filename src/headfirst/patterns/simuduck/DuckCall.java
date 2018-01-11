package headfirst.patterns.simuduck;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-10
 */
public class DuckCall {
    QuackBehavior quackBehavior;

    public void makeDuckCall() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
