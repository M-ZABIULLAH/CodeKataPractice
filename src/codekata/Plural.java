package codekata;

public class Plural {
    public static boolean isPlural(double n) {
        return n != 1;
    }

    public static void main(String[] args) {
        System.out.println(isPlural(1));
        System.out.println(isPlural(0));
        System.out.println(isPlural(5));
        System.out.println(isPlural(1.0));
        System.out.println(isPlural(1.5));
    }
}
