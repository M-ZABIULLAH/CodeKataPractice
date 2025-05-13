package codekata;

public class FirstNonRepeating {

    public static String firstNonRepeatingLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && Character.toLowerCase(str.charAt(j)) == Character.toLowerCase(current)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return String.valueOf(current);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("stress"));
        System.out.println(firstNonRepeatingLetter("sTreSS"));
        System.out.println(firstNonRepeatingLetter("aabbcc"));
    }
}
