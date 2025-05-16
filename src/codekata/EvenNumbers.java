package codekata;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static int[] evenNumbers(int[] number, int n){
        List<Integer> evens = new ArrayList<>();

        for (int num : number){
            if (num % 2 == 0){
                evens.add(num);
            }
        }

        List<Integer> listNEvens = evens.subList(evens.size() - n, evens.size());{
            int[] result = new int[listNEvens.size()];
            for (int i = 0; i < listNEvens.size(); i++) {
                result[i] = listNEvens.get(i);
            }
            return result;

        }

    }
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = evenNumbers(input, 2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }


}
