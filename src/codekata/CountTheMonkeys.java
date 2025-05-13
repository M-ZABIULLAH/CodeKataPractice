package codekata;

public class CountTheMonkeys {
    public static int[] countTheMonkeys(final int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            result[i] = i + 1;
        }
        return result;
    }
    public static void main(String[] args){
        int[] monkeys = countTheMonkeys (10);
        for (int num : monkeys){
            System.out.print(num + "");
        }
    }
}
