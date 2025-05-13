package codekata;

public class SumArrays {

    public static double sum(double[] numbers) {
        double total = 0.0;
        for (double num : numbers){
            total += num;
        }
        return total;
    }
    public static void main(String[] args){
        System.out.println(sum(new double[]{1, 5.2, 4, 0, -1}));
        System.out.println(sum(new double[]{}));
        System.out.println(sum(new double[]{-2.398}));
    }
}