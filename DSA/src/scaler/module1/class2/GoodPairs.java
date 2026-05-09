package scaler.module1.class2;

import java.util.HashMap;

public class GoodPairs {
    /**
     * @Problem Descriptions
     *          Given an array A and an integer B. A pair(i, j) in the array is a
     *          good pair
     *          if i != j and (A[i] + A[j] == B). Check if any good pair exist or
     *          not.
     * @Example Input
     *          Input 1: A = [1,2,3,4] B = 7 | O/P 1
     *          Input 2: A = [1,2,4] B = 4 | O/P 0
     *          Input 3: A = [1,2,2] B = 4 | O/P 1
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int B = 7;
        GoodPairs goodPairs = new GoodPairs();
        goodPairs.solve(arr, B);

    }

    /**
     * 
     * @PseudoCode
     * @FUNCTION solve(A, B):
     * 
     *           1. INITIALIZE an empty HashMap called 'countsMap'.
     *           - ACTION: This will store (Number -> Frequency).
     *           - WHY: Unlike a HashSet, a HashMap tells us HOW MANY times we've
     *           seen a number.
     *           This is crucial for counting all possible pairs in an array with
     *           duplicates.
     * 
     *           2. INITIALIZE 'pairedCount' to 0.
     *           - WHY: This acts as our running total of successful pairs found.
     * 
     *           3. LOOP through each 'num' in array A:
     * 
     *           a. CALCULATE 'key' = B - num.
     *           - WHY: This 'key' is the "missing piece" needed to reach the target
     *           sum B.
     * 
     *           b. IF 'countsMap' contains 'key':
     *           - ACTION: ADD the value (frequency) of 'key' to 'pairedCount'.
     *           - WHY: If we've seen the 'key' 3 times before, the current 'num'
     *           can pair
     *           with each of those 3 occurrences, creating 3 new valid pairs.
     * 
     *           c. UPDATE 'countsMap': Increment the count for 'num' by 1.
     *           - ACTION: countsMap.put(num, countsMap.getOrDefault(num, 0) + 1)
     *           - WHY: We record that we've seen this 'num'. We do this AFTER
     *           checking
     *           for the 'key' to ensure a number doesn't pair with itself (unless
     *           there's a separate copy of it already in the map).
     * 
     *           4. RETURN 'pairedCount'.
     * @param A
     * @param B
     * @return
     */

    public int solve(int[] A, int B) {
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        int pairedCount = 0;
        for (int num : A) {
            int key = B - num;
            if (countsMap.containsKey(key)) {
                pairedCount += countsMap.get(key);
            }
            countsMap.put(num, countsMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("hSet: " + countsMap);
        System.err.println("count: " + pairedCount);
        return pairedCount;
    }

}
