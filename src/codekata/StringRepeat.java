package codekata;

public class StringRepeat {
        public static String repeatString(int n, String s) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                result.append(s);
            }
            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(repeatString(6, "I"));
            System.out.println(repeatString(5, "Hello"));
        }

}
