package javase;

public class MathUtil {
    public static long CAL_COUNT = 0;

    public static long calFactorial(long n) {
        if (n < 0) throw new NumberFormatException("Has to be a positive integer!");
        if (n == 0) return 1;
        return calFactorial(n - 1) * n;
    }

    public static long calCombineKandN(long k, long n) {
        if (k < 0 || n < 0) throw new NumberFormatException("Both n and k have to be positive integers!");
        if (n - k < 0) throw new NumberFormatException("N can't be less than k!");
        return calFactorial(n) / (calFactorial(k) * calFactorial(n - k));
    }

    public static long calCombineKandNplus(long k, long n) {
        if (k < 0 || n < 0) throw new NumberFormatException("Both n and k have to be positive integers!");
        if (n - (k - 1) < 0) throw new NumberFormatException("N can't be less than k-1!");
        return calCombineKandN(k-1, n) + calCombineKandN(k, n);
    }


    public static long calPenalty(int base, int times) {
        if (times == 1) return 0;
        return (long) Math.pow((double)base, (double)(times - 1)) * 10;

    }

    public static void main(String[] args) {

//        for (int n = 0; n < 10; n++) {
//            for (int k = 0; k < 10; k++) {
//                if (n - (k - 1) < 0 || n - k < 0 || k - 1 < 0) {
//                    continue;
//                }
//                System.out.print("Cp(" + k + "," + n + ")=" + calCombineKandNplus(k,n) + " ");
//            }
//            System.out.println("\n");
//        }

        long penalty = calPenalty(2, 10);
        System.out.println("Penalty for the 10th time is: " + penalty);

    }
}
