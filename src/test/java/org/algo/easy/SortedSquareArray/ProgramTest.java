package org.algo.easy.SortedSquareArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    @Test
    public void TestCase1() {
        var input = new int[] {1, 2, 3, 5, 6, 8, 9};
        var expected = new int[] {1, 4, 9, 25, 36, 64, 81};
        var actual = new Program().sortedSquaredArray(input);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertTrue(expected[i] == actual[i]);
        }
    }
}
