import java.time.Instant;

public class GCD {

    // recursiveGcd(8,12) == 4
    public int recursiveGcd(int a, int b) {
        if (a == 0 || b == 0) return a + b; // base case
        return recursiveGcd(b, a % b); // recursive case
    }

    public int iterativeGcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
