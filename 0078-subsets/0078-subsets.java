class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(0, nums, result, curr);
        return result;
        
    }
    public void solve(int index, int[] nums, List<List<Integer>> result, List<Integer> curr){
        if(index == nums.length){
            result.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[index]);
        solve(index+1, nums, result, curr);
        curr.remove(curr.size()-1);
        solve(index+1, nums, result, curr);
    }
}