package org.algo.easy.RemoveDuplicates;

public class Program {
    // This is an input class. Do not edit.
    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node removeDuplicatesFromLinkedList(Node root) {

        Node curr = root;
        Node next = root.next;

        while(next != null){

            if(curr.value == next.value){
                curr.next = next.next;
                next = curr.next;
            }else{
                curr = next;
                next = next.next;
            }
        }

        return root;
    }
}
