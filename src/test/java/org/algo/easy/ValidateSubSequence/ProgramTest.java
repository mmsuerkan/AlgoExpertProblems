package org.algo.easy.ValidateSubSequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    @Test
    public void TestCase1() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        Assertions.assertEquals(true, Program.isValidSubsequence(array, sequence));
    }
}