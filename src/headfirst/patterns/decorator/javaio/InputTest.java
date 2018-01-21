package headfirst.patterns.decorator.javaio;

import java.io.*;

/**
 * Desc
 *
 * @author Papa Ray
 * Created on 2018-01-21
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        InputStream in = null;
        try {
            in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/papa_ray/Documents/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
