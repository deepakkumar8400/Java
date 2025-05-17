class Solution {
    int sum=0;
    void helper(int [] nums,int i,int target,List<Integer> part,HashSet<List<Integer>> ans){
        if(i==nums.length){
            return;
        }
         if(sum==target){
                ans.add(new ArrayList(part));
                return;
        }
        if(sum>target) return;
        if(sum<=target){
            sum+=nums[i];
            part.add(nums[i]);
            helper(nums,i+1,target,part,ans);
            sum-=part.get(part.size()-1);
            part.remove(part.size()-1);
        }
        helper(nums,i+1,target,part,ans);
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans=new HashSet<>();
        List<List<Integer>> ans1=new ArrayList<>();
        List<Integer> part=new ArrayList<>();
        helper(nums,0,target,part,ans);
        for(List<Integer> x:ans){
            ans1.add(x);
        }

        return ans1;
        
    }
}