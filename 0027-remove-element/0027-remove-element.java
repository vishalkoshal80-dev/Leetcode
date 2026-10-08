class Solution {
    public int removeElement(int[] nums, int val) {
        int h = 0;
        for(int j = 0; j< nums.length; j++){
            if(nums[j] != val){
                nums[h] = nums[j];
                h++;
            }
        }
        return h;
    }
}