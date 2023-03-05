package org.algo.easy.TwoNumberSum.firstSolution;

import org.algo.easy.TwoNumberSum.TwoNumberSum;
import org.algo.easy.TwoNumberSum.firstSolution.TwoNumberSumFirstSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TwoNumberSumFirstSolutionTest {

    private static TwoNumberSum twoNumberSum;

    @BeforeAll
    static void setUp() {
        twoNumberSum = new TwoNumberSumFirstSolution();
    }

    @Test
    void testCase1() {

        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{11, -1}, result);
    }
    @Test
    void testCase2() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {4, 6};
        int targetSum = 10;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{4, 6}, result);
    }
    @Test
    void testCase3() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {4, 6, 1};
        int targetSum = 5;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{4, 1}, result);
    }
    @Test
    void testCase4() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {4, 6, 1, -3};
        int targetSum = 3;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{6, -3}, result);
    }
    @Test
    void testCase5() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 17;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{8,9}, result);
    }
    @Test
    void testCase6() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int targetSum = 18;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{3, 15}, result);
    }
    @Test
    void testCase7() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {-7, -5, -3, -1, 0, 1, 3, 5, 7};
        int targetSum = -5;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{-5, 0}, result);
    }
    @Test
    void testCase8() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 163;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{210, -47}, result);
    }
    @Test
    void testCase9() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 164;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{}, result);
    }
    @Test
    void testCase10() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 15;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{}, result);
    }
    @Test
    void testCase11() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {14};
        int targetSum = 15;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{}, result);
    }
    @Test
    void testCase12() {
        TwoNumberSumFirstSolution twoNumberSumFirstSolution = new TwoNumberSumFirstSolution();
        int[] array = {15};
        int targetSum = 15;
        int[] result = twoNumberSumFirstSolution.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{}, result);
    }
}