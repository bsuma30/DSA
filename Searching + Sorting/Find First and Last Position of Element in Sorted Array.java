/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
         ans[0]=left(nums,target);
         ans[1]=right(nums,target);
        return ans;
    }
    public int left(int[]nums,int target){
        int l=0,r=nums.length-1;
        while(l<=r){
          int mid=l+(r-l)/2;
          if(nums[mid]>=target){
            r=mid-1;
          }
          else{
            l=mid+1;
          }
        }
        if(l>=nums.length||nums[l]!=target)
        return -1;

        return l;
    }

    public int right(int[]nums,int target){
        int l=0,r=nums.length-1;
        while(l<=r){
          int mid=l+(r-l)/2;
          if(nums[mid]>target){
            r=mid-1;
          }
          else{
            l=mid+1;
          }
        }
        if(r<0||nums[r]!=target)
        return -1;

        return r;
    }
}
