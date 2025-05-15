import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static int [] removeDuplicates(int[] input) {
            List<Integer> resultList = new ArrayList<>();

            for (int num : input) {
                if (!resultList.contains(num)) {
                    resultList.add(num);
                }
            }

            int[] resultArray = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                resultArray[i] = resultList.get(i);
            }

            return resultArray;
        }

        public static void main(String[] args) {
            int[] input = {1, 2, 1, 1, 3, 2};
            int[] output = removeDuplicates(input);

            for (int num : output) {
                System.out.print(num + " ");
            }
        }
    }
