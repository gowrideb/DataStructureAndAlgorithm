package scaler.module1.class2;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.solve(arr, 2));

    }

    /**
     * FUNCTION solve(arr, B):
     * 
     * 1. INITIALIZE 'count' to 0.
     * - WHY: This is our counter. We start at zero because we haven't
     * started looking through the array yet.
     * 
     * 2. LOOP: For each number 'num' in the array 'arr':
     * 
     * a. COMPARE 'num' with the target value 'B':
     * - IF 'num' is equal to 'B':
     * Increment 'count' by 1.
     * - ELSE:
     * Keep 'count' exactly as it is (add nothing).
     * 
     * 3. RETURN 'count'.
     * 
     * @param arr
     * @param B
     * @return
     */
    public int solve(int[] arr, int B) {
        int count = 0;
        for (int num : arr) {
            count += num == B ? 1 : 0;
        }
        return count;
    }
}
