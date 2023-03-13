package org.algo.easy.RemoveDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
    public Program.Node addMany(Program.Node ll, List<Integer> values) {
        Program.Node current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new Program.Node(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(Program.Node ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        Program.Node current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void TestCase1() {
        Program.Node input = new Program.Node(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        Program.Node output = new Program().removeDuplicatesFromLinkedList(input);
        assertEquals(expectedNodes,getNodesInArray(output));
    }
}
