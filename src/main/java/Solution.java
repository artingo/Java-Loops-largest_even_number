import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] numbers1 = {75, 59, 73, 19, 37, 9, 5, 17, 77, 91};
        System.out.println("numbers1 = " + Arrays.toString(numbers1));
        System.out.println("largest even number = " + largestEvenNumber(numbers1));

        int[] numbers2 = {77, 15, 1, 16, 59, 85, 12, 88, 54, 63};
        System.out.println("\nnumbers2 = " + Arrays.toString(numbers2));
        System.out.println("largest even number = " + largestEvenNumber(numbers2));

        int[] numbers3 = {8, 84, 21, 19, 53, 78, 29, 80, 49, 29};
        System.out.println("\nnumbers3 = " + Arrays.toString(numbers3));
        System.out.println("largest even number = " + largestEvenNumber(numbers3));
    }

    /**
     * Function that finds the largest even number in an array of positive integers and returns -1 if not found
     *
     * @param numbers - Array of positive integers
     * @return largest even number, or -1 if there is none
     */
    public static int largestEvenNumber(int[] numbers) {
        int largestEven = -1;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            // is current number even?
            if (currentNumber % 2 == 0) {
                // did you find a new largest even number?
                if (currentNumber > largestEven) {
                    largestEven = currentNumber;
                }
            }
        }
        return largestEven;
    }
}
