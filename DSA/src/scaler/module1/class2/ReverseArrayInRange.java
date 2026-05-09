package scaler.module1.class2;

import java.util.Arrays;

public class ReverseArrayInRange {

    /**
     * ReverseArrayInRange
     * 
     * @Problem Description
     * 
     *          Given an array A of N integers and also given two integers B and C.
     *          Reverse the elements of the array A within the given inclusive range
     *          [B, C].
     * @Problem Constraints
     *          1 <= N <= 105
     *          1 <= A[i] <= 109
     *          0 <= B <= C <= N - 1
     * @InputFormat
     *              The first argument A is an array of integer.
     *              The second and third arguments are integers B and C
     * @OutputFormat
     *               Return the array A after reversing in the given range.
     * @ExampleInput
     *               Input 1: A = [1, 2, 3, 4] B = 2 C = 3
     *               Input 2: A = [2, 5, 6] B = 0 C = 2
     * @ExampleOutput
     *                Output 1: [1, 2, 4, 3]
     *                Output 2: [6, 5, 2]
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int start = 0, end = 3;
        ReverseArrayInRange rair = new ReverseArrayInRange();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rair.solve(arr, start, end)));

    }

    /**
     * @PseudoCode
     * @FUNCTION solve(arr, start, end):
     * 
     * 1. LOOP: While 'start' index is less than or equal to 'end' index:
     * - WHY: We want to swap elements from the outside moving inward.
     * When the pointers meet or cross, the range is fully reversed.
     * 
     * a. CREATE a temporary variable 'temp' and store the value of arr[start].
     * - WHY: We need a backup of the first value so we don't lose it
     * when we overwrite it.
     * 
     * b. OVERWRITE arr[start] with the value of arr[end].
     * - ACTION: arr[start] = arr[end]
     * 
     * c. OVERWRITE arr[end] with the backup value 'temp'.
     * - ACTION: arr[end] = temp
     * - NOTE: Steps a, b, and c together perform a "SWAP" of the two elements.
     * 
     * d. INCREMENT 'start' by 1.
     * - WHY: Move the left pointer one step toward the middle.
     * 
     * e. DECREMENT 'end' by 1.
     * - WHY: Move the right pointer one step toward the middle.
     * 
     * 2. RETURN the modified array 'arr'.
     * 
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public int[] solve(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
