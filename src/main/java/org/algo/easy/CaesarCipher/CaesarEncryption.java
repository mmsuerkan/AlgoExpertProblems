package org.algo.easy.CaesarCipher;

public class CaesarEncryption {

    public static String caesarCypherEncryptor(String str, int key) {

        StringBuilder output = new StringBuilder();
        key = key % 26;

        for (int i = 0; i < str.length(); i++) {
            int newChar = str.charAt(i) + key;
            if (newChar > 122) {
                output.append((char) (96 + (newChar % 122)));
            } else {
                output.append((char) newChar);
            }

        }
        return output.toString();
    }

    public static void main(String[] args) {

        String str = "xyz";
        int key = 2;

        System.out.println(caesarCypherEncryptor(str, key));
    }

}
