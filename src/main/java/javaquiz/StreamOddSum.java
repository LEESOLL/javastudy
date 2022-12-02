package javaquiz;

import java.util.ArrayList;
import java.util.List;

public class StreamOddSum {
    public static void main(String[] args) {
        List<Integer> oddNumList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 1) {
                oddNumList.add(i);
            }
        }

        int sum = oddNumList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
