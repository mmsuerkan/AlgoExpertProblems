package org.algo.easy.BranchSums;

import java.util.ArrayList;
import java.util.List;

public class Program {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> sums = new ArrayList<>();

        return branchSums(root, 0, sums);
    }

    private static List<Integer> branchSums(BinaryTree root, int currentSum, ArrayList<Integer> allSum) {

        if (root == null) return allSum;

        currentSum += root.value;

        if (root.left == null && root.right == null) {
            allSum.add(currentSum);
        }
        branchSums(root.left, currentSum, allSum);
        branchSums(root.right, currentSum, allSum);

        return allSum;

    }

    public static void main(String[] args) {

        Program.BinaryTree tree = new Program.BinaryTree(1);
        tree.left = new Program.BinaryTree(2);
        tree.right = new Program.BinaryTree(3);
        tree.left.left = new Program.BinaryTree(4);
        tree.left.right = new Program.BinaryTree(5);
        tree.right.left = new Program.BinaryTree(6);
        tree.right.right = new Program.BinaryTree(7);
        tree.left.left.left = new Program.BinaryTree(8);
        tree.left.left.right = new Program.BinaryTree(9);
        tree.left.right.left = new Program.BinaryTree(10);

        List<Integer> integers = Program.branchSums(tree);
        System.out.println("******************");
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }

    }
}
