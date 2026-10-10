class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n -1;
        int ans = 0;
        while(left<right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int mw = w * h;
            ans = Math.max(ans,mw);
            if(height[left]<height[right]){
                left++;
            }else{
                right --;
            }

        }
        return ans;
         
    }
}