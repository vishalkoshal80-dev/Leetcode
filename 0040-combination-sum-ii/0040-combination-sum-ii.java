class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solve(candidates,target,0,current,result);
        return result;
        
    }
    public void solve(int[] candidates, int target, int index, List<Integer> current,  List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=index; i<candidates.length; i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }else{
                if(candidates[i]>target){
                    break;
                }
            }
            current.add(candidates[i]);
            solve(candidates,target-candidates[i],i+1,current,result);
            current.remove(current.size()-1);
        }
    }
}