import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void largestEvenNumber_1() {
        int[] numbers = {75, 59, 73, 19, 37, 9, 5, 17, 77, 91};
        int largestEven = Solution.largestEvenNumber(numbers);
        assertTrue(largestEven == -1);
    }

    @Test
    void largestEvenNumber88() {
        int[] numbers = {77, 15, 1, 16, 59, 85, 12, 88, 54, 63};
        int largestEven = Solution.largestEvenNumber(numbers);
        assertTrue(largestEven == 88);
    }

    @Test
    void largestEvenNumber84() {
        int[] numbers = {8, 84, 21, 19, 53, 78, 29, 80, 49, 29};
        int largestEven = Solution.largestEvenNumber(numbers);
        assertTrue(largestEven == 84);
    }

}