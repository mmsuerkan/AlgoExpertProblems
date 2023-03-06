package org.algo.easy.BinarySearch.FirstSolution;

import org.algo.easy.BinarySearch.BinarySearch;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchRecursiveTest {

    private static BinarySearch bs;
    @BeforeAll
    static void setUp() {
        bs = new BinarySearchRecursive();
    }

    @Test
    void test1() {
        int[] array = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;

        int result = bs.binarySearch(array, target);
        assertEquals(3, result);
    }

    @Test
    void test2() {
        int [] array = {1, 5, 23, 111};
        int target = 111;

        int result = bs.binarySearch(array, target);
        assertEquals(3, result);
    }

    @Test
    void test3() {
        int [] array = {1, 5, 23, 111};
        int target = 35;

        int result = bs.binarySearch(array, target);
        assertEquals(-1, result);
    }

}