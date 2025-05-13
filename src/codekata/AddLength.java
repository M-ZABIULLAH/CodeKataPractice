package codekata;

import java.util.Arrays;

public class AddLength {

    public static String[] addLength(String str) {
        String[] words = str.split(" ");
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            result[i] = words[i] + " " + words[i].length();
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "you will win";
        String[] output = addLength(input);

        for (String word : output) {
            System.out.println(word);
        }
    }
}

