class Solution {
	public int search(int[] nums,int target){
		int i=findPartition(nums);
		int n=nums.length-1;
		if(i==n-1) return bs(nums,target,0,n-1);
		if(target>= nums[0] && target<= nums[i]) return bs(nums,target,0,i);
		else return bs(nums,target,i+1,n-1);
	}
	int bs(int[] nums,int target,int i, int j){
		int i=0,j=nums.length;
		while(i<j){
			int mid=i+(j-i)/2;
			if(nums[mid]==target) return mid;
			if(nums[mid]<target) i=mid+1;
			else j=mid-1;
		}
		return -1;
	}
	int findPartition(int[] nums){
		int i=0,n=nums.length-1;
		while(i<j){
			int mid=i+(j-i)/2;
			if(nums[mid]>nums[mid+1]) return mid;
			if(nums[mid]<nums[i]) j=mid;
			else i=mid;
		}
		return j;
	}
}
