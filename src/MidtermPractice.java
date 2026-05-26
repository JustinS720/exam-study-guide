import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.

        // findLongestWord
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");
        System.out.println(findLongestWord(fruits)); //output should be banana

        // countLongWords
        Map<String, Integer> words = new HashMap<>();
        words.put("why", 7);
        words.put("hello", 8);
        words.put("brilliant", 99);
        words.put("world", 15);
        words.put("amazing", 17);
        System.out.println("Words that are longer than 5, are " + countLongWords(words)); //Output should be 2

        // findAverage
        float[] nums = {1.5f, 3.5f, 2.0f, 3.0f};
        System.out.println("Average: " + findAverage(nums)); //Output should be 2.5

        // countOddNumbers
        Map<String, Integer> oddNums = new HashMap<>();
        oddNums.put("a", 7);
        oddNums.put("x", 4);
        oddNums.put("z", 5);
        System.out.println("Odd Numbers: "  + countOddNumbers(oddNums)); //Output should be 2

        // allDivisibleBy3
        int [] int1 = {3, 6, 9};
        int [] int2 = {3, 4, 6, 9};

        System.out.println("int1 = " + allDivisibleBy3(int1)); // should be true
        System.out.println("int2 = " + allDivisibleBy3(int2)); // should be false

        // allStartWithA
        List<String> a1 = new ArrayList<>();
        a1.add("apple");
        a1.add("apricot");
        a1.add("avocado");
        System.out.println("a1: " + allStartWithA(a1)); // should be true

        List<String> a2 = new ArrayList<>();
        a2.add("apple");
        a2.add("banana");
        a2.add("avocado");
        System.out.println("a2: " + allStartWithA(a2)); // should be false


    }

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
        String longestWord = "";
        for (String w : list) {
            if (w.length() > longestWord.length()) {
                longestWord = w;
            }
        }
        
        return longestWord;
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        int count = 0;
        for (String word : map.keySet()) {
            if (word.length() > 5) {
                count++;
            }
        }
        return count;
    }

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        double average = 0.0;
        double count = 0;
        for (double num : arr) {
            average += num;
            count++;
        }

        average = average / count;
        return average;
    }

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;
        for (String w : map.keySet()) {
            if (map.get(w) % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        for (int n : arr) {
            if (n % 3 != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        for (String w : list) {
            if (w.charAt(0) != 'a') {
                return false;
            }
        }
        return true;
    }

    /**
     * OPTIONAL MORE CHALLENGING PROBLEM
     * NOT REQUIRED
     *
     * Determines if the array can be split into two contiguous subarrays with equal sums.
     * The method checks if there exists an index where the sum of elements to the left of the index
     * is equal to the sum of elements to the right. Both subarrays must be contiguous.
     *
     * @param arr an array of integers to evaluate
     * @return true if there exists a split point where the left and right contiguous subarrays have equal sums, false otherwise
     *
     * Example:
     * Input: [1, 3, 8, 2, 1, 2, 7]
     * Output: true (since [1, 3, 8] and [2, 1, 2, 7] both sum to 12)
     *
     * Input: [1, 2, 3, 4, 5]
     * Output: false (no contiguous split results in equal sums)
     */
    public static boolean canPartitionWithEqualSums(int[] arr) {
        return false;
    }

}