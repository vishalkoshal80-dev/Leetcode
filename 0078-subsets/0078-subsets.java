class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        bt(nums, 0, new ArrayList<>(), res);
        return res;
        
    }
    public void bt(int[] nums, int index, List<Integer> curr, List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int i = index; i<nums.length; i++){
            curr.add(nums[i]);
            bt(nums, i+1, curr, res);
            curr.remove(curr.size()-1);
        }
    }
}