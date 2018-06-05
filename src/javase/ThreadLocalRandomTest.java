package javase;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-03-21
 */
public class ThreadLocalRandomTest {

    public static void main(String[] args) {
        ThreadLocalRandom t = ThreadLocalRandom.current();
        System.out.println(t.nextInt(100));
        System.out.println(t.nextInt(90, 100));
        System.out.println(t.nextInt(50, 60));
    }

}
