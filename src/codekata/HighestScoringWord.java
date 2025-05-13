package codekata;

public class HighestScoringWord {

    public static String high(String s) {
        String[] words = s.split(" ");
        String highestWord = "";
        int highestScore = 0;

        for (String word : words) {
            int score = 0;

            for (char letter : word.toCharArray()) {
                score += letter - 'a' + 1;
            }

            if (score > highestScore) {
                highestScore = score;
                highestWord = word;
            }
        }

        return highestWord;
    }

    public static void main(String[] args) {
        System.out.println(high("abc def ghi"));
        System.out.println(high("aba zzz aaa"));
        System.out.println(high("hello world"));
    }
}
