package headfirst.patterns.simuduck;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-10
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

