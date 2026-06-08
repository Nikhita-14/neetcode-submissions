//1 Day Revision - Better Approach - Sorting and Searching
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] original = nums.clone();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left]+nums[right]==target){
                int i = linearSearchForward(original, nums[left]);
                int j = linearSearchBackward(original, nums[right]);
                return new int[]{Math.min(i,j), Math.max(i,j)};
            }else if(nums[left]+nums[right]>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
    }
    private int linearSearchForward(int[] arr, int key){
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==key) 
            return i;
        }
        return -1;
    }
    private int linearSearchBackward(int[] arr, int key){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
}
