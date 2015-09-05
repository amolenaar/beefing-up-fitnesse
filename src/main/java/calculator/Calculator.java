package calculator;

public class Calculator {

    public static String divide(int n, int d) {
        int c = gcd(n, d);

        if (c == d) {
            return Long.toString(n / d);
        }

        return "" + (n / c) + "/" + (d / c);
    }

    private static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a % b);
    }
}
