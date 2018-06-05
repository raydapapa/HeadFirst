package javase;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-03-21
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        long sec = now.getEpochSecond();
        long nano = now.getNano();

        LocalDateTime rightNow = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATETIME_FORMAT);

        System.out.println(now.toString());
        System.out.println("sec = " + sec);
        System.out.println("nano = " + nano);
        System.out.println(rightNow.format(dtf));
    }
}
