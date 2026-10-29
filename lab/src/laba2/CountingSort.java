package laba2;

import java.util.ArrayList;
import java.util.List;

public class CountingSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        int[] count = new int[128];
        for (int i = 0; i < nums.size(); i++) {
            count[nums.get(i)]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums.set(index,i);
                index++;
            }
        }
    }
}