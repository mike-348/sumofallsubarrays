/**
 Given:
 An array of integers

 Task:
 Add up the sums of all possible sub arrays

 Example:
 {1, 3, 5, 4}
 +1
 +1+3
 +1+3+5
 +1+3+5+4
 +3
 +3+5+4
 +5
 +5+4
 +4
 =68
 */

public class SumSubArrays {

    /*
    My original solution,
    a more optimized solution,
    and the most optimized O(n) solution
     */
    public Integer sumSubArrayOn3(Integer[] arr) {
        Integer result = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    result += arr[k];
                }
            }
        }
        return result;
    }


    public Integer sumSubArrayOn2(Integer[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];
            sum = sum + currentSum;
            for (int j = i + 1; j < arr.length; j++) {
                currentSum = currentSum + arr[j];
                sum = sum + currentSum;
            }
        }
        return sum;
    }


    public Integer sumSubArrayOn(Integer[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i] * (i + 1) * (n - i);
        }
        return sum;
    }
}
