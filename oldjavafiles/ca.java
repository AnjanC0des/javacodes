class Solution{
	List<List<Integer>> ans;
	List<Integer> worksol;
	int worksum;
    public List<List<Integer>> combinationSum(int[] candidates, int target){
		this.ans=new ArrayList<>();
		this.worksol=new ArrayList<>();
		this.worksum=0;
		func(candidates,target);
		return ans;
	}
	void func(int[] candidates,int target){
		if(worksum==target){
			ans.add(worksol);
			return;
		}
		if(worksum<target){
			for(int x:candidates){
				worksum+=x;
				worksol.add(x);
				func(candidates,target);
				worksum-=x;
				worksol.remove(worksol.size()-1);
			}
		}
	}
}
