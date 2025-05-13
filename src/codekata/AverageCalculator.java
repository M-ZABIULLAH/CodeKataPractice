package codekata;

public class AverageCalculator {

    public static double average(int[] array) {
        if (array.length == 0) return 0;

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Average: " + average(numbers));

        int[] emptyArray = {};
        System.out.println("Average of empty array: " + average(emptyArray));
    }
}
