import NeetCodeQuestions.TwoSum.TwoSumSolution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 2,3,4,5};
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        System.out.println(Arrays.toString(twoSumSolution.twoSum(arr, 3)));
    }
}