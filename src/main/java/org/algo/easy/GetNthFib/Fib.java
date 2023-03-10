package org.algo.easy.GetNthFib;

public class Fib {
    public static int getNthFib(int n) {
        // Write your code here.
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return getNthFib(n - 1) + getNthFib(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(getNthFib(6));
    }

}
