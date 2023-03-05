package org.algo.easy.TwoNumberSum.secondSolution;

import org.algo.easy.TwoNumberSum.TwoNumberSum;
import org.algo.easy.TwoNumberSum.firstSolution.TwoNumberSumFirstSolution;
import org.algo.easy.TwoNumberSum.secondSolution.TwoNumberSumSecondSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TwoNumberSumSecondSolutionTest {

    private static TwoNumberSum twoNumberSum;

    @BeforeAll
    static void setUp() {
        twoNumberSum = new TwoNumberSumSecondSolution();
    }

    @Test
    void testCase1() {

        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{-1,11}, result);
    }
    @Test
    void testCase2() {

        int[] array = {4, 6};
        int targetSum = 10;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{6,4}, result);
    }
    @Test
    void testCase3() {

        int[] array = {4, 6, 1};
        int targetSum = 5;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{1,4}, result);
    }
    @Test
    void testCase4() {

        int[] array = {4, 6, 1, -3};
        int targetSum = 3;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{-3,6}, result);
    }
    @Test
    void testCase5() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 17;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{9,8}, result);
    }
    @Test
    void testCase6() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int targetSum = 18;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{15,3}, result);
    }
    @Test
    void testCase7() {

        int[] array = {-7, -5, -3, -1, 0, 1, 3, 5, 7};
        int targetSum = -5;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{0,-5}, result);
    }
    @Test
    void testCase8() {

        int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 163;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{-47,210}, result);
    }
    @Test
    void testCase9() {

        int[] array = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 164;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{}, result);
    }
    @Test
    void testCase10() {

        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 15;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{}, result);
    }
    @Test
    void testCase11() {

        int[] array = {14};
        int targetSum = 15;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{}, result);
    }
    @Test
    void testCase12() {

        int[] array = {15};
        int targetSum = 15;
        int[] result = twoNumberSum.twoNumberSum(array, targetSum);
        Assertions.assertArrayEquals(new int[]{}, result);
    }
}