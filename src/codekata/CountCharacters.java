package codekata;

public class CountCharacters {
    public static int countCharacters(String str, char ch) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            System.out.println(countCharacters("hello", 'l'));
            System.out.println(countCharacters("banana", 'a'));
            System.out.println(countCharacters("Java", 'x'));
        }
    }

