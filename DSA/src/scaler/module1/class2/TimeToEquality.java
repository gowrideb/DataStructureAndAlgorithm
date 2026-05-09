package scaler.module1.class2;

public class TimeToEquality {
    /**
     * @ProblemDescription
     *                     Given an integer array A of size N. In one second, you
     *                     can increase the value of one element by 1.
     *                     Find the minimum time in seconds to make all elements of
     *                     the array equal.
     * @ProblemConstraints
     *                     1 <= N <= 1000000
     *                     1 <= A[i] <= 1000
     * @InputFormat First argument is an integer array A.
     * @OutputFormat Return an integer denoting the minimum time to make all
     *               elements equal.
     * @ExampleInput A = [2, 4, 1, 3, 2]
     * @ExampleOutput 8
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 2 };
        TimeToEquality timeToEquality = new TimeToEquality();
        System.out.println(timeToEquality.solve(arr));

    }

    /**
     * @FUNCTION solve(arr):
     * 
     * 1. GET the size of the array and store it in 'n'.
     * - WHY: To understand how many elements we need to process.
     * 
     * 2. INITIALIZE 'max' to the smallest possible integer value.
     * - This will store the maximum value in the array.
     * 
     * 3. LOOP through each element 'num' in 'arr':
     * IF 'num' is greater than 'max':
     * SET 'max' = 'num'
     * - WHY: We need to find the target value that all elements
     * should become (the maximum element).
     * 
     * 4. INITIALIZE 'requiredSec' = 0.
     * - This variable will accumulate the total seconds needed.
     * 
     * 5. LOOP through each element 'num' in 'arr':
     * ADD ('max' - 'num') to 'requiredSec'
     * - WHY: Each element needs to increase by (max - num) steps,
     * and each increment takes 1 second.
     * 
     * 6. RETURN 'requiredSec' as the minimum time to make all elements equal.
     * 
     * @param arr
     * @return
     */
    public int solve(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }
        int requiredSec = 0;
        for (int num : arr) {
            requiredSec += max - num;
        }
        return requiredSec;
    }

}
