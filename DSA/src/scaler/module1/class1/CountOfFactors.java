package scaler.module1.class1;

public class CountOfFactors {

    /**
     * 
     * @Problem Description
     *          Given an integer A, you need to find the count of it's factors.
     *          Factor of a number is the number which divides it perfectly
     *          leaving no remainder.
     *          Example : 1, 2, 3, 6 are factors of 6
     * 
     * @Problem Constraints
     *          1 <= A <= 109
     * 
     * @Input Format
     *        First and only argument is an integer A.
     * @Input : 5, 10
     * 
     * @Output Format
     *         Return the count of factors of A.
     * @Input: 2, 4
     * 
     */
    public static void main(String[] args) {
        CountOfFactors cof = new CountOfFactors();
        int num = 10;
        System.out.println("Number of factor of " + num + " is: " + cof.solve(num));

    }

    /**
     * @PseudoCode
     * @FUNCTION solve(n):
     * 
     *           1. IF n is 0 or 1:
     *           - ACTION: RETURN 1.
     *           - WHY: 0 and 1 are handled as base cases; in this context, they
     *           only have one divisor. [cite: 210]
     * 
     *           2. INITIALIZE a counter 'count' to 0.
     * 
     *           3. LOOP: Start i at 1 and continue as long as (i * i <= n):
     * 
     *           a. IF n is divisible by i (n % i == 0):
     * 
     *           i. IF i is the exact square root (i * i == n):
     *           - ACTION: ADD 1 to 'count'.
     *           - WHY: To avoid counting the same divisor (like 5 in 25) twice.
     * 
     *           ii. ELSE:
     *           - ACTION: ADD 2 to 'count'.
     *           - WHY: Divisors come in pairs (like 2 and 6 for 12); if we find
     *           one, we find its partner. [cite: 212, 213]
     * 
     *           4. RETURN 'count'.
     * 
     */
    public int solve(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int count = 0;
        for (int i = 1; (i * i) <= n; i++) {
            if (n % i == 0) {
                count += (i * i == n) ? 1 : 2;
            }
        }
        return count;
    }
}
