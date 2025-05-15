package codekata;

public class AgeDiff {

    public static String calculateAge(int birthYear, int targetYear) {
        int diff = targetYear - birthYear;

        if (diff == 0) {
            return "You were born this very year!";
        } else if (diff > 0) {
            return "You are " + diff + " " + (diff == 1 ? "year" : "years") + " old.";
        } else {
            diff = -diff;
            return "You will be born in " + diff + " " + (diff == 1 ? "year" : "years") + ".";
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateAge(2020, 2023)); // You are 3 years old.
        System.out.println(calculateAge(2023, 2023));
        System.out.println(calculateAge(2030, 2023));
        System.out.println(calculateAge(2023, 2024));
        System.out.println(calculateAge(2025, 2024));
    }
}

