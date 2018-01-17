package headfirst.exercise;

public class MathUtil {
    public static long CAL_COUNT = 0;

    public static long calFactorial(long n) {
        CAL_COUNT++;
        int factorial = 1;
        if (n < 0) throw new NumberFormatException("Has to be a positive integer!");
        if (n == 0) return 1;
        return calFactorial(n - 1) * n;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            CAL_COUNT = 0;
            System.out.print(i + "! = " + calFactorial(i));
            System.out.println("  calFactorial(long n) was called " + CAL_COUNT + " times");
        }

    }
}
