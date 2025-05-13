package codekata;

public class NarcissisticNumber {
    public static boolean isNarcissistic(int number) {

        String numStr = Integer.toString(number);
        int numDigits = numStr.length();
        int sum = 0;


        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1652));
        System.out.println(isNarcissistic(9474));
    }
}

