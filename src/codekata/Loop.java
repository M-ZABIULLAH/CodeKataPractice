package codekata;

import java.util.ArrayList;
import java.util.List;

public class Loop {
        public static List<Integer> CreateList(int number) {
            List<Integer> list = new ArrayList<>(number);

            for (int count = 1; count <= number; count ++)  {
                list.add(count);
            }
            return list;
        }

    }
