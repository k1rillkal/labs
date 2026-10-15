package laba2;
import sortirovki.Sorting;

import java.util.List;


public class InsertionSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            int current = nums.get(i);
            int j = i;
            while(j > 0 && nums.get(j-1) > current)
            {
                nums.set(j,nums.get(j-1));
                j--;
            }
            nums.set(j,current);

        }
    }
}