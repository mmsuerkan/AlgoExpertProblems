package org.problems.easy.TwoNumberSum.ValidateSubSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
    @Test
    public void TestCase1() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        assertEquals(true, Program.isValidSubsequence(array, sequence));
    }
}
