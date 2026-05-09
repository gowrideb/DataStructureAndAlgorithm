package scaler.module1.class1;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        for (int i = 0; i <= 100; i++) {
            if (primeNumber.isPrime(i) == true) {
                System.out.print(i + ", ");
            }
        }

    }

    /**
     * @PseudoCode
     * @FUNCTION isPrime(n):
     * 
     *           1. IF n is 0 or 1:
     *           - ACTION: RETURN false.
     *           - WHY: By mathematical definition, prime numbers must be greater
     *           than 1[cite: 21].
     * 
     *           2. IF n is 2 or 3:
     *           - ACTION: RETURN true.
     *           - WHY: These are the first two prime numbers and serve as the base
     *           for our optimization[cite: 15, 20].
     * 
     *           3. IF n is divisible by 2 or 3 (n % 2 == 0 OR n % 3 == 0):
     *           - ACTION: RETURN false.
     *           - WHY: This "Early Exit" eliminates roughly 66% of all non-prime
     *           numbers immediately, making the code much faster[cite: 21, 39].
     * 
     *           4. LOOP: Start i at 5, and continue as long as (i * i <= n).
     *           Increase i by 6 each time:
     * 
     *           a. IF n is divisible by i (n % i == 0) OR n is divisible by (i + 2)
     *           (n % (i + 2) == 0):
     *           - ACTION: RETURN false.
     *           - WHY: We are checking if n has any factors. Because we already
     *           ruled out multiples of 2 and 3, all potential primes follow the
     *           pattern 6k ± 1 (like 5 and 7, 11 and 13)[cite: 22, 47, 49].
     * 
     *           b. WHY THE (i * i <= n) CONDITION?
     *           - REASON: You only need to check factors up to the square root of
     *           n. If no factor is found by that point, it is mathematically
     *           impossible for a larger one to exist[cite: 26, 40].
     * 
     *           5. IF the loop finishes without finding a factor:
     *           - ACTION: RETURN true.
     *           - WHY: If no numbers up to the square root could divide n, then n
     *           must be prime[cite: 27].
     */

    public boolean isPrime(int n) {
        if (n == 0 || n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}