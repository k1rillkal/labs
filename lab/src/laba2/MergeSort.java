package laba2;
import sortirovki.Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sorting<Integer>
{
    private void slice(List<Integer> nums, int start, int end) {
        if (start >= end)
            return;

        int middle = (start+end ) / 2;
        slice(nums,start,middle);
        slice(nums,middle+1,end);
        merge(nums,start,middle,end);
    }

    private void merge(List<Integer> nums, int start, int middle, int end)
    {
        int i = start;
        int j = middle+1;
        List<Integer> arr = new ArrayList<>();
        while (i <= middle && j<=end)
        {
            if (nums.get(i) <= nums.get(j))
            {
                arr.add(nums.get(i));
                i++;
            }else
            {
                arr.add(nums.get(j));
                j++;
            }
        }

        for ( int ii = i ;  ii<= middle; ii++)
        {
            arr.add(nums.get(ii));
        }
        for (int jj = j; jj <= end; jj++)
        {
            arr.add(nums.get(jj));
        }
        for (int g = 0; g < arr.size(); g++)
        {
            nums.set(start + g, arr.get(g));
        }

    }

    @Override
    public void sort(List<Integer> nums) {

        slice(nums, 0, nums.size() - 1);
    }

}
