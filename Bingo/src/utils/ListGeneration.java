package utils;

import java.util.ArrayList;

import static java.util.Collections.shuffle;


public class ListGeneration {


    /**
     * Generates a sorted list of numbers from a given range.
     *
     * @param min the minimum number of the range
     * @param max the maximum number of the range
     * @return the list of numbers
     */
    public static ArrayList<Integer> generateSortedListOfNumbers(int min, int max) {
        checkRange(min, max);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            numbers.add(i);
        }
        return numbers;
    }


    /**
     * Generates an unsorted list of numbers from a given range.
     *
     * @param min the minimum number of the range
     * @param max the maximum number of the range
     * @return the list of numbers
     */
    public static ArrayList<Integer> generateUnsortedListOfNumbers(int min, int max) {
        checkRange(min, max);
        ArrayList<Integer> numbers = generateSortedListOfNumbers(min, max);
        shuffle(numbers);
        return numbers;
    }

    /**
     * Checks if the range is valid.
     *
     * @param min the minimum number of the range
     * @param max the maximum number of the range
     * @throws RuntimeException if the range is not valid
     */
    private static void checkRange(int min, int max) {
        if (min > max) {
            throw new RuntimeException("The minimum number cannot be greater than the maximum number");
        }
    }
}
