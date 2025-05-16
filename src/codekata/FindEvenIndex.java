package codekata;

public class FindEvenIndex {
public static int findEvenIndex(int[] arr){
    for (int i = 0; i < arr.length; i ++){
        int leftSum = 0;
        int rightSum = 0;

        for (int j = 0; j < i; j++){
            leftSum += arr[j];
        }
        for ( int j = i + 1; j < arr.length; j++){
            rightSum += arr[j];
        }
        if (leftSum == rightSum){
            return i;
        }
    }

    return -1;
}
public static void main( String[] arg){
        int[] input = {1, 2, 3, 4, 3, 2, 1};
        int index = findEvenIndex(input);
        System.out.println("Even index is: " + index);
}
}
