package scaler.module1.class2;

public class CountOfElements {
    /**
     * @ProblemDescription
     *                     Given an array A of N integers.
     *                     Count the number of elements that have at least 1
     *                     elements greater than
     *                     itself.
     * @ProblemConstraints
     *                     1 <= N <= 103
     *                     1 <= A[i] <= 109
     *
     * @InputFormat First and only argument is an array of integers A.
     * @OutputFormat Return the count of elements.
     * @ExampleInput
     *               Input 1: A = [3, 1, 2]
     *               Input 2: A = [5, 5, 3]
     * @ExampleOutput
     *                Output 1: 2
     *                Output 2: 1
     */
    public static void main(String[] args) {
        int[] arr = { 5, 5, 3 };
        CountOfElements countOfElements = new CountOfElements();
        System.out.println(countOfElements.solve(arr));

    }

    public int solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxCount = 0;

        for (int num : arr) {
            if (num > max) {
                max = num;
                maxCount = 1;

            } else if (num == max) {
                maxCount++;
            }
        }

        return (arr.length - maxCount);
    }
}
