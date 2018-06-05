package javase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-03-20
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add("" + i);
        }

        /* This is wrong! Concurrency issue */
//        for (String item : list) {
//            if ("3".equals(item)) {
//                list.remove(item);
//            }
//        }

        /* Should do it like this */
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (Objects.equals(item, "3")) {
                iterator.remove();
            }
        }
        list.forEach(s -> System.out.println(s));
    }
}
