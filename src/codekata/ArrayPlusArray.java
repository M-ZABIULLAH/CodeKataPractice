package codekata;

public class ArrayPlusArray {
    public static int arrayPlusArray( int[] arr1, int[] arr2){
        int sum = 0;
        for ( int i = 0; i < arr1.length; i ++){
            sum += arr1[i];
        }
        for ( int i = 0; i < arr2.length; i ++){
            sum += arr2[i];
        }
        return sum;
    }
    public static void main(String[] args){

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int sum = arrayPlusArray(a, b);
        System.out.println("sum of arrays : " + sum);
    }
}
