package laba2;

import java.math.BigInteger;
import java.util.List;

public class RadixSort implements Sorting<BigInteger> {
    @Override
    public void sort(List<BigInteger> nums) {
        for (int pos = 0; pos < 20; pos++) {
            BigInteger rank = BigInteger.TEN.pow(pos);
            int[] count = new int[10];

            for (int j = 0; j < nums.size(); j++) {
                BigInteger num = nums.get(j);
                int digit = num.divide(rank).mod(BigInteger.TEN).intValue();
                count[digit]++;
            }

            
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            
            BigInteger[] out = new BigInteger[nums.size()];

            
            for (int i = nums.size() - 1; i >= 0; i--) {
                BigInteger num = nums.get(i);

                int digit = num.divide(rank).mod(BigInteger.TEN).intValue();

                out[--count[digit]] = num;
            }

            
            for (int i = 0; i < nums.size(); i++) {
                nums.set(i, out[i]);
            }
        }
    }
}
