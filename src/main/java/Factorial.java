public class Factorial {

    // 4! = 4 * 3 * 2 * 1
    public int recursiveFactorial(int n) {
        // base case n == 0
        // recursive case n > 0
        if(n > 0) {
            return n * recursiveFactorial(n - 1);
        } else return 1; //
    }

    public int iterativeFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
