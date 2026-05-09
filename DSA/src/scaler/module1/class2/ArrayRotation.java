package scaler.module1.class2;

public class ArrayRotation {

    public static void main(String[] args) {

    }

    /**
     * @PseudoCode
     * @FUNCTION solve(arr, k):
     * 
     *           1. GET the size of the array and store it in 'n'.
     * 
     *           2. ADJUST 'k' using 'k = k % n'.
     *           - WHY: If you rotate a 5-element array 6 times, it's the
     *           same as rotating it just 1 time.
     * 
     *           3. REVERSE the entire array from index 0 to n - 1.
     *           - This puts the elements intended for the front at the beginning,
     *           but in the wrong order.
     * 
     *           4. REVERSE only the first 'k' elements (index 0 to k - 1).
     *           - This puts the first part in the correct order.
     * 
     *           5. REVERSE the remaining elements (index k to n - 1).
     *           - This puts the second part in the correct order.
     * 
     *           6. RETURN the modified array.
     * @param arr
     * @param k
     * @return
     */
    public int[] solve(int[] arr, int k) {
        int arrLenght = arr.length;
        k = k % arrLenght;
        reverse(arr, 0, arrLenght - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arrLenght - 1);
        return arr;
    }

    /**
     * @PseudoCode
     * @FUNCTION solve(arr, start, end):
     * 
     *           1. LOOP: While 'start' index is less than or equal to 'end' index:
     *           - WHY: We want to swap elements from the outside moving inward.
     *           When the pointers meet or cross, the range is fully reversed.
     * 
     *           a. CREATE a temporary variable 'temp' and store the value of
     *           arr[start].
     *           - WHY: We need a backup of the first value so we don't lose it
     *           when we overwrite it.
     * 
     *           b. OVERWRITE arr[start] with the value of arr[end].
     *           - ACTION: arr[start] = arr[end]
     * 
     *           c. OVERWRITE arr[end] with the backup value 'temp'.
     *           - ACTION: arr[end] = temp
     *           - NOTE: Steps a, b, and c together perform a "SWAP" of the two
     *           elements.
     * 
     *           d. INCREMENT 'start' by 1.
     *           - WHY: Move the left pointer one step toward the middle.
     * 
     *           e. DECREMENT 'end' by 1.
     *           - WHY: Move the right pointer one step toward the middle.
     * 
     *           2. RETURN the modified array 'arr'.
     * 
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public int[] reverse(int[] arr, int start, int end) {
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
