package scaler.module1.class2;

public class MinAndMax {
    /**
     * 
     * @Problem Description
     *          Given an array A of size N. You need to find the sum of Maximum and
     *          Minimum element in the given array.
     * @Problem Constraints
     *          1 <= N <= 105
     *          -109 <= A[i] <= 109
     * @InputFormat First argument A is an integer array.
     * @OutputFormat Return the sum of maximum and minimum element of the array
     * @ExampleInput
     *               Input 1: A = [-2, 1, -4, 5, 3]
     *               Input 2: A = [1, 3, 4, 1]
     * @ExampleOutput
     *                Output 1: 1
     *                Output 2: 5
     */
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        MinAndMax minAndMax = new MinAndMax();
        System.out.println(minAndMax.solve(num));

    }

    /**
     * @PseudoCode
     * @FUNCTION solve(arr):
     * 
     *           1. INITIALIZE 'min' to the largest possible integer value.
     *           - WHY: This ensures that the first number we see in the array
     *           will definitely be smaller than 'min' and replace it.
     * 
     *           2. INITIALIZE 'max' to the smallest possible integer value.
     *           - WHY: This ensures that the first number we see in the array
     *           will definitely be larger than 'max' and replace it.
     * 
     *           3. LOOP: For each number 'num' in the array 'arr':
     * 
     *           a. COMPARE 'num' with the current 'min':
     *           - IF 'num' is smaller than 'min', update 'min' with 'num'.
     *           - ELSE, keep 'min' as it is.
     * 
     *           b. COMPARE 'num' with the current 'max':
     *           - IF 'num' is larger than 'max', update 'max' with 'num'.
     *           - ELSE, keep 'max' as it is.
     * 
     *           4. CALCULATE the sum of 'max' and 'min'.
     * 
     *           5. RETURN the result.
     * @param arr
     * @return
     */
    public int solve(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            min = num > min ? min : num;
            max = num > max ? num : max;
        }
        return max + min;
    }
}
