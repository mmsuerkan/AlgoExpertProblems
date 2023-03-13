package org.algo.easy.FindClosestValueInBst;

import java.util.ArrayList;

public class Program {


    public static int findClosestValueInBst(BST tree, int target) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(tree.value);
        if (tree.left != null) {
            list.add(findClosestValueInBst(tree.left, target));
        }
        if (tree.right != null) {
            list.add(findClosestValueInBst(tree.right, target));
        }
        int closest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (Math.abs(target - list.get(i)) < Math.abs(target - closest)) {
                closest = list.get(i);
            }
        }
        return closest;
    }
    public static int findClosestValueInBst2(BST tree, int target) {


        return findClosestValueInBst2(tree,target,Integer.MAX_VALUE);
    }

    private static int findClosestValueInBst2(BST tree, int target, int closest) {

        if(Math.abs(target - tree.value) < Math.abs(target - closest) ){
            closest = tree.value;
        }
        if(target < tree.value && tree.left != null){
          return findClosestValueInBst2(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBst2(tree.right, target, closest);
        }else {
            return closest;
        }

    }

    static class BST {
        public int value;
        public BST left;
        public BST right;


        public BST(int value) {
            this.value = value;
        }
    }
}
