
class Solution {
    public long maxAlternatingSum(int[] nums) {
     long[] sq = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sq[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(sq);
        long sum = 0;
        int n = nums.length;
        int k = (n + 1) / 2;
        for (int i = n - k; i < n; i++) {
            sum += sq[i];
        }
        for (int i = 0; i < n - k; i++) {
            sum -= sq[i];
        }
        return sum;                             
        }                             
        }                                                         
   
    