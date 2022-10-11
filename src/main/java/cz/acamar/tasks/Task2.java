package cz.acamar.tasks;

import java.util.LinkedList;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        LinkedList<Integer> result = new LinkedList<>();
        int len = input.length;
        int rBoard = len - 1;
        int lBoard = 0;
        while (lBoard <= rBoard){
            int lSqr = (int) Math.pow(input[lBoard], 2.0);
            int rSqr = (int) Math.pow(input[rBoard], 2.0);
            if (lSqr >= rSqr) {
                result.add(0, lSqr);
                lBoard++;
            } else {
                result.add(0, rSqr);
                rBoard--;
            }
        }
        return result.stream().mapToInt(value -> value).toArray();
        //alternative solution:
        //return Arrays.stream(input).map(e -> (int) Math.pow(Math.abs(e), 2.0)).sorted().toArray();
    }
}
