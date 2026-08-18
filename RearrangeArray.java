import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] A) {
        
        int n = A.length;
        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for (int x : A) {
            if (x > 0) {
                ans[pos] = x;
                pos += 2;
            } else {
                ans[neg] = x;
                neg += 2;
            }
        }

        return ans;
    }
}