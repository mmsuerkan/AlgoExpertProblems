package org.problems.easy.TwoNumberSum;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ProgramTest {
    @Test
    public void TestCase1() {
        int[] output = Program.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        Assert.assertTrue(output.length == 2);
        Assert.assertTrue(contains(output, -1));
        Assert.assertTrue(contains(output, 11));
    }

    public boolean contains(int[] output, int val) {
        for (var el : output) {
            if (el == val) return true;
        }
        return false;
    }
}
