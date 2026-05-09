package scaler.module1.class2;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        SecondLargest secondLargest = new SecondLargest();
        System.out.println(secondLargest.solve(arr));

    }

    /**
     * @PseudoCode
     * @FUNCTION solve(arr):
     * 
     *           1. INITIALIZE 'max' to the smallest possible integer value
     *           (Integer.MIN_VALUE).
     *           - WHY: This ensures that the first number we see in the array
     *           will definitely be larger than 'max' and replace it.
     * 
     *           2. INITIALIZE 'secondMax' to the smallest possible integer value
     *           (Integer.MIN_VALUE).
     *           - WHY: This acts as a placeholder for the runner-up value until a
     *           suitable number is found during the loop.
     * 
     *           3. LOOP: For each number 'num' in the array 'arr':
     * 
     *           a. COMPARE 'num' with the current 'max':
     *           - IF 'num' is strictly larger than 'max':
     *           Update 'secondMax' with the current value of 'max' (the old
     *           champion becomes the runner-up).
     *           Update 'max' with 'num' (the new champion).
     * 
     *           b. ELSE IF 'num' is strictly larger than 'secondMax' AND 'num' is
     *           not equal to 'max':
     *           - Update 'secondMax' with 'num'.
     *           - ELSE, keep 'secondMax' as it is.
     * 
     *           4. RETURN 'secondMax'.
     * @param arr
     * @return
     */

    public int solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (max > num && secondMax < num) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
